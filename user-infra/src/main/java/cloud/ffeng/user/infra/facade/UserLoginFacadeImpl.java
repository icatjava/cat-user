package cloud.ffeng.user.infra.facade;

import cloud.ffeng.cat.common.result.Result;
import cloud.ffeng.user.app.command.service.UserLoginAppService;
import cloud.ffeng.user.facade.api.UserLoginFacade;
import cloud.ffeng.user.facade.dto.UserLoginFlowDTO;
import cloud.ffeng.user.facade.request.UserLoginByPasswordRequest;
import cloud.ffeng.user.facade.request.UserLoginByPlatformAuthRequest;
import cloud.ffeng.user.facade.request.UserLoginByVerificationRequest;
import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 *
 * 暴露RPC服务
 *
 * @author cat-feng
 */
@DubboService(version = "1.0.0")
@AllArgsConstructor
public class UserLoginFacadeImpl implements UserLoginFacade {
    private final UserLoginAppService userLoginAppService;

    @Override
    public Result<UserLoginFlowDTO> loginByPassword(UserLoginByPasswordRequest request) {
        return Result.success(userLoginAppService.loginByPassword(request));
    }

    @Override
    public Result<UserLoginFlowDTO> loginByVerification(UserLoginByVerificationRequest request) {
        return Result.success(userLoginAppService.loginByVerification(request));
    }

    @Override
    public Result<UserLoginFlowDTO> loginByPlatformAuth(UserLoginByPlatformAuthRequest request) {
        return Result.success(userLoginAppService.loginByPlatformAuth(request));
    }
}

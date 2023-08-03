package cloud.ffeng.user.infra.facade;

import cloud.ffeng.cat.common.result.Result;
import cloud.ffeng.user.app.command.service.UserLoginAppService;
import cloud.ffeng.user.facade.api.UserLoginFacade;
import cloud.ffeng.user.facade.dto.UserLoginFlowDTO;
import cloud.ffeng.user.facade.request.UserLoginByPasswordRequest;
import lombok.AllArgsConstructor;

/**
 *
 * 暴露RPC服务
 *
 * @author cat-feng
 */
@AllArgsConstructor
public class UserLoginFacadeImpl implements UserLoginFacade {
    private final UserLoginAppService userLoginAppService;

}

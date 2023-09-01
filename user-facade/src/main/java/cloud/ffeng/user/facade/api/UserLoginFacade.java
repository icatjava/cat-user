package cloud.ffeng.user.facade.api;

import cloud.ffeng.cat.common.result.Result;
import cloud.ffeng.user.facade.dto.UserLoginFlowDTO;
import cloud.ffeng.user.facade.request.UserLoginByPasswordRequest;
import cloud.ffeng.user.facade.request.UserLoginByPlatformAuthRequest;
import cloud.ffeng.user.facade.request.UserLoginByVerificationRequest;

import javax.validation.Valid;

/**
 * @author cat-feng
 */
public interface UserLoginFacade {

    /**
     * 用户登录---用户名及密码
     *
     * @param request 用户登录请求信息
     * @return 登录请求结果信息
     */
    Result<UserLoginFlowDTO> loginByPassword(@Valid UserLoginByPasswordRequest request);

    /**
     * 用户登录---验证码登录
     *
     * @param request 用户验证码登录请求信息
     * @return 登录请求结果信息
     */
    Result<UserLoginFlowDTO> loginByVerification(@Valid UserLoginByVerificationRequest request);

    /**
     * 用户登录---平台授权登录
     *
     * @param request 用户平台授权登录请求信息
     * @return 登录请求结果信息
     */
    Result<UserLoginFlowDTO> loginByPlatformAuth(@Valid UserLoginByPlatformAuthRequest request);

}

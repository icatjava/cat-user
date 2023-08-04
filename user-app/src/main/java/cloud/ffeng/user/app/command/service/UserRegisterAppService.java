package cloud.ffeng.user.app.command.service;

import cloud.ffeng.user.facade.dto.UserInfoDTO;
import cloud.ffeng.user.facade.request.UserRegisterByUsernameRequest;
import cloud.ffeng.user.facade.request.UserRegisterByVerificationRequest;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * 用户注册应用服务
 *
 * @author cat-feng
 */
@Validated
public interface UserRegisterAppService {

    /**
     * 通过用户名注册
     *
     * @param request 用户名注册用户请求
     * @return 用户信息
     */
    UserInfoDTO registerByUsername(@Valid UserRegisterByUsernameRequest request);

    /**
     * 通过邮箱/手机验证码注册
     *
     * @param request 邮箱/手机验证码注册用户请求
     * @return 用户信息
     */
    UserInfoDTO registerByUsername(@Valid UserRegisterByVerificationRequest request);

}

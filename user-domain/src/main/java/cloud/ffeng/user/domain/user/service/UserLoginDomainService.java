package cloud.ffeng.user.domain.user.service;

import cloud.ffeng.user.common.enums.UserLoginMethodEnum;
import cloud.ffeng.user.domain.user.aggregate.UserLoginFlow;

/**
 * @author cat-feng
 */
public interface UserLoginDomainService {

    /**
     * 开始执行登录操作
     *
     * @param userId 用户ID
     * @return 用户Session
     */
    UserLoginFlow start(Long userId, UserLoginMethodEnum loginMethod);

    /**
     * 执行登录操作
     *
     * @param userLoginFlow 用户ID
     * @return 用户Session
     */
    UserLoginFlow doLogin(UserLoginFlow userLoginFlow);
}

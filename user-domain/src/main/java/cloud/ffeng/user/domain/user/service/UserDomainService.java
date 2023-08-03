package cloud.ffeng.user.domain.user.service;

import cloud.ffeng.user.domain.platform.entity.PlatformUser;
import cloud.ffeng.user.domain.user.entity.User;

/**
 * @author cat-feng
 */
public interface UserDomainService {

    /**
     * 创建一个新的用户
     *
     * @param user 待创建用户
     * @return 创建完成的用户
     */
    User createNewUser(PlatformUser user);
}

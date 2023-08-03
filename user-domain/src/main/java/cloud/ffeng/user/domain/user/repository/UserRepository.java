package cloud.ffeng.user.domain.user.repository;

import cloud.ffeng.user.domain.user.entity.User;

/**
 * @author cat-feng
 */
public interface UserRepository {

    /**
     * 获取用户信息
     *
     * @param userId 用户ID
     * @return 用户信息
     */
    User get(Long userId);

    /**
     * 根据登录关键字查询用户信息
     *
     * @param loginKey 支持用户名/邮箱/手机号
     * @return 用户信息
     */
    User getByLoginKey(String loginKey);

    User get(String platform, String platformUserId);


    /**
     * 保存一个用户
     *
     * @param user 用户
     * @return user
     */
    User save(User user);
}

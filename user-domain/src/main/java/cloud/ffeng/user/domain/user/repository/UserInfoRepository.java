package cloud.ffeng.user.domain.user.repository;

import cloud.ffeng.user.common.enums.PlatformEnum;
import cloud.ffeng.user.domain.user.entity.UserInfo;

/**
 * @author cat-feng
 */
public interface UserInfoRepository {

    /**
     * 获取用户信息
     *
     * @param userId 用户ID
     * @return 用户信息
     */
    UserInfo get(Long userId);

    /**
     * 根据登录关键字查询用户信息
     *
     * @param loginKey 支持用户名/邮箱/手机号
     * @return 用户信息
     */
    UserInfo getByLoginKey(String loginKey);

    UserInfo get(PlatformEnum platform, String platformUserId);

    /**
     * 保存一个用户
     *
     * @param userInfo 用户
     * @return user
     */
    UserInfo save(UserInfo userInfo);
}

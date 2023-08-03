package cloud.ffeng.user.domain.user.repository;

import cloud.ffeng.user.domain.user.aggregate.UserLoginFlow;

/**
 * @author cat-feng
 */
public interface UserLoginRepository {

    /**
     * 保存用户登录流水信息
     *
     * @param userLoginFlow 用户登录流水信息
     * @return 用户登录流水保存结果信息
     */
    UserLoginFlow save(UserLoginFlow userLoginFlow);
}

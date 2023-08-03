package cloud.ffeng.user.infra.repository;

import cloud.ffeng.user.domain.user.aggregate.UserLoginFlow;
import cloud.ffeng.user.domain.user.repository.UserLoginRepository;
import cloud.ffeng.user.infra.dal.dao.UserLoginDAO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

/**
 * @author cat-feng
 */
@Slf4j
@Repository
@AllArgsConstructor
public class UserLoginRepositoryImpl implements UserLoginRepository {
    private final UserLoginDAO userLoginDAO;

    /**
     * 保存操作 不具备 insert update 这种特殊技术语义
     *
     * @param userLoginFlow 用户登录流水信息
     * @return 用户登录流水
     */
    @Override
    public UserLoginFlow save(UserLoginFlow userLoginFlow) {
//        userLoginFlow.setGmtModified(new Date());

        if (userLoginDAO.countById(userLoginFlow.getLoginFlowId()) > 0) {
//            update
        } else {
//            userLoginFlow.setGmtCreate(new Date());
//            userLoginDAO.insert(userLoginFlow);
        }

        return userLoginFlow;
    }
}

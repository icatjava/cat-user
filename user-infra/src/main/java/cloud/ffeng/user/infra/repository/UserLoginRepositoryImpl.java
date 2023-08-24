package cloud.ffeng.user.infra.repository;

import cloud.ffeng.user.domain.user.aggregate.UserLoginFlow;
import cloud.ffeng.user.domain.user.repository.UserLoginRepository;
import cloud.ffeng.user.infra.dal.dao.UserLoginDAO;
import cloud.ffeng.user.infra.dal.dataobj.CuUserInfoDO;
import cloud.ffeng.user.infra.dal.dataobj.CuUserLoginFlowDO;
import cloud.ffeng.user.infra.repository.convert.UserInfoConvert;
import cloud.ffeng.user.infra.repository.convert.UserLoginFlowConvert;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Objects;

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
        CuUserLoginFlowDO cuUserLoginFlowDO = UserLoginFlowConvert.toDO(userLoginFlow);
        if (Objects.isNull(cuUserLoginFlowDO)) {
            return null;
        }

        if (userLoginDAO.countByUserLoginFlowId(cuUserLoginFlowDO.getUserId()) > 0) {
            cuUserLoginFlowDO.setUpdateTime(LocalDateTime.now().withNano(0));
            userLoginDAO.updateByPrimaryKey(cuUserLoginFlowDO);
        } else {
            cuUserLoginFlowDO.setCreateTime(LocalDateTime.now().withNano(0));
            cuUserLoginFlowDO.setUpdateTime(LocalDateTime.now().withNano(0));
            userLoginDAO.insert(cuUserLoginFlowDO);
        }

        return UserLoginFlowConvert.toEntity(cuUserLoginFlowDO);
    }
}

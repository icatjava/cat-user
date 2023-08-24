package cloud.ffeng.user.infra.repository.convert;
import java.time.LocalDateTime;

import cloud.ffeng.user.domain.base.valobj.IpAddress;
import cloud.ffeng.user.domain.user.aggregate.UserLoginFlow;
import cloud.ffeng.user.infra.dal.dataobj.CuUserLoginFlowDO;

import java.util.Objects;

/**
 * @author cat-feng
 */
public final class UserLoginFlowConvert {

    public static CuUserLoginFlowDO toDO(UserLoginFlow userLoginFlow) {
        if (Objects.isNull(userLoginFlow)) {
            return null;
        }
        CuUserLoginFlowDO cuUserLoginFlowDO = new CuUserLoginFlowDO();
        cuUserLoginFlowDO.setUserLoginFlowId(userLoginFlow.getUserLoginFlowId());
        cuUserLoginFlowDO.setUserId(userLoginFlow.getUserId());
        cuUserLoginFlowDO.setSessionId(userLoginFlow.getSessionId());
        cuUserLoginFlowDO.setIp(null);
        cuUserLoginFlowDO.setSource(null);
        cuUserLoginFlowDO.setCreateTime(userLoginFlow.getCreateTime());
        cuUserLoginFlowDO.setUpdateTime(userLoginFlow.getUpdateTime());
        return cuUserLoginFlowDO;
    }

    public static UserLoginFlow toEntity(CuUserLoginFlowDO cuUserLoginFlowDO) {
        if (Objects.isNull(cuUserLoginFlowDO)) {
            return null;
        }
        return new UserLoginFlow(
                cuUserLoginFlowDO.getUserLoginFlowId(),
                cuUserLoginFlowDO.getUserId(),
                cuUserLoginFlowDO.getSessionId(),
                IpAddress.of(cuUserLoginFlowDO.getIp()),
                null,
                null,
                cuUserLoginFlowDO.getCreateTime(),
                cuUserLoginFlowDO.getUpdateTime()
        );
    }

}

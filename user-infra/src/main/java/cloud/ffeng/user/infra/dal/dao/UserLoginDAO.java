package cloud.ffeng.user.infra.dal.dao;

import cloud.ffeng.user.infra.dal.dataobj.CuUserInfoDO;
import cloud.ffeng.user.infra.dal.dataobj.CuUserLoginFlowDO;
import cloud.ffeng.user.infra.dal.dataobj.UserLoginDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * @author cat-feng
 */
@Mapper
public interface UserLoginDAO {

    int deleteByPrimaryKey(Long userLoginFlowId);

    int insert(CuUserLoginFlowDO record);

    int updateByPrimaryKey(CuUserLoginFlowDO record);

    CuUserLoginFlowDO selectByPrimaryKey(Long userLoginFlowId);

    int countByUserLoginFlowId(Long userLoginFlowId);

}

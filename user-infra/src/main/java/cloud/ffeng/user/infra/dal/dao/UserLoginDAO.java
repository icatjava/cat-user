package cloud.ffeng.user.infra.dal.dao;

import cloud.ffeng.user.infra.dal.dataobj.UserLoginDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author cat-feng
 */
@Mapper
public interface UserLoginDAO {

    int insert(UserLoginDO record);

    int countById(Long loginFlowId);
}

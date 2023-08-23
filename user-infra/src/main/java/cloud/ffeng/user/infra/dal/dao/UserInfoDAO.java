package cloud.ffeng.user.infra.dal.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * @author cat-feng
 */
@Mapper
public interface UserInfoDAO {

    Map<String, Object> select();

    int countById(Long loginFlowId);
}

package cloud.ffeng.user.infra.dal.dao;

import cloud.ffeng.user.infra.dal.dataobj.CuUserInfoDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoDAO {

    int deleteByPrimaryKey(Long userId);

    int insert(CuUserInfoDO record);

    int updateByPrimaryKey(CuUserInfoDO record);

    int countByUserId(Long userId);

    CuUserInfoDO selectByPrimaryKey(Long userId);

    CuUserInfoDO selectByEmail(String email);

    CuUserInfoDO selectByUsername(String username);

    CuUserInfoDO selectByPhone(String phone);

}
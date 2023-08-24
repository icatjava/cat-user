package cloud.ffeng.user.infra.repository;

import java.time.LocalDateTime;

import cloud.ffeng.user.common.enums.PlatformEnum;
import cloud.ffeng.user.domain.user.entity.UserInfo;
import cloud.ffeng.user.domain.user.repository.UserInfoRepository;
import cloud.ffeng.user.infra.dal.dao.UserInfoDAO;
import cloud.ffeng.user.infra.dal.dataobj.CuUserInfoDO;
import cloud.ffeng.user.infra.repository.convert.UserInfoConvert;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

import java.util.Objects;

/**
 * @author cat-feng
 */
@Slf4j
@Repository
@AllArgsConstructor
public class UserInfoRepositoryImpl implements UserInfoRepository {
    private UserInfoDAO userInfoDAO;

    /**
     * 主键查询
     *
     * @param userId 用户ID
     * @return 用户实体
     */
    @Override
    public UserInfo get(Long userId) {
        if (Objects.isNull(userId)) {
            return null;
        }
        CuUserInfoDO cuUserInfoDO = userInfoDAO.selectByPrimaryKey(userId);
        return UserInfoConvert.toEntity(cuUserInfoDO);
    }

    @Override
    public UserInfo getByLoginKey(String loginKey) {
        if (StringUtils.isBlank(loginKey)) {
            return null;
        }
        // loginKey：username email phone
        CuUserInfoDO cuUserInfoDO = null;
        if (loginKey.contains("@")) { // 这里要用正则，不要学我
            cuUserInfoDO = userInfoDAO.selectByEmail(loginKey);
        }
        if (loginKey.charAt(0) >= 'a' && loginKey.charAt(0) <= 'z') {
            cuUserInfoDO = userInfoDAO.selectByUsername(loginKey);
        }
        if (loginKey.charAt(0) >= '0' && loginKey.charAt(0) <= '9') {
            cuUserInfoDO = userInfoDAO.selectByPhone(loginKey);
        }
        return UserInfoConvert.toEntity(cuUserInfoDO);
    }

    @Override
    public UserInfo get(PlatformEnum platform, String platformUserId) {
        return new UserInfo();
    }

    @Override
    public UserInfo save(UserInfo userInfo) {
        CuUserInfoDO cuUserInfoDO = UserInfoConvert.toDO(userInfo);
        if (Objects.isNull(cuUserInfoDO)) {
            return null;
        }

        if (userInfoDAO.countByUserId(userInfo.getUserId()) > 0) {
            cuUserInfoDO.setUpdateTime(LocalDateTime.now().withNano(0));
            userInfoDAO.updateByPrimaryKey(cuUserInfoDO);
        } else {
            cuUserInfoDO.setCreateTime(LocalDateTime.now().withNano(0));
            cuUserInfoDO.setUpdateTime(LocalDateTime.now().withNano(0));
            userInfoDAO.insert(cuUserInfoDO);
        }

        return UserInfoConvert.toEntity(cuUserInfoDO);
    }

}

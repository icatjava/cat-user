package cloud.ffeng.user.infra.repository.convert;

import cloud.ffeng.user.domain.user.entity.UserInfo;
import cloud.ffeng.user.infra.dal.dataobj.CuUserInfoDO;

import java.util.Objects;

/**
 * 做数据存储层到仓储透出的转换
 *
 * @author cat-feng
 */
public final class UserInfoConvert {

    public static UserInfo toEntity(CuUserInfoDO userInfoDO) {
        if (Objects.isNull(userInfoDO)) {
            return null;
        }
        return new UserInfo(
                userInfoDO.getUserId(),
                userInfoDO.getUsername(),
                userInfoDO.getEmail(),
                userInfoDO.getPhone(),
                userInfoDO.getEncryptedPwd(),
                userInfoDO.getNickname(),
                userInfoDO.getAvatarUrl(),
                userInfoDO.getCreateTime(),
                userInfoDO.getUpdateTime());
    }

    public static CuUserInfoDO toDO(UserInfo userInfo) {
        if (Objects.isNull(userInfo)) {
            return null;
        }
        CuUserInfoDO cuUserInfoDO = new CuUserInfoDO();
        cuUserInfoDO.setUserId(userInfo.getUserId());
        cuUserInfoDO.setUsername(userInfo.getUsername());
        cuUserInfoDO.setPhone(userInfo.getPhone());
        cuUserInfoDO.setEmail(userInfo.getEmail());
        cuUserInfoDO.setEncryptedPwd(userInfo.getEncryptedPwd());
        cuUserInfoDO.setNickname(userInfo.getNickname());
        cuUserInfoDO.setAvatarUrl(userInfo.getAvatarUrl());
        cuUserInfoDO.setCreateTime(userInfo.getCreateTime());
        cuUserInfoDO.setUpdateTime(userInfo.getUpdateTime());
        return cuUserInfoDO;

    }
}

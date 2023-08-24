package cloud.ffeng.user.domain.user.service.impl;

import cloud.ffeng.user.domain.platform.entity.PlatformUser;
import cloud.ffeng.user.domain.user.entity.UserInfo;
import cloud.ffeng.user.domain.user.factory.UserFactory;
import cloud.ffeng.user.domain.user.repository.UserInfoRepository;
import cloud.ffeng.user.domain.user.service.UserDomainService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author cat-feng
 */
@Service
@AllArgsConstructor
public class UserDomainServiceImpl implements UserDomainService {
    private final UserInfoRepository userInfoRepository;

    @Override
    public UserInfo createNewUser(PlatformUser platformUser) {
        // 通过平台用户构建一个新的用户
        UserInfo newUserInfo = UserFactory.buildNewUser(platformUser);

        // 保存用户
        return userInfoRepository.save(newUserInfo);
    }

}

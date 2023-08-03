package cloud.ffeng.user.domain.user.service.impl;

import cloud.ffeng.user.domain.platform.entity.PlatformUser;
import cloud.ffeng.user.domain.user.entity.User;
import cloud.ffeng.user.domain.user.factory.UserFactory;
import cloud.ffeng.user.domain.user.repository.UserRepository;
import cloud.ffeng.user.domain.user.service.UserDomainService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author cat-feng
 */
@Service
@AllArgsConstructor
public class UserDomainServiceImpl implements UserDomainService {
    private final UserRepository userRepository;

    @Override
    public User createNewUser(PlatformUser platformUser) {
        // 通过平台用户构建一个新的用户
        User newUser = UserFactory.buildNewUser(platformUser);

        // 保存用户
        return userRepository.save(newUser);
    }

}

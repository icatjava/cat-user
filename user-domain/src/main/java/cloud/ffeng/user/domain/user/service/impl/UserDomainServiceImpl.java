package cloud.ffeng.user.domain.user.service.impl;

import cloud.ffeng.user.domain.user.entity.User;
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
    public User createNewUser(User user) {
        return new User();
    }
}

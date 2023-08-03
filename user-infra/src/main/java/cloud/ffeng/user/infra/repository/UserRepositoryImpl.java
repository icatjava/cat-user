package cloud.ffeng.user.infra.repository;

import cloud.ffeng.user.domain.user.entity.User;
import cloud.ffeng.user.domain.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

/**
 * @author cat-feng
 */
@Slf4j
@Repository
@AllArgsConstructor
public class UserRepositoryImpl implements UserRepository {
    @Override
    public User get(Long userId) {
        return new User();
    }

    @Override
    public User getByLoginKey(String loginKey) {
        return new User();
    }

    @Override
    public User get(String platform, String platformUserId) {
        return new User();
    }

}

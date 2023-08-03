package cloud.ffeng.user.domain.user.service.impl;

import cloud.ffeng.user.common.enums.UserLoginMethodEnum;
import cloud.ffeng.user.domain.user.aggregate.UserLoginFlow;
import cloud.ffeng.user.domain.user.factory.UserLoginFactory;
import cloud.ffeng.user.domain.user.repository.UserLoginRepository;
import cloud.ffeng.user.domain.user.service.UserLoginDomainService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author cat-feng
 */
@Slf4j
@Service
@AllArgsConstructor
public class UserLoginDomainServiceImpl implements UserLoginDomainService {

    private final UserLoginRepository userLoginRepository;
    private final UserLoginFactory userLoginFactory;

    @Override
    public UserLoginFlow doLogin(UserLoginFlow userLoginFlow) {
        // 变更为成功状态
        userLoginFlow.changeStatus2Success();

        // 记录变更时间
        userLoginFlow.recordUpdateTime();

        return userLoginRepository.save(userLoginFlow);
    }

    @Override
    public UserLoginFlow start(Long userId, UserLoginMethodEnum loginMethod) {
        return userLoginFactory.createUserLoginFlow(userId, loginMethod);
    }

}

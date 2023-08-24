package cloud.ffeng.user.domain.user.factory;

import cloud.ffeng.user.common.enums.UserLoginMethodEnum;
import cloud.ffeng.user.common.enums.UserLoginStatusEnum;
import cloud.ffeng.user.domain.base.valobj.IpAddress;
import cloud.ffeng.user.domain.user.aggregate.UserLoginFlow;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author cat-feng
 */
@Component
public class UserLoginFactory {

    /**
     * 创建一个新的登录流水信息
     *
     * @param loginMethod 登录方式
     * @return 新的流水记录
     */
    public UserLoginFlow buildUserLoginFlow(Long userId, UserLoginMethodEnum loginMethod) {
        return new UserLoginFlow(
                1L,
                userId,
                "sessionId",
                new IpAddress(""),
                loginMethod,
                UserLoginStatusEnum.INIT,
                LocalDateTime.now().withNano(0),
                LocalDateTime.now().withNano(0)
        );
    }

}

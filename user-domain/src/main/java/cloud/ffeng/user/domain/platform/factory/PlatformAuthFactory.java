package cloud.ffeng.user.domain.platform.factory;

import cloud.ffeng.user.common.enums.PlatformAuthMethodEnum;
import cloud.ffeng.user.common.enums.PlatformAuthStatusEnum;
import cloud.ffeng.user.common.enums.PlatformEnum;
import cloud.ffeng.user.domain.base.component.SequenceGenerator;
import cloud.ffeng.user.domain.platform.aggregate.PlatformAuthFlow;

import java.time.LocalDateTime;

import static cloud.ffeng.user.common.enums.PlatformAuthMethodEnum.OAUTH2_CODE;
import static cloud.ffeng.user.common.enums.PlatformAuthStatusEnum.INIT;

/**
 * @author cat-feng
 */
public final class PlatformAuthFactory {

    /**
     *
     * 202301011212_10位序列_库表位_校验位
     * 14 + 1 + 10 + 2 + 1 = 28位
     *
     * @return
     */
    public static Long generateAuthFlowId() {
        return 1L;
    }

    public static PlatformAuthFlow buildNewAuthFlow(PlatformEnum platform) {
        Long authFlowId = PlatformAuthFactory.generateAuthFlowId();

        return new PlatformAuthFlow(
                authFlowId,
                null,
                platform,
                OAUTH2_CODE,
                null,
                INIT,
                LocalDateTime.now().withNano(0),
                LocalDateTime.now().withNano(0)
        );
    }

}

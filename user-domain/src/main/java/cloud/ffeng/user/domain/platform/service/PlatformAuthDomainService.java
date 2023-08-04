package cloud.ffeng.user.domain.platform.service;

import cloud.ffeng.user.common.enums.PlatformEnum;
import cloud.ffeng.user.domain.platform.aggregate.PlatformAuthFlow;
import cloud.ffeng.user.domain.platform.entity.PlatformUser;

/**
 * @author cat-feng
 */
public interface PlatformAuthDomainService {

    /**
     * 创建一条授权流水信息
     *
     * @param platform 授权对应的平台
     * @return 授权流水信息
     */
    PlatformAuthFlow createNewAuthFlow(PlatformEnum platform);

    /**
     * 创建一条授权流水信息
     *
     * @param authFlowId 授权流水ID
     * @param code       授权码
     * @return 授权用户信息
     */
    PlatformUser doAuth(Long authFlowId, String code);

}

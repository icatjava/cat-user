package cloud.ffeng.user.domain.platform.service.impl;

import cloud.ffeng.user.common.enums.PlatformEnum;
import cloud.ffeng.user.domain.platform.aggregate.PlatformAuthFlow;
import cloud.ffeng.user.domain.platform.entity.PlatformUser;
import cloud.ffeng.user.domain.platform.factory.PlatformAuthFactory;
import cloud.ffeng.user.domain.platform.repository.PlatformAuthRepository;
import cloud.ffeng.user.domain.platform.repository.PlatformConfigRepository;
import cloud.ffeng.user.domain.platform.repository.PlatformUserRepository;
import cloud.ffeng.user.domain.platform.service.PlatformAuthDomainService;
import cloud.ffeng.user.domain.platform.valobj.PlatformConfig;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author cat-feng
 */
@Slf4j
@Service
@AllArgsConstructor
public class PlatformAuthDomainServiceImpl implements PlatformAuthDomainService {
    private final PlatformAuthRepository platformAuthRepository;
    private final PlatformUserRepository platformUserRepository;
    private final PlatformConfigRepository platformConfigRepository;


    @Override
    public PlatformAuthFlow createNewAuthFlow(PlatformEnum platform) {
        PlatformAuthFlow platformAuthFlow = PlatformAuthFactory.buildNewAuthFlow(platform);

        PlatformConfig platformConfig = platformConfigRepository.get(platform);
        log.info("[PlatformAuth] start to new authFlow, platform: {}", platformConfig);

        if (platformAuthFlow.isOAuthCode()) {
            platformAuthFlow.generateOAuthCodeInfo(platformConfig);
            log.info("[PlatformAuth] generate OAuth2-CODE: {}", platformAuthFlow.getAuthByCodeInfo());
        }

        return platformAuthRepository.save(platformAuthFlow);
    }

    @Override
    public PlatformUser doAuth(Long authFlowId, String code) {
        return null;
    }
}

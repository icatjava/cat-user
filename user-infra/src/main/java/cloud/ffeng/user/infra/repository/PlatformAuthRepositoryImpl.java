package cloud.ffeng.user.infra.repository;

import cloud.ffeng.user.domain.platform.repository.PlatformAuthRepository;
import cloud.ffeng.user.domain.platform.aggregate.PlatformAuthFlow;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

/**
 * @author cat-feng
 */
@Slf4j
@Repository
@AllArgsConstructor
public class PlatformAuthRepositoryImpl implements PlatformAuthRepository {
    @Override
    public PlatformAuthFlow get(String platformAuthFlowId) {
        return new PlatformAuthFlow();
    }

}

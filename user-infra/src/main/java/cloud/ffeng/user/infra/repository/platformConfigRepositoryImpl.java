package cloud.ffeng.user.infra.repository;

import cloud.ffeng.user.common.enums.PlatformEnum;
import cloud.ffeng.user.domain.platform.repository.PlatformConfigRepository;
import cloud.ffeng.user.domain.platform.valobj.PlatformConfig;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

/**
 * @author cat-feng
 */
@Slf4j
@Repository
@AllArgsConstructor
public class platformConfigRepositoryImpl implements PlatformConfigRepository {
    @Override
    public PlatformConfig get(PlatformEnum platform) {
        return new PlatformConfig();
    }
}

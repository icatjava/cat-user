package cloud.ffeng.user.infra.component;

import cloud.ffeng.user.domain.base.enums.CacheKey;
import cloud.ffeng.user.domain.base.enums.LockKey;
import cloud.ffeng.user.domain.base.interfaces.CacheService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author cat-feng
 */
@Slf4j
@Component
@AllArgsConstructor
public class CacheServiceImpl implements CacheService {

    @Override
    public void save(CacheKey cacheKey, String content) {

    }

    @Override
    public boolean lock(LockKey lockKey, String uniqueKey) {
        return false;
    }
}

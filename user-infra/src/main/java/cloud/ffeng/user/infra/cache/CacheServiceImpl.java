package cloud.ffeng.user.infra.cache;

import cloud.ffeng.user.domain.base.enums.CacheKey;
import cloud.ffeng.user.domain.base.enums.LockKey;
import cloud.ffeng.user.domain.base.interfaces.CacheService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cat-feng
 */
@Slf4j
@Service
@AllArgsConstructor
public class CacheServiceImpl implements CacheService {

    //    RedistTemplate ?
    static Map<String, String> map = new HashMap<>();

    @Override
    public void save(CacheKey cacheKey, String content) {

    }

    @Override
    public boolean lock(LockKey lockKey, String uniqueKey) {
        return true;
    }
}

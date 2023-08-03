package cloud.ffeng.user.domain.base.interfaces;

import cloud.ffeng.user.domain.base.enums.CacheKey;
import cloud.ffeng.user.domain.base.enums.LockKey;

/**
 * @author cat-feng
 */
public interface CacheService {
    /**
     * 保存数据到缓存中
     *
     * @param cacheKey key
     * @param content  内容
     */
    void save(CacheKey cacheKey, String content);

    /**
     * 锁
     *
     * @param lockKey   加锁的KEY
     * @param uniqueKey 唯一值
     * @return 是否成功
     */
    boolean lock(LockKey lockKey, String uniqueKey);

}

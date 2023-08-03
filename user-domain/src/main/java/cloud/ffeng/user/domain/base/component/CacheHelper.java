package cloud.ffeng.user.domain.base.component;

import cloud.ffeng.user.domain.base.enums.CacheKey;
import cloud.ffeng.user.domain.base.enums.LockKey;
import cloud.ffeng.user.domain.base.interfaces.CacheService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.function.Supplier;

/**
 * @author cat-feng
 */
@Component
public final class CacheHelper implements ApplicationContextAware {

    private static ApplicationContext CONTEXT;

    private static CacheService cacheService() {
        return CONTEXT.getBean(CacheService.class);
    }


    /**
     * 保存数据到缓存中
     *
     * @param cacheKey key
     * @param content  内容
     */
    public static void save(CacheKey cacheKey, String content) {
        cacheService().save(cacheKey, content);
    }

    /**
     * 锁
     *
     * @param lockKey   加锁的KEY
     * @param uniqueKey 唯一值
     */
    public static <T> T lockExec(LockKey lockKey, String uniqueKey, Supplier<T> exec) {
        if (cacheService().lock(lockKey, uniqueKey)) {
            return exec.get();
        }
        return null;
    }

    /**
     * 锁
     *
     * @param lockKey   加锁的KEY
     * @param uniqueKey 唯一值
     */
    public static boolean lock(LockKey lockKey, String uniqueKey) {
        return cacheService().lock(lockKey, uniqueKey);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        CONTEXT = applicationContext;
    }
}

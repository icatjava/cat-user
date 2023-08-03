package cloud.ffeng.user.infra.cache;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author cat-feng
 */
@Configuration
public class RedisConfig {

    @Bean
    public Object redisTemplate() {
        return new Object();
    }
}

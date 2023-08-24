package cloud.ffeng.user.app.support;

import cloud.ffeng.cat.common.util.UuidUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.function.Supplier;

/**
 * @author cat-feng
 */
@Slf4j
@Component
public final class TxHelper implements ApplicationContextAware {
    public static TransactionTemplate transactionTemplate;

    public static <T> T exec(Supplier<T> bizExec) {
        log.info("exec tx start, traceId: {}", UuidUtil.generateUuid());
        return transactionTemplate.execute(status -> bizExec.get());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        transactionTemplate = applicationContext.getBean(TransactionTemplate.class);
    }
}

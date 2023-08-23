package cloud.ffeng.user.app.support;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.function.Supplier;

/**
 * @author cat-feng
 */
public final class TxHelper implements ApplicationContextAware {

    public static TransactionTemplate transactionTemplate;

    public static <T> T exec(Supplier<T> exec) {
        return transactionTemplate.execute(status -> exec.get());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        transactionTemplate = applicationContext.getBean(TransactionTemplate.class);
    }
}

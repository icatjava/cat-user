package cloud.ffeng.user.infra.repository;

import cloud.ffeng.user.domain.verification.aggregate.VerificationFlow;
import cloud.ffeng.user.domain.verification.repository.VerificationFlowRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

/**
 * @author cat-feng
 */
@Slf4j
@Repository
@AllArgsConstructor
public class VerificationFlowRepositoryImpl implements VerificationFlowRepository {
    @Override
    public VerificationFlow get(Long flowId) {
        return new VerificationFlow();
    }
}

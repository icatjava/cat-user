package cloud.ffeng.user.domain.verification.repository;

import cloud.ffeng.user.domain.verification.aggregate.VerificationFlow;

/**
 * @author cat-feng
 */
public interface VerificationFlowRepository {


    /**
     *
     * @param flowId
     * @return
     */
    VerificationFlow get(Long flowId);

}

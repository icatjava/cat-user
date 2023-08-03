package cloud.ffeng.user.domain.verification.service.impl;

import cloud.ffeng.user.common.enums.VerificationMethodEnum;
import cloud.ffeng.user.domain.verification.aggregate.VerificationFlow;
import cloud.ffeng.user.domain.verification.service.VerificationDomainService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author cat-feng
 */
@Slf4j
@Service
@AllArgsConstructor
public class VerificationDomainServiceImpl implements VerificationDomainService {

    @Override
    public VerificationFlow createNewFlow(VerificationMethodEnum verificationMethod, Long userId) {
        return null;
    }

    @Override
    public boolean validateCode(String verificationFlowId, String verificationCode) {
        return false;
    }
}

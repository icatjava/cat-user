package cloud.ffeng.user.domain.verification.service;

import cloud.ffeng.user.common.enums.VerificationMethodEnum;
import cloud.ffeng.user.domain.verification.aggregate.VerificationFlow;

/**
 * @author cat-feng
 */
public interface VerificationDomainService {

    /**
     * 创建一个新的校验信息
     *
     * @param verificationMethod 校验方式
     * @return 校验流水
     */
    default VerificationFlow createNewFlow(VerificationMethodEnum verificationMethod) {
        return this.createNewFlow(verificationMethod, null);
    }

    /**
     * 创建一个新的校验信息
     *
     * @param verificationMethod 校验方式
     * @param userId             userId
     * @return 校验流水
     */
    VerificationFlow createNewFlow(VerificationMethodEnum verificationMethod, Long userId);

    /**
     * 创建一个新的校验信息
     *
     * @param verificationFlowId 校验流水ID
     * @param verificationCode   校验编码
     * @return 校验流水
     */
    boolean validateCode(String verificationFlowId, String verificationCode);

}

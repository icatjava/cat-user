package cloud.ffeng.user.domain.verification.aggregate;

import cloud.ffeng.user.common.enums.VerificationMethodEnum;
import lombok.Getter;

/**
 * 用户登录的流水信息
 *
 * @author cat-feng
 */
@Getter
public class VerificationFlow {

    /**
     * 校验流水ID
     */
    private Long verificationFlowId;

    /**
     * 校验方式
     */
    private VerificationMethodEnum verificationMethod;

    /**
     * 验证码值
     */
    private String verificationCode;
}

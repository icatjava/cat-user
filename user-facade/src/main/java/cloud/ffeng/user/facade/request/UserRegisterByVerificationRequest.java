package cloud.ffeng.user.facade.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * @author cat-feng
 */
@Data
public class UserRegisterByVerificationRequest implements Serializable {
    private static final long serialVersionUID = 7213370779456487177L;

    /**
     * 用户邮箱/手机号
     */
    @NotBlank(message = "注册邮箱/手机号不能为空")
    private String loginKey;

    /**
     * 验证流水ID
     */
    @NotBlank(message = "验证流水ID不能为空")
    @Pattern(regexp = "[0-9]{18,19}")
    private String verificationFlowId;

    /**
     * 验证码值
     */
    @NotBlank(message = "验证码不能为空")
    private String verificationCode;

}

package cloud.ffeng.user.facade.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author cat-feng
 */
@Data
public class UserLoginByVerificationRequest implements Serializable {
    private static final long serialVersionUID = -4511809691839022764L;

    /**
     * 登录识别Key<p/>
     * 允许两类：
     * <ul>
     *     <li>1. 邮箱，规则为：以邮箱后缀结尾，如："aa@domain.com", "123@abc.domain.com"
     *     <li>2. 手机号，规则为：国家编码[+86](不填默认中国)，数字（国家编码时，11位， 其他允许5-20位），如："13512345678", "+8613512345678"
     * </ul>
     */
    @NotBlank(message = "邮箱/手机号不能为空")
    private String loginKey;

    /**
     * 验证码流水ID
     */
    private String verificationFlowId;

    /**
     * 验证码码值
     */
    @NotNull(message = "验证码信息不能为空")
    private String verificationCode;

}

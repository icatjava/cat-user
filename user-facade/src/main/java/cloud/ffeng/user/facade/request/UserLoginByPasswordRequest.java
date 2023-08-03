package cloud.ffeng.user.facade.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author cat-feng
 */
@Data
public class UserLoginByPasswordRequest implements Serializable {
    private static final long serialVersionUID = -3058430164665782510L;
    /**
     * 登录识别Key<p/>
     * 允许三类：
     * <ul>
     *     <li>1. 用户名，规则为：以字母开始（允许字母、数字、字符[_-.]）；如："cat.developer", "cat-developer"
     *     <li>2. 邮箱，规则为：以邮箱后缀结尾，如："aa@domain.com", "123@abc.domain.com"
     *     <li>3. 手机号，规则为：国家编码[+86](不填默认中国)，数字（国家编码时，11位， 其他允许5-20位），如："13512345678", "+8613512345678"
     * </ul>
     */
    @NotBlank(message = "用户名/邮箱/手机号不能为空")
    private String loginKey;

    /**
     * 已加密的密码数据
     * <p>
     * RSA 前端公钥加密，后端私钥解密
     */
    private String passwordEncrypted;

    /**
     * 验证码流水ID
     */
    private String verificationFlowId;

    /**
     * 验证码码值
     */
    private String verificationCode;
}

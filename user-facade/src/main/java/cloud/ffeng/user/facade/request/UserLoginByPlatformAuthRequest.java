package cloud.ffeng.user.facade.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * 通过平台授权登录
 *
 * @author cat-feng
 */
@Data
public class UserLoginByPlatformAuthRequest implements Serializable {
    private static final long serialVersionUID = -8252973311669484301L;

    /**
     * 平台授权流水ID
     */
    @NotBlank(message = "平台授权流水ID不能为空")
    private String platformAuthFlowId;

    /**
     * 平台授权方式
     * @see cloud.ffeng.user.common.enums.PlatformAuthMethodEnum
     */
    private String platformAuthMethod;

    /**
     * 平台授权码
     */
    private String platformAuthCode;

}

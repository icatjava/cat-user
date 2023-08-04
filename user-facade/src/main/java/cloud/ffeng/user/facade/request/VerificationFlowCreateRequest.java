package cloud.ffeng.user.facade.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author cat-feng
 */
@Data
public class VerificationFlowCreateRequest implements Serializable {
    private static final long serialVersionUID = 7070918094088092406L;


    /**
     * 校验类型
     *
     * @see cloud.ffeng.user.common.enums.VerificationMethodEnum
     */
    @NotBlank(message = "验证码类型不能为空")
    private String verificationType;

}

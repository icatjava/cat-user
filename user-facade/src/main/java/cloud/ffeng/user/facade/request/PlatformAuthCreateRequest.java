package cloud.ffeng.user.facade.request;

import cloud.ffeng.user.common.enums.PlatformEnum;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * @author cat-feng
 */
@Data
public class PlatformAuthCreateRequest implements Serializable {
    private static final long serialVersionUID = 332703034145169395L;

    /**
     * 平台编码
     *
     * @see PlatformEnum
     */
    @NotBlank(message = "平台编码不能为空")
    private String platformCode;

}

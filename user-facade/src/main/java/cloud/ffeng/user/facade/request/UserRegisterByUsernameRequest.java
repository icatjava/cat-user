package cloud.ffeng.user.facade.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * @author cat-feng
 */
@Data
public class UserRegisterByUsernameRequest implements Serializable {
    private static final long serialVersionUID = 3886728439795422031L;

    /**
     * 用户名
     * 要求：用户名必须为：字母开头，支持A-Za-z0-9.-_@
     */
    @NotBlank(message = "用户名不能为空")
    @Pattern(regexp = "[A-Za-z][A-Za-z0-9_.-]{3,32}", message = "用户名格式不正确，仅支持字母、数字、短横线、下划线、点")
    private String username;

    /**
     * 前端加密后的密码
     */
    @NotBlank
    private String passwordEncrypted;

}

package cloud.ffeng.user.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author cat-feng
 */
@Getter
@AllArgsConstructor
public enum UserLoginMethodEnum {
    PASSWORD(100, "PASSWORD", "密码"),
    PLATFORM(200, "PLATFORM", "平台"),
    VERIFICATION(300, "VERIFICATION", "验证码"),
    ;
    private final int status;
    private final String code;
    private final String desc;
}

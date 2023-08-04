package cloud.ffeng.user.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author cat-feng
 */
@Getter
@AllArgsConstructor
public enum VerificationMethodEnum {
    SMS(100, "MOBILE", "短信"),
    EMAIL(200, "EMAIL", "邮箱"),
    PICTURE(300, "PICTURE", "图片"),
    ;
    private final int type;
    private final String code;
    private final String desc;
}

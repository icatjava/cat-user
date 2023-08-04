package cloud.ffeng.user.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 平台授权方式
 *
 * @author cat-feng
 */
@Getter
@AllArgsConstructor
public enum PlatformAuthMethodEnum {

    OAUTH2_CODE(1000, "OAUTH2_CODE", "授权码方式"),
    OAUTH2_PASSWORD(2000, "OAUTH2_PASSWORD", "密码授权方式"),
    ;

    private final int type;
    private final String code;
    private final String desc;
}

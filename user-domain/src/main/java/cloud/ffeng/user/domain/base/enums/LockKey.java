package cloud.ffeng.user.domain.base.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author cat-feng
 */
@Getter
@AllArgsConstructor
public enum LockKey {
    /**
     * 用户登录
     */
    USER_LOGIN(1000000000, "USER_LOGIN", "用户登录"),
    PLATFORM_AUTH(1000000000, "USER_LOGIN", "用户登录"),
    ;

    private final int type;
    private final String code;
    private final String desc;

}

package cloud.ffeng.user.domain.base.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author cat-feng
 */
@Getter
@AllArgsConstructor
public enum CacheKey {
    /**
     * 用户ID
     */
    USER_ID(1000000000, "USER_ID", "用户ID"),
    USER_LOGIN_FLOW_ID(1000000001, "USER_LOGIN_FLOW_ID", "用户登录流水ID"),
            ;

    private final int type;
    private final String code;
    private final String desc;

}

package cloud.ffeng.user.domain.base.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static cloud.ffeng.user.domain.base.enums.SequenceType.SequenceRule.FLOW_ID;
import static cloud.ffeng.user.domain.base.enums.SequenceType.SequenceRule.UID;

/**
 * @author cat-feng
 */
@Getter
@AllArgsConstructor
public enum SequenceType {
    /**
     * 用户ID
     */
    USER_ID(1000000000, "USER_ID", "用户ID", UID),
    USER_LOGIN_FLOW_ID(1000000001, "USER_LOGIN_FLOW_ID", "用户登录流水ID", FLOW_ID),
    ;

    private final int type;
    private final String code;
    private final String desc;
    private final SequenceRule rule;


    public enum SequenceRule {
        UID,
        FLOW_ID,
        SHARDING
    }

}

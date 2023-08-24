package cloud.ffeng.user.infra.dal.dataobj;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 用户登录流水记录
 * <p>
 * cu_user_login_flow
 */
@Data
public class CuUserLoginFlowDO implements Serializable {
    private static final long serialVersionUID = -1428948313341101541L;
    /**
     * 登录记录ID
     */
    private Long userLoginFlowId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 会话ID
     */
    private String sessionId;

    /**
     * ip
     */
    private String ip;

    /**
     * 来源
     */
    private String source;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

}
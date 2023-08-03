package cloud.ffeng.user.domain.platform.aggregate;

import cloud.ffeng.user.common.enums.*;
import cloud.ffeng.user.domain.base.valobj.IpAddress;
import cloud.ffeng.user.domain.user.entity.User;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * 用户登录的流水信息
 *
 * @author cat-feng
 */
@Getter
public class PlatformAuthFlow {

    /**
     * 授权流水ID
     */
    private Long platformAuthFlowId;

    /**
     * 登录流水ID
     */
    private Long loginFlowId;

    /**
     * 授权方式
     */
    private PlatformAuthMethodEnum authMethod;

    /**
     * 平台授权状态
     */
    private PlatformAuthStatusEnum authStatus;

    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}

package cloud.ffeng.user.domain.user.aggregate;

import cloud.ffeng.user.common.enums.UserLoginMethodEnum;
import cloud.ffeng.user.common.enums.UserLoginStatusEnum;
import cloud.ffeng.user.domain.base.valobj.IpAddress;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * 用户登录的流水信息
 *
 * @author cat-feng
 */
@Getter
@AllArgsConstructor
public class UserLoginFlow {

    /**
     * 登录流水ID
     */
    private Long userLoginFlowId;

    /**
     * 当前登录用户ID
     */
    private Long userId;

    /**
     * sessionId
     */
    private String sessionId;

    /**
     * 登录IP地址
     */
    private IpAddress loginIpAddress;

    /**
     * 登录方式
     */
    private UserLoginMethodEnum loginMethod;

    /**
     * 登录状态
     */
    private UserLoginStatusEnum loginStatus;


    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    /**
     * 登录成功状态变更
     */
    public void changeStatus2Success() {
        this.loginStatus = UserLoginStatusEnum.SUCCESS;
    }

    /**
     * 登录成功状态变更
     */
    public void recordUpdateTime() {
        this.updateTime = LocalDateTime.now().withNano(0);
    }
}

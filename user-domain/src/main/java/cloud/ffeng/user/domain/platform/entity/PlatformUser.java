package cloud.ffeng.user.domain.platform.entity;

import cloud.ffeng.user.common.enums.PlatformEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 平台用户
 *
 * @author cat-feng
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PlatformUser {

    /**
     * 平台用户ID
     */
    private String platformUserId;

    /**
     * 对应到的是绑定的用户ID
     */
    private Long userId;

    /**
     * 对应的平台
     */
    private PlatformEnum platform;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 唯一值
     *
     * @return 唯一键
     */
    public String uniqueKey() {
        return platform + platformUserId;
    }
}

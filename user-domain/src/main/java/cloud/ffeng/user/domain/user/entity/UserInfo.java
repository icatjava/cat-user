package cloud.ffeng.user.domain.user.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author cat-feng
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {

    /**
     * UID
     */
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 密码（已加密）
     */
    private String encryptedPwd;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 头像地址：OSS
     */
    private String avatarUrl;

    /**
     * 创建及更新时间
     */
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    public boolean passwordIsValid(String passwordEncrypted) {
        return true;
    }

}

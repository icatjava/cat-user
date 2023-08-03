package cloud.ffeng.user.domain.user.entity;

import cloud.ffeng.user.domain.base.component.SequenceGenerator;
import cloud.ffeng.user.domain.base.enums.SequenceType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import static cloud.ffeng.user.common.util.IdCheckUtil.computeCheckSum;

/**
 * @author cat-feng
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {

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
    private String mobile;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 密码
     */
    private String password;

    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    public boolean passwordIsValid(String passwordEncrypted) {
        return true;
    }

}

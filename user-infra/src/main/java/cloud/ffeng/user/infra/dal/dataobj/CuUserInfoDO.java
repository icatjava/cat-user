package cloud.ffeng.user.infra.dal.dataobj;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 用户信息
 * cu_user_info
 */
@Data
public class CuUserInfoDO implements Serializable {
    private static final long serialVersionUID = -1428948313341101541L;
    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 密码（已加密）
     */
    private String encryptedPwd;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 头像地址
     */
    private String avatarUrl;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

}
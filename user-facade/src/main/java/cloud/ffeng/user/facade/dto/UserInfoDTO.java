package cloud.ffeng.user.facade.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author cat-feng
 */
@Data
public class UserInfoDTO implements Serializable {
    private static final long serialVersionUID = 2810296049005357546L;

    /**
     * UID
     */
    private String userId;

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

    private String createTime;
    private String updateTime;
}

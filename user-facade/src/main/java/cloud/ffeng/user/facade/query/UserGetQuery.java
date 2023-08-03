package cloud.ffeng.user.facade.query;

import lombok.Data;

import java.io.Serializable;

/**
 * @author cat-feng
 */
@Data
public class UserGetQuery implements Serializable {
    private static final long serialVersionUID = -6384553414480229486L;

    /**
     * 用户ID
     */
    private String userId;

}

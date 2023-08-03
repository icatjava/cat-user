package cloud.ffeng.user.facade.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * POJO 什么是POJO
 *
 * @author cat-feng
 */
@Data
public class UserLoginFlowDTO implements Serializable {
    private static final long serialVersionUID = -5731241611987217520L;

    /**
     * Long 在某些语言里面不能兼容
     */
    private String loginFlowId;
    //....
}

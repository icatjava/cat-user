package cloud.ffeng.user.facade.dto;

import cloud.ffeng.user.common.enums.PlatformAuthMethodEnum;
import cloud.ffeng.user.common.enums.PlatformAuthStatusEnum;
import cloud.ffeng.user.common.enums.PlatformEnum;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 平台授权流水信息
 *
 * @author cat-feng
 */
@Data
public class PlatformAuthDTO implements Serializable {
    private static final long serialVersionUID = 171079967567704207L;

    /**
     * 授权流水ID
     */
    private String platformAuthFlowId;

    /**
     * 登录流水ID
     */
    private String loginFlowId;
    /**
     * 平台编码
     *
     * @see PlatformEnum
     */
    private String platformCode;

    /**
     * @see PlatformAuthMethodEnum
     */
    private String authMethod;

    /**
     * 通过Code码授权时的数据
     */
    private PlatformAuthByCodeDTO authByCodeInfo;

    /**
     * 平台授权状态
     * @see PlatformAuthStatusEnum
     */
    private String authStatus;


    private LocalDateTime createTime;
    private LocalDateTime updateTime;


    @Data
    public static class PlatformAuthByCodeDTO {

        /**
         * 状态值
         * 拿来避免中间人攻击，记录成 auhtFlowId
         */
        private String state;
        /**
         * 客户端ID
         */
        private String clientId;
        /**
         * Scope
         */
        private String scope;
        /**
         * 授权地址：
         * <p>
         *  eg: https://github.com/login/oauth/authorize?client_id=123456789&redirect_url=%s&state=123&scope=USER
         */
        private String authUrl;
    }

}

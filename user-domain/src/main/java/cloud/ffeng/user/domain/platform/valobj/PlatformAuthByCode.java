package cloud.ffeng.user.domain.platform.valobj;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * OAuth2 -》 CODE授权方式
 *
 * @author cat-feng
 */
@Getter
@AllArgsConstructor
public class PlatformAuthByCode {

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
     * 重定向地址
     */
    private String redirectUrl;
    /**
     * Scope
     */
    private String scope;

    /**
     * 授权地址：
     * <p>
     * https://github.com/login/oauth/authorize?client_id=%s&redirect_url=%s&state=%s&scope=%s
     */
    private String authUrl;

}

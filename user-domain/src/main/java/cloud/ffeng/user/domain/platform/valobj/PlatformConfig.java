package cloud.ffeng.user.domain.platform.valobj;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author cat-feng
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PlatformConfig {

    private String appId;

    private String secrete;

    private String scope;

    private String requestUrl;

    private String callbackUrl;

    private String authTemplateUrl;

    //    ...

}

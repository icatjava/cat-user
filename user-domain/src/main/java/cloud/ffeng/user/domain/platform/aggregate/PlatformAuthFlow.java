package cloud.ffeng.user.domain.platform.aggregate;

import cloud.ffeng.user.common.enums.*;
import cloud.ffeng.user.domain.platform.valobj.PlatformAuthByCode;
import cloud.ffeng.user.domain.platform.valobj.PlatformConfig;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Objects;

import static cloud.ffeng.user.common.enums.PlatformAuthMethodEnum.OAUTH2_CODE;

/**
 * 用户登录的流水信息
 *
 * @author cat-feng
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PlatformAuthFlow {

    /**
     * 授权流水ID
     */
    private Long platformAuthFlowId;

    /**
     * 登录流水ID
     */
    private Long loginFlowId;

    /**
     * 对应平台
     */
    private PlatformEnum platform;

    /**
     * 授权方式
     */
    private PlatformAuthMethodEnum authMethod;

    /**
     * 通过Code码授权时的数据
     */
    private PlatformAuthByCode authByCodeInfo;

    /**
     * 平台授权状态
     */
    private PlatformAuthStatusEnum authStatus;

    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    public boolean isOAuthCode() {
        return Objects.equals(OAUTH2_CODE, this.authMethod);
    }


    public void generateOAuthCodeInfo(PlatformConfig platformConfig) {
        PlatformAuthByCode authByCode = new PlatformAuthByCode(
                this.platformAuthFlowId.toString(),
                platformConfig.getAppId(),
                platformConfig.getCallbackUrl(),
                platformConfig.getScope(),
                // client_id=%s&redirect_url=%s&state=%s&scope=%s
                String.format(platformConfig.getAuthTemplateUrl(),
                        platformConfig.getAppId(),
                        platformConfig.getCallbackUrl(),
                        this.platformAuthFlowId.toString(),
                        platformConfig.getScope()
                )
        );
    }
}

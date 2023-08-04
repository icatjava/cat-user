package cloud.ffeng.user.app.command.service;

import cloud.ffeng.user.facade.dto.PlatformAuthDTO;
import cloud.ffeng.user.facade.request.PlatformAuthCreateRequest;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * 平台授权应用服务
 *
 * @author cat-feng
 */
@Validated
public interface PlatformAuthAppService {

    /**
     * 平台授权流水创建
     *
     * @param request 平台授权流水创建请求
     * @return 授权流水信息
     */
    PlatformAuthDTO createAuthFlow(@Valid PlatformAuthCreateRequest request);

}

package cloud.ffeng.user.app.command.service.impl;

import cloud.ffeng.cat.common.util.AssertUtil;
import cloud.ffeng.user.app.command.assembler.PlatformAuthAssembler;
import cloud.ffeng.user.app.command.service.PlatformAuthAppService;
import cloud.ffeng.user.common.enums.PlatformEnum;
import cloud.ffeng.user.domain.platform.aggregate.PlatformAuthFlow;
import cloud.ffeng.user.domain.platform.service.PlatformAuthDomainService;
import cloud.ffeng.user.domain.platform.service.impl.PlatformAuthDomainServiceImpl;
import cloud.ffeng.user.facade.dto.PlatformAuthDTO;
import cloud.ffeng.user.facade.request.PlatformAuthCreateRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.function.Supplier;

import static cloud.ffeng.cat.common.constants.ResultStatusConstants.BAD_REQUEST;

/**
 * 平台授权应用服务实现层
 *
 * @author cat-feng
 */
@Slf4j
@Service
@AllArgsConstructor
public class PlatformAuthAppServiceImpl implements PlatformAuthAppService {
    private final PlatformAuthDomainService platformAuthDomainService;

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public PlatformAuthDTO createAuthFlow(PlatformAuthCreateRequest request) {
        // 平台编码转换及校验合法性
        PlatformEnum platform = PlatformEnum.of(request.getPlatformCode());
        AssertUtil.nonNull(platform, BAD_REQUEST, "非法请求，平台编码不存在");

        // 执行创建授权流水
        PlatformAuthFlow newAuthFlow = platformAuthDomainService.createNewAuthFlow(platform);

        // 代码整洁之道
        // Alibaba Java代码开发手册

        // 返回对应流水信息给接口层
        return PlatformAuthAssembler.toDTO(newAuthFlow);
    }

}

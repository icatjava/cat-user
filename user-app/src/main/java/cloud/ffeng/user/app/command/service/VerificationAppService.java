package cloud.ffeng.user.app.command.service;

import cloud.ffeng.user.facade.dto.VerificationFlowDTO;
import cloud.ffeng.user.facade.request.VerificationFlowCreateRequest;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * @author cat-feng
 */
@Validated
public interface VerificationAppService {

    /**
     * 创建一个校验信息
     *
     * @param request 校验创建
     * @return 校验流水信息
     */
    VerificationFlowDTO createVerification(@Valid VerificationFlowCreateRequest request);
}

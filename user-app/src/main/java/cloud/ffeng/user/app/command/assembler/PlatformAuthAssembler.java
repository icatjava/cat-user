package cloud.ffeng.user.app.command.assembler;

import cloud.ffeng.user.domain.platform.aggregate.PlatformAuthFlow;
import cloud.ffeng.user.domain.platform.valobj.PlatformAuthByCode;
import cloud.ffeng.user.facade.dto.PlatformAuthDTO;

/**
 * @author cat-feng
 */
public final class PlatformAuthAssembler {


    public static PlatformAuthDTO toDTO(PlatformAuthFlow platformAuthFlow) {
        PlatformAuthDTO platformAuthDTO = new PlatformAuthDTO();
        platformAuthDTO.setPlatformAuthFlowId(String.valueOf(platformAuthFlow.getPlatformAuthFlowId()));
        platformAuthDTO.setLoginFlowId(String.valueOf(platformAuthFlow.getLoginFlowId()));
        platformAuthDTO.setPlatformCode(platformAuthFlow.getPlatform().getCode());
        platformAuthDTO.setAuthMethod(String.valueOf(platformAuthFlow.getAuthMethod()));
        platformAuthDTO.setAuthByCodeInfo(toDTO(platformAuthFlow.getAuthByCodeInfo()));
        platformAuthDTO.setAuthStatus(String.valueOf(platformAuthFlow.getAuthStatus()));
        platformAuthDTO.setCreateTime(platformAuthFlow.getCreateTime());
        platformAuthDTO.setUpdateTime(platformAuthFlow.getUpdateTime());
        return platformAuthDTO;
    }

    public static PlatformAuthDTO.PlatformAuthByCodeDTO toDTO(PlatformAuthByCode authByCode) {
        PlatformAuthDTO.PlatformAuthByCodeDTO platformAuthByCodeDTO = new PlatformAuthDTO.PlatformAuthByCodeDTO();
        platformAuthByCodeDTO.setState(authByCode.getState());
        platformAuthByCodeDTO.setClientId(authByCode.getClientId());
        platformAuthByCodeDTO.setScope(authByCode.getScope());
        platformAuthByCodeDTO.setAuthUrl(authByCode.getAuthUrl());
        return platformAuthByCodeDTO;
    }
}

package cloud.ffeng.user.app.command.assembler;

import cloud.ffeng.user.domain.user.aggregate.UserLoginFlow;
import cloud.ffeng.user.facade.dto.UserLoginFlowDTO;

/**
 * @author cat-feng
 */
public class UserLoginAssembler {

    public static UserLoginFlowDTO toDTO(UserLoginFlow userLoginFlow) {
        UserLoginFlowDTO userLoginFlowDTO = new UserLoginFlowDTO();
        userLoginFlowDTO.setLoginFlowId(String.valueOf(userLoginFlow.getLoginFlowId()));
        return userLoginFlowDTO;
    }
}

package cloud.ffeng.user.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author cat-feng
 */
@Getter
@AllArgsConstructor
public enum PlatformAuthStatusEnum {
    INIT(100, "INIT", "初始化"),
    PROCESS(200, "PROCESS", "处理中"),
    SUCCESS(300, "SUCCESS", "登录成功"),
    FAILED(400, "FAILED", "登录失败"),
    ;
    private final int status;
    private final String code;
    private final String desc;

}

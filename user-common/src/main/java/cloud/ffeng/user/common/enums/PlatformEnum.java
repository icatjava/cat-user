package cloud.ffeng.user.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

/**
 * @author cat-feng
 */
@Getter
@AllArgsConstructor
public enum PlatformEnum {

    GITHUB(1000, "GITHUB", "GitHub"),
    DING_TALK(2000, "DING_TALK", "钉钉"),
    ;

    private final int type;
    private final String code;
    private final String desc;

    public static PlatformEnum of(String code) {
        return Arrays.stream(PlatformEnum.values())
                .filter(item -> item.getCode().equals(code))
                .findFirst().orElse(null);
    }
}

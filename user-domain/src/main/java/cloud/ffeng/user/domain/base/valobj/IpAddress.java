package cloud.ffeng.user.domain.base.valobj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author cat-feng
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IpAddress {
    String ip;


    public static IpAddress of(String ip) {
        return null;
    }
}

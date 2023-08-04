package cloud.ffeng.user.domain.platform.repository;

import cloud.ffeng.user.common.enums.PlatformEnum;
import cloud.ffeng.user.domain.platform.valobj.PlatformConfig;

/**
 * @author cat-feng
 */
public interface PlatformConfigRepository {

    /**
     * 获取平台配置信息
     *
     * @param platform 平台
     * @return 平台配置信息
     */
    PlatformConfig get(PlatformEnum platform);

}

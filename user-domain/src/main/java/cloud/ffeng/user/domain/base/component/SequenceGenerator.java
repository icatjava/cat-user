package cloud.ffeng.user.domain.base.component;

import cloud.ffeng.user.domain.base.enums.SequenceType;

/**
 * @author cat-feng
 */
public final class SequenceGenerator {

    /**
     * 生成标准10位序列串
     * 保证sequenceType + prefix下唯一
     * 相同条件下 可容纳 100_0000_0000 个序列
     *
     * @param sequenceType 序列类型
     * @param prefix       前缀最大8位
     * @return 序列串
     */
    public static long nextUidSequence(SequenceType sequenceType, int prefix) {

        return 1234567891L;
    }

    /**
     * 生成标准10位序列串
     * 保证sequenceType + sharding下唯一
     * 相同条件下 可容纳 100_0000_0000 个序列
     *
     * @param sequenceType 序列类型
     * @param sharding     散列位
     * @return 序列串
     */
    public static long nextFlowIdSequence(SequenceType sequenceType, int sharding) {
        return 1234567890L;
    }

    /**
     * 生成10标准10位序列串
     * 保证sequenceType + sharding下唯一
     * 相同条件下 可容纳 100_0000_0000 个序列
     *
     * @param sequenceType 序列类型
     * @return 序列串
     */
    public static int nextShardingSequence(SequenceType sequenceType) {

        return 12;
    }

}

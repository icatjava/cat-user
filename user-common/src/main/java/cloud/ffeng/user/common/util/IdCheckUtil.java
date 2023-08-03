package cloud.ffeng.user.common.util;

/**
 * ID校验工具
 *
 * @author cat-feng
 */
public class IdCheckUtil {


    /**
     * 固定校验模式：整型去掉个位，逐位相加后，与第八位相乘，取末尾的个位
     * 要求 位数要大于等于9位, 如果小于9位，则直接返回0
     *
     * @param waitCheckNum 待生成checkSum的值
     * @return checkSum
     */
    public static int computeCheckSum(long waitCheckNum) {
        if (waitCheckNum < 100_000_000) {
            return 0;
        }

        String temp = String.valueOf(waitCheckNum / 10);
        int sum = 0;
        for (int i = 0; i < temp.length(); i++) {
            sum += (temp.charAt(i) - '0');
        }
        sum = sum * (temp.charAt(7) - '0');

        return sum % 10;
    }
}

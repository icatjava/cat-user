package cloud.ffeng.user.common.constants;

import cloud.ffeng.cat.common.result.ResultStatus;

import java.util.ConcurrentModificationException;

/**
 * @author cat-feng
 */
public class BizStatusConstants {
    /**
     * 用户相关状态码
     */
    public static ResultStatus U_USER_NOT_EXIST = new ResultStatus(
            "U_USER_NOT_EXIST", 60_01_01_000, "用户不存在！");
    public static ResultStatus U_USER_PASSWORD_CHECK_FAILED = new ResultStatus(
            "U_USER_PASSWORD_CHECK_FAILED", 60_01_01_001, "用户密码校验失败！");
    public static ResultStatus U_USER_LOGIN_CONCURRENTLY = new ResultStatus(
            "U_USER_LOGIN_CONCURRENTLY", 60_01_01_001, "用户登录并发操作！");

    /**
     * 校验器相关状态码
     */
    public static ResultStatus U_VERIFICATION_CHECK_FAILED = new ResultStatus(
            "U_VERIFICATION_CHECK_FAILED", 60_01_02_000, "验证码校验失败！");

    /**
     * 平台授权相关状态码
     */
    public static ResultStatus U_PLATFORM_AUTH_FLOW_NOT_EXIST = new ResultStatus(
            "U_PLATFORM_AUTH_FLOW_NOT_EXIST", 60_01_03_000, "平台授权流水信息不存在！");
    public static ResultStatus U_PLATFORM_AUTH_CONCURRENTLY = new ResultStatus(
            "U_PLATFORM_AUTH_CONCURRENTLY", 60_01_03_001, "平台授权并发操作！");

}

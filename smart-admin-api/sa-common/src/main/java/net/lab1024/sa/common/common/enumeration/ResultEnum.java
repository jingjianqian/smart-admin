package net.lab1024.sa.common.common.enumeration;

/**
 * @author: Sunq
 * @file: ResultEnum.java
 * @create: 2023/2/1 12:21
 * @desc：结果枚举
 */
public enum ResultEnum {
    // 成功
    SUCCESS(0, "成功"),

    // token异常
    TOKEN_PAST(301, "token过期"),
    TOKEN_ERROR(302, "token异常"),

    // 登录异常
    LOGIN_ERROR(303, "登录异常"),
    REMOTE_ERROR(304, "异地登录"),
    MENU_PAST(305, "菜单过期"),
    MENU_NO(306, "没此权限，请联系管理员！"),

    // 用户异常，5开头
    LECTURER_REQUISITION_REGISTERED(501, "申请失败！该手机没注册，请先注册账号"),
    LECTURER_REQUISITION_WAIT(502, "申请失败！该账号已被注册"),
    LECTURER_REQUISITION_YET(503, "申请失败！该账号已成存在，请直接登录"),

    // 操作异常
    USER_SAVE_FAIL(504, "添加失败"),
    USER_UPDATE_FAIL(505, "更新失败"),
    LECTURER_REQUISITION_FAIL(506, "申请失败！"),
    USER_LECTURER_AUDIT(507, "审核失败"),
    USER_SEND_FAIL(508, "发送失败"),
    USER_DELETE_FAIL(509, "删除失败"),

    // 系統异常，6开头
    SYSTEM_SAVE_FAIL(601, "添加失败"),
    SYSTEM_UPDATE_FAIL(602, "更新失败"),
    SYSTEM_DELETE_FAIL(603, "删除失败"),

    // 错误
    ERROR(-1, "错误");

    private Integer code;

    private String desc;

    ResultEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}

package net.lab1024.sa.common.common.domain;


import net.lab1024.sa.common.common.enumeration.ResultEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

/**
 * @author: Sunq
 * @file: Result.java
 * @create: 2023/2/1 12:19
 * @desc：结果集
 */
public class Result<T> implements Serializable {

    private static final Logger logger = LoggerFactory.getLogger(Result.class);

    private static final long serialVersionUID = 1L;

    /**
     * 错误码
     */
    private Integer code = ResultEnum.ERROR.getCode();

    /**
     * 错误信息
     */
    private String msg = null;

    /**
     * 返回结果实体
     */
    private T data = null;

    public Result() {
    }

    public Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T extends Serializable> Result<T> error(String msg) {
        logger.debug("返回错误：code={}, msg={}", ResultEnum.ERROR.getCode(), msg);
        return new Result<T>(ResultEnum.ERROR.getCode(), msg, null);
    }

    public static <T extends Serializable> Result<T> error(ResultEnum resultEnum) {
        logger.debug("返回错误：code={}, msg={}", resultEnum.getCode(), resultEnum.getDesc());
        return new Result<T>(resultEnum.getCode(), resultEnum.getDesc(), null);
    }

    public static <T extends Serializable> Result<T> error(int code, String msg) {
        logger.debug("返回错误：code={}, msg={}", code, msg);
        return new Result<T>(code, msg, null);
    }

    public static <T extends Serializable> Result<T> error(String msg, T data) {
        logger.debug("返回错误：code={}, msg={}", ResultEnum.ERROR.getCode(), msg);
        return new Result<T>(ResultEnum.ERROR.getCode(), msg, data);
    }

    public static <T extends Serializable> Result<T> success(T data) {
        return new Result<T>(ResultEnum.SUCCESS.getCode(), "", data);
    }

    public static <T extends Serializable> Result<T> success(String msg, T data) {
        return new Result<T>(ResultEnum.SUCCESS.getCode(), msg, data);
    }

    public static <T extends Serializable> Result<T> success(int code, String msg, T data) {
        return new Result<T>(code, msg, data);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result [code=" + code + ", msg=" + msg + ", data=" + data + "]";
    }

}


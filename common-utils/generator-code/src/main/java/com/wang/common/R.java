package com.wang.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Description 返回对象
 * @Author lhy
 * @Date 2021/8/31
 * @Version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class R<T> extends BaseEntity {

    public static final int SUCCESS_CODE = 1000;
    public static final int FAIL_CODE = 1001;

    private int code;

    private String msg;

    private T data;

    private Integer subCode;

    private String subMsg;


    public static <T> R<T> success() {
        return new R<>(SUCCESS_CODE, "success", null,null,"");
    }

    public static <T> R<T> success(String msg) {
        return new R<>(SUCCESS_CODE, msg, null,null,"");
    }

    public static <T> R<T> success(T data) {
        R<T> success = success();
        success.setData(data);
        return success;
    }

    public static <T> R<T> success(String msg, T data) {
        R<T> success = success();
        success.setMsg(msg);
        success.setData(data);
        return success;
    }

    public static <T> R<T> fail() {
        return new R<>(FAIL_CODE, "fail", null,null,"fail");
    }

    public static <T> R<T> fail(String msg) {
        R<T> fail = fail();
        fail.setMsg(msg);
        return fail;
    }

    public static <T> R<T> fail(T data) {
        R<T> fail = fail();
        fail.setData(data);
        return fail;
    }

    public static <T> R<T> fail(String msg, T data) {
        R<T> fail = fail();
        fail.setMsg(msg);
        fail.setData(data);
        return fail;
    }


    public static <T> R<T> fail(int code, String msg) {
        return new R<>(code, msg, null,null,msg);
    }

    public static <T> R<T> subFail(Integer code, String msg) {
        return new R<>(FAIL_CODE, "", null,code,msg);
    }


    public boolean isSuccess() {
        return SUCCESS_CODE == this.code;
    }
}

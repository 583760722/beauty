package com.imooc.beauty.domain;

import java.io.Serializable;

/**
 * @author zhy
 * @version 1.0
 * @classDesc: http请求的最外层对象
 * @date 2018/3/19
 * @copyright: 上海英和
 * @QQ: 583760722
 */
public class Result implements Serializable {
    private static final long serialVersionUID = 4986044711423422119L;
    private Integer code;
    private String message;
    private Object data;

    public Result() {
    }

    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

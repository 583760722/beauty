package com.imooc.beauty.util;

import com.imooc.beauty.domain.Result;
import com.imooc.beauty.exception.GirlException;

/**
 * @author zhy
 * @version 1.0
 * @classDesc: http返回值工具类
 * @date 2018/3/19
 * @copyright: 上海英和
 * @QQ: 583760722
 */
public class ResultUtil {
    public static Result success(Object o) {
        Result result = new Result();
        result.setCode(0);
        result.setMessage("success");
        result.setData(o);

        return result;
    }

    public static Result success() {
        return success(null);
    }



    public static Result failure(Integer code,String message) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    public static Result failure(String message) {

        return failure(1,message);
    }

    public static Result failure() {
        return failure(null);
    }

    public static Result exception(int code, String message) {
        return new Result(code, message);
    }

    public static Result exception(GirlException girlException) {
        return exception(girlException.getCode(), girlException.getMessage());
    }
}

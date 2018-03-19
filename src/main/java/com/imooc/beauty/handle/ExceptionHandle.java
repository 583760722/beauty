package com.imooc.beauty.handle;

import com.imooc.beauty.domain.Result;
import com.imooc.beauty.exception.GirlException;
import com.imooc.beauty.util.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhy
 * @version 1.0
 * @classDesc: 异常捕获类
 * @date 2018/3/19
 * @copyright: 上海英和
 * @QQ: 583760722
 */
@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        if (e instanceof GirlException) {
            GirlException girlException = (GirlException)e;
            return ResultUtil.exception(girlException);
        }

        return ResultUtil.exception(-1,e.getMessage());
    }
}

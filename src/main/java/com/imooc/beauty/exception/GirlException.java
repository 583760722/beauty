package com.imooc.beauty.exception;

import com.imooc.beauty.enums.ResultEnum; /**
 * @author zhy
 * @version 1.0
 * @classDesc:
 * @date 2018/3/19
 * @copyright: 上海英和
 * @QQ: 583760722
 */
public class GirlException extends RuntimeException {
    private Integer code;

    public GirlException() {
    }

    public GirlException(String message) {
        super(message);
    }

    public GirlException(Integer code,String message) {
        super(message);
        this.code = code;

    }

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code=resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}

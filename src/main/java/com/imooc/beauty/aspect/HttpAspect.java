package com.imooc.beauty.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class HttpAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(* com.imooc.beauty.controller.*.*(..))")
    public void cut() {
    }

    @Before("cut()")
    public void doBefore(JoinPoint joinpoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        //url
        LOGGER.info("url={}", request.getRequestURL());
        //Http-Method
        LOGGER.info("method={}", request.getMethod());
        //客户端ip
        LOGGER.info("ip={}", request.getRemoteAddr());
        //类方法
        LOGGER.info("class_method={}", joinpoint.getSignature().getDeclaringTypeName() + "." + joinpoint.getSignature().getName());
        //方法参数
        LOGGER.info("args={}", joinpoint.getArgs());


    }

    @After("cut()")
    public void doAfter() {
        LOGGER.info("after:..............................");
    }
}

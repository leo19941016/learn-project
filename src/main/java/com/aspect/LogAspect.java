package com.aspect;

import com.controller.WebController;
import com.tang.ConvertDto;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

/**
 * @Description:
 * @Company: TOO (ps：公司名称)
 * @author: 唐
 * @date: 2021/1/20 下午4:59
 * @version: V1.0.0
 */
@Aspect
@EnableAspectJAutoProxy
@Component
public class LogAspect {

    @Pointcut("execution(* com.controller.*.*(..))")
    public void point(){}

//    @Before("point()")
//    public void handle() throws Throwable {
//        MDC.put("user", Thread.currentThread().getName());
//        System.out.println((String) WebController.tl.get()+"11111");
//
//        Logger logger = LoggerFactory.getLogger(LogAspect.class);
//        logger.info("this is my aspect MDC log....");
//
//        MDC.clear();
//    }

    @After("point()")
    public void handle() throws Throwable {
        /*这里想要获得user不为空 必须在目标类执行完后通知，因为set操作是在controller进行的*/
        MDC.put("user", (String) WebController.tl.get());

        Logger logger = LoggerFactory.getLogger(LogAspect.class);
        logger.info("this is my aspect MDC log....");

        MDC.clear();
    }
}

package com.aspect;

import com.threadlocal.GloabSessionId;
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
//@EnableAspectJAutoProxy
@Component
public class LogAspect {


    @Pointcut("execution(* *(..)) && @annotation(com.annotation.PrintMyLog)")
    public void point(){}

    @Before("point()")
    public void handle() throws Throwable {
        GloabSessionId.set();

    }


    @After("point()")
    public void afterhanle(){
        MDC.put("user",GloabSessionId.get());

        Logger logger = LoggerFactory.getLogger(LogAspect.class);
        logger.info("this is MDC msg ...");
        MDC.clear();
    }
}

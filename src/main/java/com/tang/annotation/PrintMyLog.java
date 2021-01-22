package com.tang.annotation;

import java.lang.annotation.*;

/**
 * @Description:
 * @Company: TOO (ps：公司名称)
 * @author: 唐
 * @date: 2021/1/21 上午10:29
 * @version: V1.0.0
 */


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PrintMyLog {

    int expireTime() default 60;
}

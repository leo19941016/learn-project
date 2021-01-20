package com.controller;

import com.threadlocal.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Company: TOO (ps：公司名称)
 * @author: 唐
 * @date: 2021/1/20 上午10:13
 * @version: V1.0.0
 */
@RestController
public class WebController {

    final protected Logger logger = LoggerFactory.getLogger(WebController.class);
    public static ThreadLocal tl = new ThreadLocal();


    @GetMapping("/printlog")
    public String log(String str) {
        tl.set(Thread.currentThread().getName());

        System.out.println(tl.get());

        new User().sys();
        return "cuccess";
    }
}

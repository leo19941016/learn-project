package com.tang.controller;

import com.tang.annotation.PrintMyLog;
import com.tang.threadlocal.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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


    @Autowired
    private User user;

    @GetMapping("/printlog")
    public String log(String str) {

        user.sys();
        return "cuccess";
    }
}

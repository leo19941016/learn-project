package com.tang.threadlocal;


import com.tang.annotation.PrintMyLog;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Company: TOO (ps：公司名称)
 * @author: 唐
 * @date: 2021/1/20 下午7:14
 * @version: V1.0.0
 */
@Component
public class User {


    @PrintMyLog
    public String sys(){
        System.out.println("as");
        return "aaa";
    }
}

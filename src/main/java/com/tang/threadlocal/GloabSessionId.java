package com.tang.threadlocal;

/**
 * @Description:
 * @Company: TOO (ps：公司名称)
 * @author: 唐
 * @date: 2021/1/21 上午10:44
 * @version: V1.0.0
 */
public class GloabSessionId {

    final static ThreadLocal tl = new ThreadLocal();

    public static void set(){
        tl.set(Thread.currentThread().getName());
    }

    public static String get(){
        return (String) tl.get();
    }
}

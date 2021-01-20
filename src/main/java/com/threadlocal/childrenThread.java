package com.threadlocal;

/**
 * @Description:
 * @Company: TOO (ps：公司名称)
 * @author: 唐
 * @date: 2021/1/20 下午7:04
 * @version: V1.0.0
 */
public class childrenThread implements Runnable {

    final static ThreadLocal tl = new ThreadLocal();

    @Override
    public void run() {

        tl.set(Thread.currentThread().getName());
        System.out.println(tl.get());

    }
}

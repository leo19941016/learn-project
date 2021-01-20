package com.threadlocal;

/**
 * @Description:
 * @Company: TOO (ps：公司名称)
 * @author: 唐
 * @date: 2021/1/20 下午7:02
 * @version: V1.0.0
 */
public class Main {

    private static final ThreadLocal tl = new ThreadLocal();


    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 3; i++ ) {
            Thread thread = new Thread(new childrenThread());
            thread.start();

            Thread.sleep(10);
        }
    }
}

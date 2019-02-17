package org.litespring.util;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ercargo  on 2018/10/16
 * @DESCRIBE
 */
public class Demo6 {
    //线程池创建多线程
    public static void main(String[] args) {
        //创建10个线程
        ExecutorService threadPool = Executors.newCachedThreadPool();
        for ( int i = 0; i < 100; i++) {
            final int finalI = i;
            threadPool.execute(new Runnable() {
                public void run() {

                    System.out.println(Thread.currentThread().getName()+"正在执行 任务"+ finalI);
                }
            });
        }
        threadPool.shutdown();
    }

}

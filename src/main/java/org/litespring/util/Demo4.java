package org.litespring.util;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author ercargo  on 2018/10/15
 * @DESCRIBE
 */
public class Demo4 implements Callable<Integer>{

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Demo4 d4 = new Demo4();
        FutureTask<Integer> task =new FutureTask<Integer>(d4);
        Thread t = new Thread(task);
        t.start();


        System.out.println("我先干点别的");
        Integer i  = task.get();
        System.out.println("线程执行结果为："+i);
    }

    public Integer call() throws Exception {
        System.out.println("1111111");
        Thread.sleep(3000);
        return 1;
    }


}

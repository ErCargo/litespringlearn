package org.litespring.util;

/**
 * @author ercargo  on 2018/10/16
 * @DESCRIBE
 */
public class Target implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println(Thread.currentThread().getName()+"......");
            //Thread.sleep(10000);
        }
    }
}

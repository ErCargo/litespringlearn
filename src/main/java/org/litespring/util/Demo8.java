package org.litespring.util;

/**
 * @author ercargo  on 2018/10/16
 * @DESCRIBE
 */
public class Demo8 {
    public static void main(String[] args){
        Thread t1 = new Thread(new Target());
        Thread t2 = new Thread(new Target());
        Thread t3 = new Thread(new Target());
        Thread t4 = new Thread(new Target());

        //不同平台对优先级的支持不一样，值含义在不同平台也不一样
        //值越大优先级越高
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();

    }

}

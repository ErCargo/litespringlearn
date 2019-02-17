package org.litespring.util;

/**
 * @author ercargo  on 2018/10/9
 * @DESCRIBE
 */
public class Demo1 extends Thread{
    public Demo1(String name){
        super(name);
    }

    @Override
    public void run() {
        while(true)
        System.out.println(getName()+"执行了");
    }


    public static void main(String[] args){
        Demo1 d1 = new Demo1("1-thread");
        Demo1 d2 = new Demo1("2-Thread");

       /* d1.setDaemon(true);
        d2.setDaemon(true);*/

        d1.start();
        d2.start();

       /* try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}

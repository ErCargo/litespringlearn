package org.litespring.util;

/**
 * @author ercargo  on 2018/10/9
 * @DESCRIBE
 */
public class NewThread implements Runnable {

    public void run() {
        while (true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程执行。。。。。。。。");
        }
    }

    public static void main(String[] args) {
        NewThread n  = new NewThread();
        Thread thread = new Thread(new NewThread());    // 创建线程， 并指定线程任务

        thread.start();

        while(true){
            System.out.println("主线程执行。。。。。。");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            n.notifyAll();
        }

    }

    //匿名内部类 1. 只能使用一次 2. 使用内部类前提是 继承一个父类或实现一个接口




}

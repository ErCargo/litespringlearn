package org.litespring.util;

/**
 * @author ercargo  on 2018/10/15
 * @DESCRIBE
 */
public class Demo3 {
    public static void main(String[] args){
        new Thread(){
            public void run(){
                System.out.println("Thread start");
            }
        }.start();


        new Thread(new Runnable(){
            public void run() {
                System.out.println("Thread start 2");
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                System.out.println("2");
            }
        }){
            public void run(){
                System.out.println("Thread start");
            }
        }.start();


    }
}

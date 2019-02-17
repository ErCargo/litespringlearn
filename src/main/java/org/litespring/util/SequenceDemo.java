package org.litespring.util;

/**
 * @author ercargo  on 2018/10/17
 * @DESCRIBE
 */
public class SequenceDemo {
    private int value;

    //线程安全性问题

    public synchronized int getNext(){
        return  value++;
    }

    public static void main(String[] args){
        SequenceDemo s = new SequenceDemo();
       /* while(true){
            System.out.println(s.getNext());
        }*/


       new Thread(new Runnable() {
           @Override
           public void run() {
               //调用序列生成器
               while(true){
                   System.out.println(Thread.currentThread().getName()+"   "+ s.getNext());
                   try {
                       Thread.sleep(100);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
           }
       }).start();






    }
}

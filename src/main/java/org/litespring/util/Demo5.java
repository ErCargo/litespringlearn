package org.litespring.util;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author ercargo  on 2018/10/16
 * @DESCRIBE
 */
public class Demo5 {

    public static void main(String[] args){
        Timer timer  = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                //实现定时任务
                System.out.println("timer task is run");
            }
        },0, 1000);
    }
}

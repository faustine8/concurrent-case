package org.example;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class ScheduleExample {
   /* public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService= Executors.newScheduledThreadPool(3);
        *//*scheduledExecutorService.schedule(()->{
            System.out.println("延迟3s执行的任务");
        },3, TimeUnit.SECONDS);*//*
        scheduledExecutorService.scheduleAtFixedRate(()->{
            System.out.println("每隔2s执行一次");
        },1,2,TimeUnit.SECONDS);
    }*/

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService= Executors.newScheduledThreadPool(3);
        scheduledExecutorService.scheduleWithFixedDelay(()->{
            System.out.println("Start: scheduleAtFixedRate: " + new Date());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("End  : scheduleAtFixedRate: " + new Date());
        },1,1,TimeUnit.SECONDS);
    }
}

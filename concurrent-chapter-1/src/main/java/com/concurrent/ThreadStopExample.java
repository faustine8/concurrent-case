package com.concurrent;


public class ThreadStopExample extends Thread {
    @Override
    public void run() {
        try {
            // 开始计数
            for (int i = 0; i < 100000; i++) {
                System.out.println("runing.." + i);
            }
            System.out.println("the code that it will be executed");
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new ThreadStopExample();
        t1.start();
        Thread.sleep(100);
        t1.stop();
    }
}

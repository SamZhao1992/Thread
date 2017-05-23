package com.sam.thread5;

/**
 * Created by SamZhao on 2017/5/23.
 */
public class ThreadPoolRunnable implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName()+"---线程提交任务!");
    }
}

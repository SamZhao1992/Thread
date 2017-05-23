package com.sam.thread2;

/**
 * Created by SamZhao on 2017/5/23.
 *
 * 每个线程都有自己的名字
 *
 * 其他新建线程也有名字  默认 Thread-0 1 2 ....
 *
 */
public class ThreadDemo {

    public static void main(String[] args) {
//        for(int i=0;i<10;i++){
//            try {
//                Thread.sleep(500);
//                System.out.println(i);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//        }
        new SleepThread().start();
    }

}

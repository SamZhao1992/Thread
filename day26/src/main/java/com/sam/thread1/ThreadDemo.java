package com.sam.thread1;

import com.sam.thread.SubThread;

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
        NameThread nameThread = new NameThread();
        NameThread nameThread1 = new NameThread();
        Thread thread = Thread.currentThread();
        System.out.print(thread.getName());
        nameThread.start();
        nameThread1.start();
    }

}

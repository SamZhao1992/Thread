package com.sam.thread3;

/**
 * Created by SamZhao on 2017/5/23.
 *
 * 实现接口方式的线程
 *
 */
public class ThreadDemo {
    public static void main(String[] args) {
        new Thread(new SubRunnable()).start();
    }
}

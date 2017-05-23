package com.sam.thread1;

/**
 * Created by SamZhao on 2017/5/23.
 */
public class NameThread extends Thread {
    @Override
    public void run() {
        System.out.println(super.getName());
    }
}

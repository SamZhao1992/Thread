package com.sam.thread;

/**
 * Created by SamZhao on 2017/5/23.
 */
public class ThreadDemo {
    public static void main(String[] args) {
        SubThread subThread = new SubThread();
        subThread.start();
        function();
    }

    public static void function() {
        for(int i=0;i<50000;i++)
            System.out.println("main-->"+ i);
    }

}

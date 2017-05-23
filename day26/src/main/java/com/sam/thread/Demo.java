package com.sam.thread;

/**
 * 程序中的主线程
 */
public class Demo {

    public static void main(String[] args) {
        function();
        SubThread subThread = new SubThread();
        subThread.start();
    }

    public static void function() {
        for(int i=0;i<10000;i++)
            System.out.println("main-->"+ i);
    }

}

package com.sam.thread4;

/**
 * Created by SamZhao on 2017/5/23.
 *
 * 匿名内部类实现多线程
 * 前提：继承或者接口实现
 *
 *
 */
public class ThreadDemo {
    public static void main(String[] args) {
        //继承方式
        new Thread(){
            public void run(){
                System.out.println("!!!继承");
            }
        }.start();

        //接口方式
        new Thread(new Runnable(){
            public void run() {
                System.out.println("###接口");
            }
        }).start();
    }
}

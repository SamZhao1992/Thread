package com.sam.thread;

/**
 * Created by SamZhao on 2017/5/23.
 */
public class SubThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<50000;i++)
            System.out.println("SubThread-->"+ i);
    }
}

package com.sam.thread2;

/**
 * Created by SamZhao on 2017/5/23.
 */
public class SleepThread extends Thread {

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}

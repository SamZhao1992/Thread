package com.sam.thread3;

/**
 * Created by SamZhao on 2017/5/23.
 */
public class SubRunnable implements Runnable {
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

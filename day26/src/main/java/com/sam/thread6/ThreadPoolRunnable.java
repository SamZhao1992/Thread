package com.sam.thread6;

import java.util.concurrent.Callable;

/**
 * Created by SamZhao on 2017/5/23.
 */
public class ThreadPoolRunnable implements Callable<Integer> {
    int a=0;

    public ThreadPoolRunnable(int a) {
        this.a = a;
    }

    public Integer call() throws Exception {
        int aa = 0;
        for(int i=1;i<=a;i++)
            aa = aa + i;
        return aa;
    }
}

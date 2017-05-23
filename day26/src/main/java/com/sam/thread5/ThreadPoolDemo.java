package com.sam.thread5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by SamZhao on 2017/5/23.
 *
 * JDK 1.5的新特性   实现线程池特性
 *
 * 使用工厂类 Executors
 *
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        //调用工厂的静态方法，创建线程池对象
        //返回线程池对象，是返回的接口
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        System.out.println(executorService);
        //调用接口实现对象es中的submit提交线程任务
        //将Runnable接口实现类对象传递
        executorService.submit(new ThreadPoolRunnable());
        executorService.submit(new ThreadPoolRunnable());
        executorService.submit(new ThreadPoolRunnable());

        //销毁
        //executorService.shutdown();
    }
}

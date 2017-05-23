package com.sam.thread6;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by SamZhao on 2017/5/23.
 *
 * 多线程求和
 *
 * 2个线程 一个1+到10  一个1+100
 *
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        try {
            //调用工厂的静态方法，创建线程池对象
            //返回线程池对象，是返回的接口
            ExecutorService executorService = Executors.newFixedThreadPool(2);
            System.out.println(executorService);
            //调用接口实现对象es中的submit提交线程任务
            //将Runnable接口实现类对象传递
            Future<Integer> future = executorService.submit(new ThreadPoolRunnable(10));
            Future<Integer> future1 =  executorService.submit(new ThreadPoolRunnable(200));
            System.out.println(future.get());
            System.out.println(future1.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        //销毁
        //executorService.shutdown();
    }
}

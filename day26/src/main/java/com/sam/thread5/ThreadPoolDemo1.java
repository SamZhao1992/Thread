package com.sam.thread5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by SamZhao on 2017/5/23.
 *
 * 实现 线程程序 的 第三种实现方式  Callable  接口方式
 *
 * 实现步骤
 *
 *      使用工厂类 Executors  静态方法 newFixedThreadPool  创建线程池对象
 *      线程池对象 ExecutorService  接口的实现类 去调用方法submit提交线程任务
 *      submit(Callable c)
 *
 *
 *
 */
public class ThreadPoolDemo1 {
    public static void main(String[] args) {
        try {
            //调用工厂的静态方法，创建线程池对象
            //返回线程池对象，是返回的接口
            ExecutorService executorService = Executors.newFixedThreadPool(2);
            System.out.println(executorService);
            //调用接口实现对象es中的submit提交线程任务
            //提交线程任务的方法 返回Future接口的实现类
            Future<String> future = executorService.submit(new ThreadPoolCallable());
            System.out.println(future.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //销毁
        //executorService.shutdown();
    }
}

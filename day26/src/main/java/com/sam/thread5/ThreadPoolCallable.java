package com.sam.thread5;

import java.util.concurrent.Callable;

/**
 * Created by SamZhao on 2017/5/23.
 *
 * Callable接口的实现类  ，作为线程提交任务出现
 * 使用方法返回值
 *
 */
public class ThreadPoolCallable implements Callable<String> {

    public String call() throws Exception {
        return "Callable接口的实现类";
    }

}

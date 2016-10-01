package com.chenxy.utils.common;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by admin on 2016/9/29.
 */
public class ThreadUtils {

    public static void createThread(List<Runnable> runnables){
        try {
            ExecutorService executors=Executors.newFixedThreadPool(runnables.size());
            for(int i=0;i<runnables.size();i++){
                executors.execute(runnables.get(i));
            }
            executors.shutdown();
        } catch (Exception e) {
            //todo 异常处理
            e.printStackTrace();
        }
    }



}

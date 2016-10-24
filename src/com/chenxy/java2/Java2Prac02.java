package com.chenxy.java2;

/**
 * Created by admin on 2016/10/24.
 */
public class Java2Prac02 {

    /**
     * 字符串性能测试
     */
    public void test(){
        String[] variables=new String[50000];
        for(int i=0;i<50000;i++){
            variables[i]="s"+i;
        }
        long startTime=System.currentTimeMillis();
        //0ms
        for(int i=0;i<50000;i++){
            variables[i]="hello";
        }
        long endTime=System.currentTimeMillis();
        // 31ms
        for(int i=0;i<50000;i++){
            variables[i]=new String("hello");
        }
        // 16ms
        for(int i=0;i<50000;i++){
            variables[i]=new String("hello");
            variables[i]=variables[i].intern();//常量池中取取数据，性能更好
        }
    }




}

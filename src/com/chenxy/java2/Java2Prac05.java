package com.chenxy.java2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 */
public class Java2Prac05 {


    public static void main(String[] args){
            new Java2Prac05().test();;
    }

    /**
     *数组反转
     */
    public void test(){
        List<String> list=new ArrayList<>();
        list.add("xiaoli");
        list.add("xiaochen");
        list.add("xiaozhang");
        Collections.reverse(list);
         System.out.println(list);
    }

    /**
     * 数组得最大值和最小值
     */
    public void test2(){
          Integer[] numbers={1,21,3,0,12,10};
          int min=Collections.min(Arrays.asList(numbers));
          int max=Collections.max(Arrays.asList(numbers));
    }

    /**
     * 数组合并
     */
    public void test3(){
         String[] a={"A","B","C"};
         String[] b={"C","D","E"};
         List list=new ArrayList<String>(Arrays.asList(a));
         list.addAll(Arrays.asList(b));
         list.toArray();
    }
}

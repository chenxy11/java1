package com.chenxy.java2;

/**
 * Created by admin on 2016/10/24.
 */
public class Java2Prac01 {
    /**
     * 字符串的反转
     */
    public void test1(){
        String str="abcdefg";
        String sb=new StringBuffer(str).reverse().toString();
        System.out.println(sb);
    }

    /**
     * 字符串查找
     */
    public void test2(){
        String s="hello  world!";
        int index=s.indexOf("hello");
        if(index==-1){
            System.out.println("hello  not  found!");
        }
    }

    /**
     * 小写转换为大写
     */
    public void test3(){
        String s="abdasdas";
        s=s.toUpperCase();
        s=s.toLowerCase();
    }

    /**
     * 测试两个字符串的区域是否相等
     */
    public void test4(){
        String s1="welcome to Mocrosoft";
        String s2="I work with mocrosoft";
        boolean s1_s2=s1.regionMatches(11,s2,13,9);//
        boolean s1_s22=s1.regionMatches(true,11,s2,13,9);//忽略大小写
    }

    /**
     * 创建字符串性能测试
     */
    public void test5(){
        long startTime=System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            String s1="abc";
            String s2="efg";
        }
        long endTime=System.currentTimeMillis();
        System.out.println("创建字符串总共耗时"+(endTime-startTime)+"ms");

        long startTime1=System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            String s3=new String("asdas");
            String s4=new String("asdasd");
        }
        long endTime1=System.currentTimeMillis();
     }

}

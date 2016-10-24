package com.chenxy.java1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @version 1.0
 * @author admin
 * @see java.lang.String
 * @<p>
 *     String a="";
 *     a.compareTo("");
 * </p>
 */
public class Java1Prac11 implements Comparable
{


    /**
     * <p>
     *     字符串的compareTo方法：
     *     1 所有实现Comparable 接口的类都可以使用
     *     2 原理：比较米一个字符的unicode编码后的值是否相等
     *     3 与equals 在比较两个字符串相等的时候效果一样
     *     4 返回值时int ==0 时相等
     *
     * </p>
     * @param args
     */
    public static void main(String[] args){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(new Date()).compareTo("2016-10-18 01:00:00"));
//        String str="Hello World";
//        String str1="hello world";
//        System.out.println(str.compareTo(str1));
    }

    @Override
    public int compareTo(Object o) {
        //
        return 0;
    }

    /**
     * 1
     */
    public void unicode(){

    }
}

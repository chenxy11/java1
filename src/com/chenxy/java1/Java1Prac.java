package com.chenxy.java1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by chenxy on 2016/9/26.
 */
public class Java1Prac {
    /**
     * 编写一个Java程序，用if-else语句判断某年份是否为闰年
     */
    public static Boolean isLeapYear(Integer year){
        if(year%400==0 ||(year%4==0&&year%100!=0))
            return true;
            return false;
    }
    /**
     * 编写一个Java程序在屏幕上输出1！+2！+3！+„„+10！的和
     */
    public static Long getFactorial(Integer i){
        if(1==i){
            return 1l;
        }else{
            return i*getFactorial(i-1);
        }
    }

    /**
     *
     * @param i
     * @return
     */
    public static Long sum(Integer i){
        Long sum=0l;
        for(int j=1;j<=i;j++){
            sum+=getFactorial(j);
        }
        return sum;
    }

    /**
     * 编写一个Java应用程序，从键盘读取用户输入两个字符串，
     * 并重载3个函数分别实现这两个字符串的拼接、
     * 整数相加和浮点数相加。要进行异常处理，
     * 对输入的不符合要求的字符串提示给用户，不能使程序崩溃。
     */
    public static final void  readKeyBoard(){
        try {
            String firstStr="";
            String secondStr="";
            Scanner scanner=new Scanner(System.in);

                System.out.println("请输入第一个字符串！");
                while(scanner.hasNext()){
                    firstStr=scanner.next();
                    try {
                        new Integer(firstStr);
                    } catch (NumberFormatException e) {
                        System.out.println("请输入整形字符串！");
                        readKeyBoard();
                    }
//                    while(!(new Integer(firstStr) instanceof Integer || new Float(firstStr) instanceof  Float)){
//                        System.out.println("请输入整形字符串！");
//                    }
                    System.out.println("请输入第二个字符串！");
                    secondStr=scanner.next();
                    try {
                        new Integer(secondStr);
                    } catch (NumberFormatException e) {
                        System.out.println("请输入整形字符串！");
                        readKeyBoard();
                    }
//                    while(!(new Integer(secondStr) instanceof Integer || new Float(secondStr) instanceof  Float)){
//                        System.out.println("请输入整形字符串！");
//                    }
                    break;
                }
            System.out.print("字符串的拼接："+firstStr+secondStr);
            if(new Integer(firstStr)instanceof Integer&&new Integer(firstStr) instanceof Integer){
                System.out.println("整形相加结果为：" + Integer.parseInt(firstStr) + Integer.parseInt(secondStr));
            }

            if(new Float(secondStr) instanceof Float&&new Float(firstStr) instanceof Float){
                System.out.println("浮点数相加结果为："+Float.parseFloat(firstStr)+Float.parseFloat(secondStr));
            }
         } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 应用FileInputStream类，编写应用程序，从磁盘上读取一个Java程序，
     * 并将源程序代码显示在屏幕上。
     * 被读取的文件路径为：E:/myjava/Hello.java）
     */
    public static void readFile() throws IOException {
            InputStreamReader reader=new InputStreamReader(new FileInputStream(new File("G:/Hello.java")),"UTF-8");
            BufferedReader bufferedReader=new BufferedReader(reader);
            while(bufferedReader.read()!=-1){
                String s=bufferedReader.readLine();
//                byte[] bytes=s.getBytes("UTF-8");
                System.out.println(s);
            }
            reader.close();
            bufferedReader.close();
    }
    /**
     * 、编写一个Java程序将 100,101,102,103,104,105个数 以数组的形式
     *  写入到Dest.txt文件中，并以相反的顺序读出显示在屏幕上。
     */
    public static void writeAndRead() throws IOException {
        Integer[] data={100,101,102,103,104,105};//defghi
        DataOutputStream dataOutputStream=new DataOutputStream(new FileOutputStream(new File("G:/hello.txt")));
        OutputStreamWriter outputStreamWriter=new OutputStreamWriter(dataOutputStream,"UTF-8");
        for(int i=0;i<data.length;i++){
            System.out.println(data[i]);
            outputStreamWriter.write(data[i]);
        }
        dataOutputStream.flush();
        dataOutputStream.close();
//        DataInputStream dataInputStream=new DataInputStream(new FileInputStream(new File("G:/hello.txt")));
//        for(int j=data.length-1;j>=0;j--){
//           System.out.print(dataInputStream.readUTF());
//        }
//        dataInputStream.close();
    }

    /**
     * 编写一个Java程序实现多线程，在线程中输出线程的名字，隔300毫秒输出一次，共输出20次
     */
    public static void moreThread(){
        ExecutorService threadPool=Executors.newFixedThreadPool(3);
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<21;i++){
                    System.out.print(Thread.currentThread().getName());
                    try {
                        Thread.currentThread().sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    /**
     *  【程序9】
     *  题目：一个数如果恰好等于它的因子之和，
     *  这个数就称为 "完数 "。例如6=1＋2＋3.编程
     *  找出1000以内的所有完数。
     * @param max
     * @return
     */
    public static List<Integer> findWanShu(Integer max){
        List<Integer> integers=new ArrayList<Integer>();
        for(int i=1;i<=1000;i++){
            Integer j=isWanShu(i);
            if(j!=null){
                integers.add(j);
            }
        }
        return integers;
    }

    private static Integer isWanShu(int i) {
        Integer sum=0;
        for(int j=1;j<=i;j++){
            if(i%j==0){
                sum+=j;
            }
        }
        if(sum==i)
            return i;
            return null;
    }


}

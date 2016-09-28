package com.chenxy.java1;

import java.io.*;

/**
 * Created by admin on 2016/9/28.
 */
public class java1Prac2 {


    public static void main(String[] args) throws IOException {

        Number number=new Number() {
            @Override
            public int intValue() {
                return 0;
            }

            @Override
            public long longValue() {
                return 0;
            }

            @Override
            public float floatValue() {
                return 0;
            }

            @Override
            public double doubleValue() {
                return 0;
            }
        };

        char ch='a';
        char[] charArry={'a','v'};
        Character character=new Character('a');//包装一个char 基本数据类型---装箱
        Character character1='a';//包装一个char 基本数据类型---装箱
        //    \' 插入单引号   \" 插入双引号   \\ 插入单引号
        character.isLetter(' ');//字母boolean

        character.isDigit(' ');//数字
        character.isWhitespace(' ');//空格
        character.isUpperCase(' ');//大写
        character.isLowerCase(' ');//小写
        //<<
        //位运算符
//    A=0011 1100   ===4+8+16+32   60
//        1111 0000
//
        FileInputStream fileInputStream=new FileInputStream("C:/java/hello");//使用文件名创建输入流
        fileInputStream=new FileInputStream(new File("C:/java/hello"));//使用文件来创建流
        fileInputStream.read();
        new BufferedInputStream(fileInputStream);
     }

    /**
     *
     * Object--1.InputStream---1.ByteArrayInputStream 2FileInputStream 3FilterInputStream
     *                         4 StringBufferInputStream 5SequenceInputStream
     *
     *       --2.OutputStream
     *
     *
     *
     *
     */
     static class FileStreamTest{
         public static void main(String[] args) throws IOException {
             byte[] bwrite={11,22,3,44,55,7};
             FileOutputStream fileOutputStream=new FileOutputStream(new File(""));
             OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream,"UTF-8");
             for(byte b:bwrite){
                 outputStreamWriter.write(b);//不会出现乱码
//                 fileOutputStream.write(b);//二进制写入
             }
             outputStreamWriter.close();
             FileInputStream fileInputStream=new FileInputStream(new File(""));
             InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream,"UTF-8");
             int size=fileInputStream.available();//可读的字节数
             for(int i=1;i<=size;i++){
                 System.out.println((char)fileInputStream.read()+"  ");//二进制读取
                 System.out.println(inputStreamReader.read());//不会出现乱码
             }
             fileInputStream.close();
             inputStreamReader.close();
          }
     }

    /**
     * Object--->Throwable--->Exception---IOException  RuntimeException
     *                      --->Error
     */
      static class ExceptionTest{
            //自定义异常
        // 1 检查类异常 继承Exception
        //2 运行时异常  继承RuntimeException

      }



}

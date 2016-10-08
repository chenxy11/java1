package com.chenxy.java1;

import java.util.*;

/**
 * @author admin
 * @version 1.0
 * @see com.chenxy.java1.Java1Prac7
 * @since 1.0
 * @desc Properties 继承与hashTable ,表示一个持久的属性集
 *       不论其键还是值都是字符串
 *      ,所以具备hashtable 的所有方法
 *       延伸的方法
 *       String getProperty(String key)
 *       list(PrintStream  printStream) 将属性列表输出到指定的输出流
 *       load(InputStream inputStream)  读取属性列表
 *
 *
 */
public class Java1Prac7 {

    public void test(){
        Properties properties= new Properties();
        properties.put("key1","value1");
        properties.put("key2","value2");
        properties.put("key3","value3");
        Set<Object> set=properties.keySet();
        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            String str= (String) iterator.next();
            properties.getProperty(str);
        }
//        properties.load();
//          properties.list();
     }

    /**
     * java 泛型 提供了编译时类型安全监测机制
     * 即 所操作的数据类型被指定为一个参数
     */
    /**
     * 泛型的方法
     * 1 在修饰符后面声明 <E>
     * 2 所操作的数据类型为E
     * @param inputArry
     * @param <E>
     */
    public <E> void test2(E[] inputArry){
        for (E element:inputArry){
            System.out.println(element);
        }
    }

    /**
     * 有界的类型参数：指定某一类的数据类型
     * @param x
     * @param y
     * @param z
     * @param <E>
     * @return
     */
    public static <E extends Comparable> E maxxinum(E x,E y,E z){

        return null;
    }



}

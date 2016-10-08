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

}

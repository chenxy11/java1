package com.chenxy.java1;

import com.sun.javafx.scene.DirtyBits;

import java.util.BitSet;
import java.util.Enumeration;

/**
 * @see com.chenxy.java1.Java1Prac5
 * @author admin
 * @since 1.0
 * @version 1.0
 * @desc java 数组结构
 *
 */
public class Java1Prac5 {
    /**
     * 在java数组结构中包含以下几种接口和类
     * 1 枚举 ：Enumeration
     * 2 位集合：bitSet
     * 3 向量：Vector
     * 4 栈 Stack
     * 5 哈希表 hashtable
     * 6 属性 Properties
     * 7 字典 Dictionary
     */
     public void test(){
         Enumeration days=null;// boolean hasMoreElements()
         // Object nextElement();
         java.util.Vector vector=new java.util.Vector();
         vector.add("1");
         vector.add("1");
         vector.add("1");
         vector.add("1");
         days=vector.elements();
         while(days.hasMoreElements()){
             System.out.println(days.nextElement());
         }
      }

    /**
     * BitSet 创建一个特殊的数组来保存位值
     */
     public void test2(){
         BitSet bitSet1=new BitSet(16);
         BitSet bitSet2=new BitSet(16);
         for (int i=0;i<16;i++){
             if(i%2==0){
                 bitSet1.set(i);
             }
             if(i%5!=0){
                 bitSet2.set(i);
             }
         }
         System.out.println("bitSet1="+bitSet1+"\n");
         System.out.println("bitSet2="+bitSet2);
         //and
         bitSet2.and(bitSet1);
         System.out.println("bitSet2="+bitSet2);
         // or
         bitSet2.or(bitSet1);
         System.out.println("bitSet2="+bitSet2);
         //xor
         bitSet2.xor(bitSet1);
         System.out.println("bitSet2="+bitSet2);
     }










}

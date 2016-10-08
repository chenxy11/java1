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
     * Vector实现了一个动态的数组 和ArrayList相似
     * 但又不同
     * Vector 是同步访问的
     * Vector 包含了许多传统的方法 这些方法是不属于集合框架的
     * 提供了4中构造方法
     * 1 new Vector();创建一个默认的向量 默认大小为10
     * 2 new Vector(int size);构建指定大小的向量
     * 3 new Vector(int size,int incr);构建制定大小为size,每次增加的个数为incr
     * 4 new Vector(Collection c); 构建一个包含集合元素c 的向量。
     */
    public void  test3(){
        java.util.Vector vector;
        vector = new java.util.Vector(3,2);
        //返回当前向量存放元素的个数
        System.out.println("initial size:"+vector.size());
        //返回当前向量的容量
        System.out.println("initial capacity:"+vector.capacity());
        vector.addElement(new Integer(1));
        vector.addElement(new Integer(2));
        vector.addElement(new Integer(3));
        vector.addElement(new Integer(4));
        System.out.println("capacity four three additions :"+vector.capacity());
        vector.firstElement();//返回当前向量的第一个元素
        vector.lastElement();//返回当前向量的最后一个元素
        vector.elements();//返回当前向量的枚举



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

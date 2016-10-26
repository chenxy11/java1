package com.chenxy.java2;

import java.util.Arrays;

/**
 * 数组排序|| 二分查找|| 插入元素
 */
public class Java2Prac04 {


    public  void  test(){
        int[] arry={-9,9,8,12,23,3,0,1};
        Arrays.sort(arry);
        int index=Arrays.binarySearch(arry,-9);
        System.out.println(arry.toString());
        System.out.println();
        System.out.println(index);
    }


    public static void main(String[] args){
        new Java2Prac04().test2();
    }

    public void test2(){
        int[] arry={-9,9,8,12,23,3,0,1};
        Arrays.sort(arry);
        int index=Arrays.binarySearch(arry,-6);
        int newIndex=-index-1;
        arry=insertElement(arry,2,newIndex);
        printArray(arry);

    }

    private void printArray(int[] arry) {
        for(int i:arry){
            System.out.println(i+"\n");
        }
    }

    public int[] insertElement(int[] original,int element,int index){
        int length=original.length;
        int[] desitination=new int[length+1];
        System.arraycopy(original, 0, desitination, 0, length);
        desitination[index]=element;
        System.arraycopy(original, index, desitination, index
                + 1, length - index);
        return desitination;
    }
}

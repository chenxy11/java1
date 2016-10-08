package com.chenxy.java1;

import java.util.Stack;

/**
 * @since 1.0
 * @see com.chenxy.java1.Java1Prac6
 * @version 1.0
 * @author admin
 * @desc java Stack
 * 后进先出
 *  继承自Vector
 */
public class Java1Prac6 {
    /**
     * Stack 特有的方法
     */
    public void  test(){
        Stack stack=new Stack<String>();//创建一个空栈
        boolean isEmpty=stack.empty();//empty() 判断这个栈是否为空
        Object obj=stack.peek();//查看栈顶的元素，但是不移除
        Object obj1=stack.pop();//将栈顶的元素移除 返回栈顶的元素
        Object obj2=stack.push(new Object());//将元素压入栈顶
        //返回对象在栈顶的位置 以1为基数
        stack.search(new Object());
    }



}

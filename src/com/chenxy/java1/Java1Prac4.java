package com.chenxy.java1;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/***
 * @version 1.0
 * @since 1.0
 * @author admin
 * @see com.chenxy.java1.Java1Prac4
 * @desc javaNio 解决传统IO的问题
 */
public class Java1Prac4 {
    /**
     * 传统的读取文件
     * inputStream 是读取文件提供的一个通道
     * @throws IOException
     */
    public void test1() throws IOException {
        File file=new File("");
        InputStream inputStream=new FileInputStream(file);
        byte[] bytes=new byte[1024];
        inputStream.read(bytes);//inputStream 通道 读取的数据放在bytes中
        inputStream.close();
    }
    /**
     * javaNIo 关键的三个名词
     * 1 Channel 通道 是双向的既可以1读取文件 也可以写入数据 而inputStream和outputStream 是单向的
     * 2 buffer 使用javaNIO 进行读取数据和写入数据必须把数据放入Buffer中
     * 3 Selector 用来轮询每个注册的Channel ，一旦发现有注册的Selector ,获取事件进行处理/
     */
    /**
     * Thread---Selector---->1 Channel 2 Channnel 3 Channel 等
     * 单线程处理一个Selector ,调用Selector.select()方法获取到达的事件 进行相应处理
     */
    /**
     * 常用的通道
     * 1 FileChannel
     * 2 SocketChannel
     * 3 ServerSocketChannel
     * 4 DatagramSocket
      */

    public void tesst2() throws IOException {
         FileOutputStream outputStream=new FileOutputStream(new File(""));
         FileChannel fileChannel=outputStream.getChannel();
         ByteBuffer byteBuffer=ByteBuffer.allocate(1024);
         String string="使用javaNIO FileChannel 在文件中写入数据";
         byteBuffer.put(string.getBytes());//将要写入的数据放入byteBUffer 中
         byteBuffer.flip();//调用buffer.flip()
         fileChannel.write(byteBuffer);
         fileChannel.close();
         outputStream.close();
    }

//    public void test3() throws IOException{
//        FileOutputStream outputStream=new FileOutputStream(new File(""));
//        FileChannel fileChannel=outputStream.getChannel();
//        String string ="javaNIO";
//        ByteBuffer buffer=ByteBuffer.allocate(1024);
//        buffer.put(string.getBytes());//缓冲区  连续数组
//        buffer.flip();
//        fileChannel.write(buffer);
//        fileChannel.close();
//        outputStream.close();
//    }

    /**
     * client-data-buffer--data-channel--data-channel--data-buffer-data-server
     */
    /**
     * 常用的buffer子类
     * ByteBuffer
     * IntBUffer
     * CharBUffer
     * LOngBuffer
     * DoubleBUffer
     * FloatBUffer
     * SHortBUffer
     *
     */
}

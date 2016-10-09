package com.chenxy.java1;

import java.io.*;
import java.net.JarURLConnection;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.jar.JarFile;

/**
 * @author admin
 * @since 1.0
 * @see com.chenxy.java1.Java1Prac9
 * @version 1.0
 * @<desc>
 *     网络编程：编写运行在多个设备机器上的程序，多个设备通过网络链接起来。
 *     基于java.net 包下的通信细节的实现。可以直接调用。
 * </desc>
 *   /**
 * @<description>
 *     java.net包下提供了两种网络协议的支持
 *     TCP：传输控制协议   ----作用在于：通信
 *     UDP：用户数据协议  -----作用在于：发送数据包
 * </description>
 * @throws MalformedURLException
 */

public class Java1Prac9 {
        /**
         *@<description>
         *     Socket编程
          *</description>
         *
         * <p>
         *     关键词：
         *            客户端写法 不涉及多线程数据安全的考虑
         *            socket 建立通信
         *            DataOutputStream 向远程机器发送数据
         *            dataInputStream 接收远程机器的响应信息
         * </p>
         */
         public void testClient()  {
            try {
                Socket socket=new Socket("127.0.0.1",8081);
                System.out.println("connecting to serverName "+socket.getInetAddress()+":port"+socket.getPort());
                System.out.println("just connect to "+socket.getRemoteSocketAddress());
                OutputStream outputStream=socket.getOutputStream();
                DataOutputStream dataOutputStream=new DataOutputStream(outputStream);
                dataOutputStream.writeUTF("hello from "+socket.getRemoteSocketAddress());
                InputStream inputStream=socket.getInputStream();
                DataInputStream dataInputStream=new DataInputStream(inputStream);
                String serverSays=dataInputStream.readUTF();
                System.out.println("server says "+serverSays);
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /**
         * @<description>
         *     Socket 编程之服务器端写法
         * </description>
         * <p>
         *      监听客户端的通信信息
         *      发送来的数据
         *      应该是一个线程
         *      一直在监听一个端口的信息
         * </p>
         * <keywords>
         *     ServerSocket 对象 ---本地开启一个端口
         *     serverSocket.accept()---可以得到与服务器建立连接的端口信息
         *
         * </keywords>
         *
         */
        class ServerClient implements Runnable{
            private ServerSocket serverSocket;
            public ServerClient(int port){
                try {
                    serverSocket=new ServerSocket(port);
                } catch (IOException e) {
                    System.out.println("指定端口异常:"+port);
                    e.printStackTrace();
                }
            }
            @Override
            public void run() {
                while(true){
                    System.out.println("waiting for client on :"+serverSocket.getLocalPort());
                    try {
                        Socket server=serverSocket.accept();
                        System.out.println("just connect to "+server.getRemoteSocketAddress());
                        InputStream inputStream=server.getInputStream();
                        DataInputStream dataInputStream=new DataInputStream(inputStream);
                        String messageFromClient=dataInputStream.readUTF();
                        System.out.println("from client "+messageFromClient);
                        OutputStream outputStream=server.getOutputStream();
                        DataOutputStream dataOutputStream=new DataOutputStream(outputStream);
                        dataOutputStream.writeUTF("thank you connecting to "+server.getLocalSocketAddress());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        }

}

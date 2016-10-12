package com.chenxy.java1;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
 import java.util.Properties;

/**
 * @version 1.0
 * @since 1.0
 * @see com.chenxy.java1.Java1Prac10
 * @author admin
 * @desc  使用java发送邮件非常简单：
 *<p>
 *     机器上安装javaMailAPI 与 JavaActivationFramework (JAF)
 *     将jar包添加到classPath 中
 *     发送邮件的了解。
 *</p>
 *
 */
public class Java1Prac10 {

    public static void main(String[] args){
        try {
            new Java1Prac10().test();
        } catch (MessagingException e) {
             e.printStackTrace();
        }
    }

    /**
     * Session 是共享的
     * @see javax.mail.Authenticator   认证---对于网络访问某一个对象信息时的认证。
     * @see javax.mail.Session       代表了 mail Session 提供了协议访问的权限--协议必须是
     *                               实现了Store/Transport
     *
     * @throws MessagingException
     */
    public void test() throws MessagingException {
        String to="779780284@qq.com";
        String from="779780284@qq.com";
        String host="localhost";
        Properties properties=System.getProperties();
        /**
         * java 中方法执行之前被调用
         *
         */
//        SecurityManager securityManager=System.getSecurityManager();
//        securityManager.checkConnect();
        properties.setProperty("mail.smtp.host",host);
        Session session=Session.getDefaultInstance(properties);
        MimeMessage mimeMessage=new MimeMessage(session);
        mimeMessage.setFrom(new InternetAddress(from));
        mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
        mimeMessage.setSubject("this is the Subject line!");
        mimeMessage.setText("this is text");
        Transport.send(mimeMessage);
    }


}

package com.chenxy.java1;

import java.beans.Transient;
import java.io.*;

/**
 * java 序列化与反序列化
 * 序列化的本质是将对象数据写入文件火内存中
 * 反序列化本质就是从文件或内存中将对象信息读取出来
 *
 */
public class Java1Prac8 {

    /**
     * 关键对象
     * ObjectOutputStream.write();
     */
    public  void  test(){
        Employee employee=new Employee();
        employee.setId("1");
        employee.setName("admin");
        employee.setAge("10");
        employee.setSex("男");
        employee.setNameAge("admin10");
        try{
            //1 序列化
            // 将其写入到文件中
            FileOutputStream fileOutputStream=new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.write(employee.toString().getBytes());
            objectOutputStream.close();
            fileOutputStream.close();
         }catch (IOException e){
            e.printStackTrace();
         }
    }

    /**
     * 反序列化：将对象的属性从文件内读取出来
     * 关键对象：ObjectInputStream.readObject();
     */
    public void test2() {
        try {
            Employee employee=null;
            FileInputStream fileInputStream=new FileInputStream("");
            ObjectInputStream objectInputStream;
            objectInputStream = new ObjectInputStream(fileInputStream);
            employee= (Employee) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println(employee.getName());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }





    class  Employee implements Serializable{
        private String id;
        private String name;
        private String age;
        private String sex;

        private String nameAge;
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }
        @Transient
        public String getNameAge() {
            return nameAge;
        }
        @Transient
        public void setNameAge(String nameAge) {
            this.nameAge = nameAge;
        }
    }
}



package com.chenxy.utils.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * Created by admin on 2016/9/29.
 */
public abstract class OracleUtils {

    public static String username= null;
    public static String password=null;
    public static String conUrl=null;
    public static String driver=null;
    public static Connection connection=null;
    static {
          username= ResourceBundle.getBundle("oracle").getString("username");
          password=ResourceBundle.getBundle("oracle").getString("password");
          conUrl=ResourceBundle.getBundle("oracle").getString("url");
          driver=ResourceBundle.getBundle("oracle").getString("driver");
    }
    public static Connection getConnection(){
        try {
            if(connection==null){
                Class.forName(driver);
                return DriverManager.getConnection(conUrl,username,password);
            }else{
                return connection;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
     }


}

package com.chenxy.utils.common;

import java.sql.Connection;
import java.util.ResourceBundle;

/**
 * Created by admin on 2016/9/29.
 */
public abstract class OracleUtils {

    public static String username= null;
    public static String password=null;
    public static String conUrl=null;

    static {
          username= ResourceBundle.getBundle("oracle").getString("username");
          password=ResourceBundle.getBundle("oracle").getString("password");
          conUrl=ResourceBundle.getBundle("oracle").getString("url");

    }
    public static Connection getConnection(){

        return null;
    }


}

package com.chenxy.utils.common;

import com.chenxy.utils.basedata.FormPropertyInfo;

import java.util.Date;
import java.util.List;

/**
 * Created by admin on 2016/10/24.
 */
public class FormAndDatabase {

    /**
     * 通过用户输入的表单信息来生成创建数据库的表的sql语句
     * @param list
     */
    public static String createTable(List<FormPropertyInfo> list){
        //1 表名：user_define_(当前时间的毫秒数)
        String table_name="user_define_"+new Date().getTime();
        String createTableSql="create table "+table_name+" (";
        createTableSql+="id VARCHAR2(64) not null,";
        for(FormPropertyInfo property:list){
            createTableSql+=""+property.getPropertyName()+" "+property.getPropertyType()+"";
            if(property.getPropertyLength()!=null&&!"".equals(property.getPropertyLength())){
                createTableSql+="("+property.getPropertyLength()+")";
            }
            createTableSql+=",";

        }
        createTableSql=createTableSql.substring(0,createTableSql.length()-1);
        createTableSql+=")";
        return createTableSql;
    }




}

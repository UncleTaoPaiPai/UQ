package com.zyz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest {

    //使用JDBC
    public static void main(String[] args) throws Exception{

        // 加载JDBC驱动程序
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 建立数据库连接Connection
        String username = "root";
        String password = "123456";
        String url = "jdbc:mysql://127.0.0.1:3306/login";

        // 创建执行SQL的语句statement
        Connection connection = DriverManager.getConnection(url, username, password);

        // 处理执行结果ResultSet
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from products");
        while(resultSet.next()) {
            System.out.println("Video's names =" + resultSet.getString("video_name"));
        }
        // 释放连接资源
        statement.close();
        connection.close();
    }

    public static void test01() throws Exception{

        // 加载JDBC驱动程序
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 建立数据库连接Connection
        String username = "root";
        String password = "123456";
        String url = "jdbc:mysql://127.0.0.1:3306/login";

        // 创建执行SQL的语句statement
        Connection connection = DriverManager.getConnection(url, username, password);

        // 处理执行结果ResultSet
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from products");
        while(resultSet.next()) {
            System.out.println("Video's names =" + resultSet.getString("video_name"));
        }
        // 释放连接资源
        statement.close();
        connection.close();
    }

}

package com.zyz.utill;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @Auther : YongggzHi
 * @Date : 2021/8/6 - 13:36
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */

//数据库连接工具
public class DataSourceUtill {

    private static DataSource dataSource;

    static {
        try{
            InputStream resourceAsStream = DataSourceUtill.class.getClassLoader().getResourceAsStream("database.properties");
            Properties properties = new Properties();
            properties.load(resourceAsStream);
            dataSource = BasicDataSourceFactory.createDataSource(properties);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *获取连接池
     * */
    public static DataSource getDataSource() {
        return dataSource;
    }

}

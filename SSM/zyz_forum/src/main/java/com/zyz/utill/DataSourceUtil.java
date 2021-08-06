package com.zyz.utill;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Auther : YongggzHi
 * @Date : 2021/8/5 - 18:44
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */


// 数据库连接池工具
public class DataSourceUtil {

    private static DataSource dataSource;

    static {
        try {
            InputStream in = DataSourceUtil.class.getClassLoader().getResourceAsStream("database.properties");
            Properties p = new Properties();
            p.load(in);
            dataSource = BasicDataSourceFactory.createDataSource(p);
        }catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError("初始化DBPC失败");
        }
    }

    /**
     *  获取连接池
     * */
    public static DataSource getDataSource() {
        return dataSource;
    }
}

package com.zyz.dao;

import com.zyz.domain.dept;
import com.zyz.utill.DataSourceUtill;
import org.apache.commons.dbutils.*;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @Auther : YongggzHi
 * @Date : 2021/8/6 - 13:43
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */
public class deptDao {

    private QueryRunner queryRunner = new QueryRunner(DataSourceUtill.getDataSource());

    //开启驼峰映射
    private BeanProcessor beanProcessor = new GenerousBeanProcessor();
    private RowProcessor processor = new BasicRowProcessor(beanProcessor);



    public List<dept> list() {
        String sql = "select * from dept";
        List<dept> list = null;

        try{
            list=queryRunner.query(sql, new BeanListHandler<>(dept.class,processor));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;

    }

}

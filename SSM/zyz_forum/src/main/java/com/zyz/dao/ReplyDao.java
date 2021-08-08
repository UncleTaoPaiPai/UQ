package com.zyz.dao;

import com.zyz.utill.DataSourceUtil;
import org.apache.commons.dbutils.*;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;

/**
 * @Auther : YongggzHi
 * @Date : 2021/8/7 - 23:32
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */
public class ReplyDao {

    private QueryRunner queryRunner = new QueryRunner(DataSourceUtil.getDataSource());
    //开启驼峰映射
    private BeanProcessor beanProcessor = new GenerousBeanProcessor();
    private RowProcessor processor = new BasicRowProcessor(beanProcessor);


    public int countTotalReplyByCid(int cId) {
        String sql = "select count(*) from reply where topic_id = ?";
        Long count = null;
        try {
            count = (Long)queryRunner.query(sql, new ScalarHandler<>(), cId);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return count.intValue();
    }



}

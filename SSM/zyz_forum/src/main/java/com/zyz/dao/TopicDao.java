package com.zyz.dao;

import com.zyz.domain.Topic;
import com.zyz.utill.DataSourceUtil;
import org.apache.commons.dbutils.*;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @Auther : YongggzHi
 * @Date : 2021/8/7 - 23:11
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */
public class TopicDao {

    private QueryRunner queryRunner = new QueryRunner(DataSourceUtil.getDataSource());

    //开启驼峰映射
    private BeanProcessor beanProcessor = new GenerousBeanProcessor();
    private RowProcessor processor = new BasicRowProcessor(beanProcessor);




    public int countTotalByCid(int cId) {
        String sql = "select * from topic where c_id = ? and delete = 0";
        Long count = null;
        try {
            count = (Long)queryRunner.query(sql, new ScalarHandler<>(), cId);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return count.intValue();
    }

    public List<Topic> findListByCid(int cId, int from, int pageSize) {

        String sql = "select * from topic where c_id=? and `delete`=0 order by update_time desc limit ?,?";

        List<Topic> list = null;
        try{
            list = queryRunner.query(sql,new BeanListHandler<>(Topic.class,processor),cId,from,pageSize);
        }catch (Exception e){
            e.printStackTrace();
        }

        return list;
    }

    public Topic findById(int topicId) {
        String sql = "select * from topic where id = ?";
        Topic topic = null;
        try{
            topic = queryRunner.query(sql,new BeanHandler<>(Topic.class,processor),topicId);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  topic;
    }


}

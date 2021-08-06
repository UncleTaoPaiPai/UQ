package com.zyz.dao;

import com.zyz.domain.Category;
import com.zyz.utill.DataSourceUtil;
import org.apache.commons.dbutils.*;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;


/**
 * @Auther : YongggzHi
 * @Date : 2021/8/5 - 19:56
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */
public class CategoryDao {

    private QueryRunner queryRunner = new QueryRunner(DataSourceUtil.getDataSource());

    //开启驼峰映射
    private BeanProcessor beanProcessor = new GenerousBeanProcessor();
    private RowProcessor processor = new BasicRowProcessor(beanProcessor);

    /**
     * 根据id找分类
     * */
    public Category findById(int id) {
        String sql = "select * from category where id = ?";
        Category category = null;
        try {
            category = queryRunner.query(sql,new BeanHandler<>(Category.class,processor),id);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return category;
    }

    /**
     * 返回分类列表
     * */

    public List<Category> list() {
        String sql = "select * from category ";
        List<Category> list = null;
        try{
            list = queryRunner.query(sql,new BeanListHandler<>(Category.class,processor));
        }catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }

}

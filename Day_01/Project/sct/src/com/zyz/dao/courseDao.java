package com.zyz.dao;

import com.zyz.dao.impl.courseDaoImpl;
import com.zyz.entity.course;
import com.zyz.util.PropertiesUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class courseDao implements courseDaoImpl {


    @Override
    public void add(course course) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "insert into course(cname,cid) values(?,?)";
        queryRunner.update(sql,course.getcName(),course.getCid());
    }

    @Override
    public void delete(Integer cid) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "delete from course where id = ?";
        queryRunner.update(sql,cid);
    }

    @Override
    public void update(course course) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "update course set cname = ?, tid = ? where cid =?";
        queryRunner.update(sql,course.getcName(),course.getCid(),course.getCid());
    }

    @Override
    public List<course> list(course course) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "select * from course";
        List<course> list = queryRunner.query(sql, new BeanListHandler<>(course.class));
        return list;
    }

    @Override
    public course findById(Integer cid) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "select * from course where cid = ?";
        course course = queryRunner.query(sql,new BeanHandler<>(course.class),cid);
        return course;
    }
}

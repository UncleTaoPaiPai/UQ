package com.zyz.dao;

import com.zyz.dao.impl.teacherDaoImpl;
import com.zyz.entity.teacher;
import com.zyz.util.PropertiesUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class teacherDao implements teacherDaoImpl {


    @Override
    public void add(teacher teacher) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "insert into teacher(tName,userName,pwd) values(?,?,?)";
        queryRunner.update(sql,teacher.gettName(),teacher.getUserName(),teacher.getPwd());
    }

    @Override
    public void delete(Integer tid) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "delete from teacher where tid = ?";
        queryRunner.update(sql,tid);
    }

    @Override
    public void update(teacher teacher) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "update teacher set tName = ?, pwd = ? where tid =?";
        queryRunner.update(sql,teacher.gettName(),teacher.getPwd(),teacher.gettid());
    }

    @Override
    public List<teacher> list(teacher teacher) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "select * from teacher";
        List<teacher> list = queryRunner.query(sql, new BeanListHandler<>(teacher.class));
        return list;
    }

    @Override
    public teacher findById(Integer tid) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "select * from teacher where tid = ?";
        teacher teacher = queryRunner.query(sql, new BeanHandler<>(teacher.class),tid);
        return teacher;
    }

    public teacher login(String userName,String pwd) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "select * from teacher where userName = ? and pwd = ?";
        teacher teacher = queryRunner.query(sql, new BeanHandler<>(teacher.class),userName,pwd);
        return teacher;
    }
}

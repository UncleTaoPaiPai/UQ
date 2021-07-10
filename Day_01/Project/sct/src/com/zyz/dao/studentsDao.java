package com.zyz.dao;

import com.zyz.dao.impl.studentsDaoImpl;
import com.zyz.entity.students;
import com.zyz.util.PropertiesUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class studentsDao implements studentsDaoImpl {


    @Override
    public void add(students students) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "insert into students(stuName,stuNo,stuPwd) values(?,?,?)";
        queryRunner.update(sql,students.getStuName(),students.getStuNo(),students.getStuPwd());
    }

    @Override
    public void delete(Integer stuid) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "delete from students where stuid = ?";
        queryRunner.update(sql,stuid);
    }

    @Override
    public void update(students students) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "update students set stuName = ?, stuNo = ?, stuPwd = ? where stuid =?";
        queryRunner.update(sql,students.getStuName(),students.getStuNo(),students.getStuPwd(),students.getStuid());
    }

    @Override
    public List<students> list(students students) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "select * from students";
        List<students> list = queryRunner.query(sql, new BeanListHandler<>(students.class));
        return list;
    }

    @Override
    public students findById(Integer id) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "select * from students where id = ?";
        students students = queryRunner.query(sql, new BeanHandler<>(students.class),id);
        return students;
    }

    public students login(String stuNo, String stuPwd) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "select * from students where stuNo=? and stuPwd = ?";
        students students = queryRunner.query(sql, new BeanHandler<>(students.class),stuNo,stuPwd);
        return students;
    }
}

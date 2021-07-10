package com.zyz.dao;

import com.zyz.dao.impl.adminDaoImpl;
import com.zyz.entity.admin;
import com.zyz.util.PropertiesUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class adminDao implements adminDaoImpl {


    @Override
    public void add(admin admin) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "insert into admin(username,pwd,name) values(?,?,?)";
        queryRunner.update(sql,admin.getUsername(),admin.getPwd(),admin.getName());
    }

    @Override
    public void delete(Integer id) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "delete from admin where id = ?";
        queryRunner.update(sql,id);
    }

    @Override
    public void update(admin admin) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "update admin set userName = ?, pwd = ?, name = ? where id =?";
        queryRunner.update(sql,admin.getUsername(),admin.getPwd(),admin.getName(),admin.getId());
    }

    @Override
    public List<admin> list(admin admin) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "select * from admin";
        List<admin> list = queryRunner.query(sql, new BeanListHandler<>(admin.class));
        return list;
    }

    @Override
    public admin findById(Integer id) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "select * from admin where id = ?";
        admin admin = queryRunner.query(sql, new BeanHandler<>(admin.class),id);
        return admin;
    }

    public admin login(admin admin) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "select * from admin where username = ? and pwd = ?";
        admin entity = queryRunner.query(sql, new BeanHandler<>(admin.class), admin.getUsername(), admin.getPwd());
        return entity;
    }


}

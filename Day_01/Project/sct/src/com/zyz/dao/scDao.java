package com.zyz.dao;

import com.zyz.dao.impl.scDaoImpl;
import com.zyz.entity.sc;
import com.zyz.util.PropertiesUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class scDao implements scDaoImpl {

    @Override
    public void add(sc sc) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "insert into sc(stuid,cid,score) values(?,?,?)";
        queryRunner.update(sql,sc.getStuid(),sc.getCid(),sc.getScore());
    }

    @Override
    public void delete(Integer scid) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "delete from sc where scid = ?";
        queryRunner.update(sql,scid);
    }

    @Override
    public void update(sc sc) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "update sc set score = ? where scid =?";
        queryRunner.update(sql,sc.getScore(),sc.getScid());
    }

    @Override
    public List<sc> list(sc sc) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "select * from sc";
        List<sc> list = queryRunner.query(sql, new BeanListHandler<>(sc.class));
        return list;
    }

    @Override
    public sc findById(Integer id) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "select * from sc where id = ?";
        sc sc = queryRunner.query(sql, new BeanHandler<>(sc.class),id);
        return sc;
    }
}

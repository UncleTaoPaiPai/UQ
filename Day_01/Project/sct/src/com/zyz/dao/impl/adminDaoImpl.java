package com.zyz.dao.impl;

import com.zyz.entity.admin;

import java.sql.SQLException;
import java.util.List;

public interface adminDaoImpl {

    public void add(admin admin) throws SQLException;

    public void delete(Integer id) throws SQLException;

    public void update(admin admin)throws SQLException;

    public List<admin> list(admin admin) throws SQLException;

    public admin findById(Integer id) throws SQLException;





}

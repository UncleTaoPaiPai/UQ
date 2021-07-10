package com.zyz.dao.impl;


import com.zyz.entity.sc;

import java.sql.SQLException;
import java.util.List;

public interface scDaoImpl {

    public void add(sc sc) throws SQLException;

    public void delete(Integer scid) throws SQLException;

    public void update(sc sc) throws SQLException;

    public List<sc> list(sc sc) throws SQLException;

    public sc findById(Integer id) throws SQLException;
}

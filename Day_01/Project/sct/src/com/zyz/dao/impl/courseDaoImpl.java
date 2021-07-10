package com.zyz.dao.impl;


import com.zyz.entity.course;

import java.sql.SQLException;
import java.util.List;

public interface courseDaoImpl {

    public void add(course course) throws SQLException;

    public void delete(Integer cid) throws SQLException;

    public void update(course course) throws SQLException;

    public List<course> list(course course) throws SQLException;

    public course findById(Integer cid) throws SQLException;
}

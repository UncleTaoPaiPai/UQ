package com.zyz.dao.impl;

import com.zyz.entity.students;

import java.sql.SQLException;
import java.util.List;

public interface studentsDaoImpl {


    void add(students students) throws SQLException;

    void delete(Integer id) throws SQLException;

    void update(students students) throws SQLException;

    List<students> list(students students) throws SQLException;

    students findById(Integer id) throws SQLException;
}

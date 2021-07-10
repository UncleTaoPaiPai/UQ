package com.zyz.dao.impl;

import com.zyz.entity.teacher;

import java.sql.SQLException;
import java.util.List;

public interface teacherDaoImpl {
    void add(teacher teacher) throws SQLException;

    void delete(Integer stuid) throws SQLException;

    void update(teacher teacher) throws SQLException;

    List<teacher> list(teacher teacher) throws SQLException;

    teacher findById(Integer id) throws SQLException;
}

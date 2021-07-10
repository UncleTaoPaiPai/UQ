package com.zyz.dao.impl;

import com.zyz.dao.StudentDao;
import com.zyz.pojo.Student;

import java.util.List;

public class StudentDaoImpl extends BaseDao implements StudentDao {

    @Override
    public List<Student> findBypage(int currentPage, int pageSize) {

        String sql="select * from emp limit ?,?";
        List list =baseQuery(Student.class,sql,(currentPage -1) * pageSize,pageSize);
        return list;
    }

    @Override
    public int findTotalSize() {
        return 0;
    }
}

package com.zyz.dao;

import com.zyz.pojo.Student;

import java.util.List;

public interface StudentDao {

    //通过形参返回一个list的方法
    List<Student> findBypage(int currentPage, int pageSize);


    int findTotalSize();
}

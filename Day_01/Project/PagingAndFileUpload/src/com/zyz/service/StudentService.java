package com.zyz.service;

import com.zyz.pojo.PageBean;
import com.zyz.pojo.Student;

public interface StudentService {
    PageBean<Student> findByPage(int currentPage, int pageSize);
}

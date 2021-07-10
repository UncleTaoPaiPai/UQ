package com.zyz.mapper;

import com.zyz.pojo.Dept;

public interface DeptMapper {

    Dept selectDeptById(int id) throws Exception;
}
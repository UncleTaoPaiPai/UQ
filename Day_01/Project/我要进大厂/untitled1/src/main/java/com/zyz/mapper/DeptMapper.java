package com.zyz.mapper;

import com.zyz.pojo.Dept;

import java.util.List;

public interface DeptMapper {


    List<Dept> selectAll() throws Exception;
}

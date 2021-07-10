package com.zyz.mapper;

import com.zyz.pojo.dept;

import java.util.List;

public interface deptMapper {

    //查询所有部门信息
    List<dept> selectAll() throws Exception;

    //根据主键查询单个部门信息
    dept selectOneById(int id) throws Exception;

    //插入部门信息
    int insertDept(dept dept) throws Exception;

    //修改部门信息
    int updateDept(dept dept) throws Exception;

    //删除部门信息
    int deleteDept(int id) throws Exception;

}

package com.zyz.mapper;

import com.zyz.pojo.Dept;

import java.io.IOException;
import java.util.List;

public interface DeptMapper {


    //  查询全部Dept
    List<Dept> selectAll() throws IOException;

    //    根据主键查询单个部门的信息
    Dept selectOneByid(int id) throws IOException;

    //    插入Dept
    int insertDept(Dept dept) throws IOException;

    //    修改Dept
    int updateDept(Dept dept) throws IOException;

    //    删除Dept
    int deleteDept(int id) throws IOException;
}

package com.zyz.mapper;

import com.zyz.pojo.Dept;

import java.io.IOException;
import java.util.List;

public interface DeptMapper {

//    查看所有的Dept
    List<Dept> selectAll() throws IOException;


//    根据id查看Dept
    Dept selectOneByid(int id) throws IOException;

//    增加Dept
    int insertDept(Dept dept) throws IOException;

//    删除Dept根据id
    int deleteDept(int id) throws IOException;

//    修改Dept
    int updateDept(Dept dept) throws IOException;




}

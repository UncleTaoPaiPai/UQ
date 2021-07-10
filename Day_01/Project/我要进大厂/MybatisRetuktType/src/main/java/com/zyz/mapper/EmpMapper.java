package com.zyz.mapper;

import com.zyz.pojo.Emp;

import java.util.List;

public interface EmpMapper {

    List<Emp> selectAllEmp() throws Exception;

}
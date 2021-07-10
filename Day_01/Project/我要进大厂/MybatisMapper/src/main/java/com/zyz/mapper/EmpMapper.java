package com.zyz.mapper;

import com.zyz.pojo.Emp;

import java.util.List;
import java.util.Map;

public interface EmpMapper {

    List<Emp> selectEmpBysalname(Emp emp) throws Exception;

    List<Emp> selectEmpByinfo(Emp emp) throws Exception;

    int insertEmp(Emp emp) throws Exception;

    int updateEmp(Emp emp) throws Exception;

    List<Emp> selectEmpByempnos(List<Integer> list) throws Exception;

    List<Emp> selectEmpByArray(int[] arr) throws Exception;

    List<Emp> selectEmpByMap(Map<String, List<Integer>> map) throws Exception;

    List<Emp> selectEmpByMapInfo(Map<String,Object> map) throws Exception;

}
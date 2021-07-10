package com.zyz.mapper;
import java.util.List;
import java.util.Map;

import com.zyz.pojo.Emp;

public interface EmpMapper {

    List<Emp> selectEmpBysalename(Emp emp) throws Exception;

    List<Emp> selectEmpByinfo(Emp emp) throws Exception;

    int insertEmp(Emp emp) throws Exception;

    List<Emp> selectEmpByempnos (List<Integer> list) throws Exception;

    List<Emp> selectEmpByArray(int[] arr) throws Exception;

    List<Emp> selectEmpByMap(Map<String,List<Integer>> map) throws Exception;

    List<Emp> selectEmpByMapinfo(Map<String,Object> map) throws Exception;

}
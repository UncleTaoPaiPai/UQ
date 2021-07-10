package com.zyz.mapper;

import com.zyz.pojo.Dept;
import java.util.List;

public interface deptMapper {

    public int insertDept(Dept record);
    public int deleteDept(int deptno);
    public List<Dept> selectAll();

}

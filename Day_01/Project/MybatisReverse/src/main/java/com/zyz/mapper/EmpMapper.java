package com.zyz.mapper;
import java.util.List;
import com.zyz.bean.Emp;

public interface EmpMapper {
    List<Emp> selectEmpBysalename(Emp emp) throws Exception;

}
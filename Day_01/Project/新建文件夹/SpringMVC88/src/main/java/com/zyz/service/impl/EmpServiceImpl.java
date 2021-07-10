package com.zyz.service.impl;

import com.zyz.mapper.EmpMapper;
import com.zyz.pojo.Emp;
import com.zyz.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("empService")
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    public EmpMapper getEmpMapper() {
        return empMapper;
    }

    public void setEmpMapper(EmpMapper empMapper) {
        this.empMapper = empMapper;
    }

    @Override
    public List<Emp> findAll() {
        return empMapper.selectAllAndDept();
    }
}

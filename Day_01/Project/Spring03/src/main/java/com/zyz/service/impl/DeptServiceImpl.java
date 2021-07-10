package com.zyz.service.impl;

import com.zyz.mapper.deptMapper;
import com.zyz.pojo.Dept;
import com.zyz.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DeptServiceImpl implements DeptService {

    //通过类型来自动注入
    @Autowired
    private deptMapper deptMapper;

    public deptMapper getDeptMapper() {
        return deptMapper;
    }

    public void setDeptMapper(deptMapper deptMapper) {
        this.deptMapper = deptMapper;
    }

    public int addDept(Dept dept) throws Exception {
        return deptMapper.insertDept(dept);
    }

    public int removeDept(int id) throws Exception {
        return deptMapper.deleteDept(id);
    }

    public List<Dept> findAll() throws Exception {
        return deptMapper.selectAll();
    }
}

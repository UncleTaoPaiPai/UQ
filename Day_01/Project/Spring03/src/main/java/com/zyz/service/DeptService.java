package com.zyz.service;

import com.zyz.pojo.Dept;
import java.util.List;

public interface DeptService {

    public int addDept(Dept dept) throws Exception;

    public int removeDept(int id) throws Exception;

    public List<Dept> findAll() throws Exception;
}

package com.zyz.mapper;

import com.zyz.pojo.Dept;

import java.io.IOException;
import java.util.List;

public interface DeptMapper {


    List<Dept> selectAll() throws IOException;
}

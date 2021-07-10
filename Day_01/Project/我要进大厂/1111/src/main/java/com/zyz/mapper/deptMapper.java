package com.zyz.mapper;

import com.zyz.pojo.dept;

import java.io.IOException;
import java.util.List;

public interface deptMapper {

    List<dept> selectAll() throws IOException;
}

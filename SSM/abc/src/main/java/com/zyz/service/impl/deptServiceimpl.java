package com.zyz.service.impl;

import com.zyz.dao.deptDao;
import com.zyz.domain.dept;
import com.zyz.service.deptService;

import java.util.List;

/**
 * @Auther : YongggzHi
 * @Date : 2021/8/6 - 13:49
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */
public class deptServiceimpl implements deptService {

    private static deptDao deptDao;

    @Override
    public List<dept> list() {
        return deptDao.list();
    }
}

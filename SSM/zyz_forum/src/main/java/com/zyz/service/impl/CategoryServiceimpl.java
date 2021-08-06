package com.zyz.service.impl;

import com.zyz.dao.CategoryDao;
import com.zyz.domain.Category;
import com.zyz.service.CategoryService;

import java.util.List;

/**
 * @Auther : YongggzHi
 * @Date : 2021/8/5 - 19:55
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */
public class CategoryServiceimpl implements CategoryService {

    private CategoryDao categoryDao = new CategoryDao();

    @Override
    public List<Category> list() {
        return categoryDao.list();
    }
}

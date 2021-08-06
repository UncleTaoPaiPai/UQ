package com.zyz.controller;

import com.zyz.dao.CategoryDao;
import com.zyz.domain.Category;
import com.zyz.service.CategoryService;
import com.zyz.service.impl.CategoryServiceimpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Auther : YongggzHi
 * @Date : 2021/8/5 - 19:40
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */

@WebServlet(name = "categoryServlet",urlPatterns = {"/category"})
public class CategoryServlet extends  BaseServlet{

    private CategoryService categoryService = new CategoryServiceimpl();

    /**
     * 返回全部分类
     *
     */
    public void list(HttpServletRequest request, HttpServletResponse response){
        List<Category> list = categoryService.list();
        System.out.println(list.toString());

    }
}

package com.zyz.controller;

import com.zyz.domain.dept;
import com.zyz.service.impl.deptServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Auther : YongggzHi
 * @Date : 2021/8/6 - 14:26
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */
@WebServlet(name = "deptServlet",urlPatterns = {"/dept"})
public class deptServlet extends baseServlet {

    private deptServiceimpl deptServletimpl = new deptServiceimpl();

    public void list(){
        List<dept> list = deptServletimpl.list();
        System.out.println(list.toString());
    }

}

package com.zyz.controller;



import com.zyz.pojo.PageBean;
import com.zyz.pojo.Student;
import com.zyz.service.StudentService;
import com.zyz.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * 1、先发一个请求给controller层，给它发一个当前页的（页码数）和（页大小）
 * 2、把这两个数字给controller，controller接收，之后。
 * 2、调用service层做处理，再响应数字跳转页面就可以了
 * */


@WebServlet(urlPatterns = "/showstudentcontroller.do")
public class ShowStudentController extends HttpServlet {

    private StudentService studentService = new StudentServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /**
         *
         * 从请求中接受数据
         * */
        //1、数据有：页码数
        int currentPage = Integer.parseInt(req.getParameter("currentPage"));
        //2、数据有：页大小
        int pageSize = Integer.parseInt(req.getParameter("pageSize"));


        /**
         *
         * 调用service层服务处理业务逻辑
         * */
        PageBean<Student> pageBean = studentService.findByPage(currentPage,pageSize);
        //将数据放入请求域
        req.setAttribute("pageBean",pageBean);


        /**
         *
         * 响应数据，跳转页面
         * */
        req.getRequestDispatcher("showStudent.jsp").forward(req,resp);

    }
}

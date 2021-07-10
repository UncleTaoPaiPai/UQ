package com.zyz.controller;

import com.zyz.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/logincontroller.do")
public class loginController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");//设置post提交的数据字符集
        //获取用户名和密码
        String user = req.getParameter("username");
        String pwd = req.getParameter("pwd");
        System.out.println("Username:" + user);
        System.out.println("Password:" + pwd);

        //链接数据库校验登录
        //登录成功，将用户信息放入session域
        User user1 = new User(user,pwd);
        req.getSession().setAttribute("user",user);
        resp.sendRedirect("welcome.jsp");


    }
}

package com.zyz.test;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/servlet1")
public class Servlet1 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servlet1 service");
        String money = req.getParameter("money");
        System.out.println("money:" + money);

        //请求转发给另一个组件
        //获得一个请求转发器
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("servlet2");
        //由请求转发器做出转发动作
        requestDispatcher.include(req,resp);

        // forward
        //在forward

    }
}

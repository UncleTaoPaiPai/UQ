package com.zyz;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Auther : YongggzHi
 * @Date : 2021/7/22 - 22:45
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */

@WebServlet(name = "MyServlet",urlPatterns = {"/user/login"})
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        writer.write("<div>zyzhi</div>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String pwd = req.getParameter("pwd");
        System.out.println("你的名字：" + username + "你的密码:" + pwd);

    }
}

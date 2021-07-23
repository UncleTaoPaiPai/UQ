package com.zyz;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther : YongggzHi
 * @Date : 2021/7/23 - 11:25
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */


@WebServlet("/user/log")
public class MyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String pwd = req.getParameter("pwd");
        System.out.println("你的账号是:" + username + "你的密码是:" + pwd);

    }
}

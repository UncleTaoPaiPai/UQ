package com.zyz;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther : YongggzHi
 * @Date : 2021/7/23 - 12:08
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */
@WebServlet(name = "userServlet", urlPatterns = {"/user/login"})
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String pwd = req.getParameter("pwd");
        if (username.equals("zyz") && pwd.equals("123")) {
            System.out.println("sdl");
        }

    }
}

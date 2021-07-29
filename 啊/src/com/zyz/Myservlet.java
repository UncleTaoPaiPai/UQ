package com.zyz;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Myservlet",urlPatterns = "/user/user1")
public class Myservlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String pwd = req.getParameter("pwd");
        if (username.equals("zyz") && pwd.equals("123")) {
            resp.getWriter().write("Hello this system~~~~~~~~~~");
        }else {
            resp.getWriter().write("password wrong or username");
        }

    }
}

package com.zyz.servlet;

import com.zyz.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/mainservlet.do")
public class MainServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //跳转至Main.html

        HttpSession session = req.getSession();
        Object user =session.getAttribute("user");


        if (user != null) {
            //判断如果登录过 允许跳转 HttpSession中如果有登录过的信息
            req.getRequestDispatcher("/WEB-INF/mian.html").forward(req,resp);
        }else {
            //如果没用登录过 回到登录去登录 HttpSession中如果有登录过的信息
            resp.sendRedirect(req.getContextPath()+"/login.html");
        }


    }
}

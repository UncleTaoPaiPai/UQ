package com.zyz.servlet;

import com.zyz.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/mainServlet.do")
public class mainServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //跳转至main.html
        //判断如果登录过 允许跳转    借助HttpSession 中如果有登录过的信息
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");

        if (user != null) {
            //请求转发到

            req.getRequestDispatcher("/WEB-INF/main.html").forward(req,resp);
        } else {
            //重定向
            resp.sendRedirect(req.getContextPath()+"/login.html");
        }
        //如果没有登陆过 回到登录页面去重新登录  HttpSession中如果有登录过的信息

    }
}

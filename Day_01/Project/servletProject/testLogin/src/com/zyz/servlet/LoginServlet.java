package com.zyz.servlet;

import com.zyz.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/loginservlet.do")
public class LoginServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取用户名和密码
        String username =req.getParameter("username");
        String password = req.getParameter("pwd");

        //如果用户名和密码为zyz 88888888
        if (username.equals("zyz") && password.equals("88888888")) {
            //将用户信息放在HttpSession中
            User user = new User(null,null,"zyz","88888888");
            HttpSession session = req.getSession();
            session.setAttribute("user",user);

            //登陆成功 跳转至main.html
            resp.sendRedirect(req.getContextPath()+"/mainservlet.do");


        }else {
            //登录失败 跳转至login.html
            resp.sendRedirect(req.getContextPath()+"/login.html");
        }



    }
}

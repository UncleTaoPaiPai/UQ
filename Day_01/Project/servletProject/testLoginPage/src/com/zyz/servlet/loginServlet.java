package com.zyz.servlet;

import com.zyz.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/loginServlet.do")
public class loginServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取用户名和密码
        String username=req.getParameter("username");
        String password=req.getParameter("pwd");


        if ("zyz".equals(username) && "888".equals(password)) {
            //如果用户名和密码为 zyz 88888888
            // 将用户信息放在HttpSession中

            User user = new User(null,null,"zyz","888");
            HttpSession session = req.getSession();
            session.setAttribute("user",user);
            // 登录成功 跳转至mainservlet

            resp.sendRedirect(req.getContextPath()+"/mainServlet.do");//向mainservlet重定向

        }else {
            // 登录失败 跳转至login.html
            resp.sendRedirect(req.getContextPath()+"/login.html");
        }








    }
}

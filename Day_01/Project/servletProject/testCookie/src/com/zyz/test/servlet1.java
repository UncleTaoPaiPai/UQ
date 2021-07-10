package com.zyz.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/servlet1.do")
public class servlet1 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //通过响应对象，向浏览器响应一些Cookie
        Cookie cookie = new Cookie("age","10");
        Cookie cookie1 = new Cookie("gender","男");
        cookie1.setMaxAge(1000);
        resp.addCookie(cookie);
        resp.addCookie(cookie1);
    }
}

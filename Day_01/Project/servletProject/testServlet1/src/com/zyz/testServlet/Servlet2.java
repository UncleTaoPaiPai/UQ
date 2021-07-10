package com.zyz.testServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

public class Servlet2 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext servletContext1 = this.getServletContext();

        //获取Web.xml中配置的全局的初始信息
//        String username = servletContext1.getInitParameter("username");
//        String password = servletContext1.getInitParameter("password");
//        System.out.println(username + ":" + password);
        Enumeration<String> pnames = servletContext1.getInitParameterNames();
        while (pnames.hasMoreElements()) {
            String e =pnames.nextElement();
            System.out.println(e + ":" + servletContext1.getInitParameter(e));
        }

        List<String> list =(List<String>) servletContext1.getAttribute("list");
        System.out.println(list);
        String gender = (String) servletContext1.getAttribute("gender");
        System.out.println(gender);
    }
}

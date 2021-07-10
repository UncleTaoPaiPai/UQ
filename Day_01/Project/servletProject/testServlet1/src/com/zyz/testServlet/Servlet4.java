package com.zyz.testServlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet4 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletConfig servletConfig = this.getServletConfig();
        System.out.println(servletConfig.getInitParameter("品牌"));
        System.out.println(servletConfig.getInitParameter("屏幕"));
    }
}

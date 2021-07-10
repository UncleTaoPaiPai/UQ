package com.zyz.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/servlet3")
public class Servlet3 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet3 service");
        String money = req.getParameter("money");
        System.out.println("money:" + money);

        //响应重定向
        resp.sendRedirect("servlet4?money="+money);
//        resp.sendRedirect("1.index.html"+money);









    }
}

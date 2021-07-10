package com.zyz.testSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@WebServlet(urlPatterns = "/addToSession.do")
public class Servlet1 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 向Session域中添加数据
        HttpSession session = req.getSession();
        List<String> list  = new ArrayList<>();
        Collections.addAll(list,"a","b","c");
        session.setAttribute("list",list);
        session.setAttribute("gender","boy");

        //重定向
        resp.sendRedirect("readFromRequest.do");

    }
}

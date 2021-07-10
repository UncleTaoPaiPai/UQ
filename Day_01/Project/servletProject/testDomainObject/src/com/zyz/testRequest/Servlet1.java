package com.zyz.testRequest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@WebServlet(urlPatterns = "/addToRequest.do")
public class Servlet1 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 向request域中添加数据
        List<String> list  = new ArrayList<>();
        Collections.addAll(list,"a","b","c");
        req.setAttribute("list",list);
        req.setAttribute("gender","boy");

        // 请求转发
        // forward --- 转发动作
        req.getRequestDispatcher("/readFromRequest.do").forward(req,resp);

    }
}

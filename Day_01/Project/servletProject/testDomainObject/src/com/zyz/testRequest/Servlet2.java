package com.zyz.testRequest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/readFromRequest.do")
public class Servlet2 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //从request域中读取数据
        List<String> list=(List<String>)req.getAttribute("list");
        System.out.println(list);
        System.out.println(req.getAttribute("gender"));

        //获取Request请求中的参数
        System.out.println(req.getParameter("username"));
        System.out.println(req.getParameter("password"));

    }
}

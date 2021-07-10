package com.zyz.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class myServlet extends HttpServlet {

    /**
     *
     * 可以接收浏览器的请求
     * 并作出运算和响应
     * service Servlet服务方法
     *
     * */

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int num = new Random().nextInt();
        String message=num % 2 == 0?"Happy birthday(偶数)":"Happy new year(单数)";

        String decoration="<h1 style = 'color:\"red\"'>"+message+"</h1>";
        PrintWriter printWriter = resp.getWriter();
        printWriter.write(decoration);
    }
}

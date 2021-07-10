package com.zyz.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class loginServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /**
         * HttpServletRequest --- 请求实例化
         *          1.请求行
         *          2.请求头
         *          3.请求体
         *                  由这三个封装成的请求
         *
         * HttpServletResponse --- 响应实例化
         *          1.响应行
         *          2.响应头
         *          3.响应体
         *                  由这三个封装成的响应
         *
         * */
        /* ----------请求行------------ */
        System.out.println(req.getRequestURL());//返回客户端浏览器发出请求时的完整URL
        System.out.println(req.getRequestURI());//返回请求行中指定资源部分
        System.out.println(req.getRemoteAddr());//返回发出请求的客户机的IP地址
        System.out.println(req.getLocalAddr());//返回WEB服务器的IP地址
        System.out.println(req.getLocalPort());//返回WEB服务器处理HTTP协议的连接器所监听的端口
        System.out.println("主机名:" + req.getLocalName());
        System.out.println("客户端PORT：" + req.getRemotePort());
        System.out.println("当前项目部数名" + req.getContextPath());
        System.out.println("协议名" + req.getScheme());
        System.out.println("请求方式:" + req.getMethod());

        System.out.println("-------------------------------");

        /* ------------请求头------------- */
        String userAgent =  req.getHeader("user-agent");
        System.out.println(userAgent);

        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headername = headerNames.nextElement();
            System.out.println(headername+":"+req.getHeader(headername));
        }


        System.out.println("-------------------------------");

        //1.获取数据
        String username =req.getParameter("username");
        String password = req.getParameter("pwd");
        //2.判断数据
        String message;
        if (username.equals("zhouyongzhi") && password.equals("jindachangjavakaifa")) {
            message="Success";
        }else {
            message="Fail";
        }
        //3.做出响应
        PrintWriter writer =resp.getWriter();
        writer.write(message);


    }
}

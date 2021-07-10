package com.zyz.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class servlet4 extends HttpServlet {

    int i =10;

    public servlet4() {
        //构造servlet对象的方法
        System.out.println("my servlet4 constructor");
    }


    @Override
    public void init() throws ServletException {
        //初始化
        System.out.println("my servlet4 init");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //执行服务
        System.out.println("my servlet4 service");
        System.out.println(++i);
        System.out.println(i);
    }

    @Override
    public void destroy() {
        //销毁
        System.out.println("my servlet4 destory");
    }
}

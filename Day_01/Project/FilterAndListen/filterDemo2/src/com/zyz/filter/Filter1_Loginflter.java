package com.zyz.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(urlPatterns = "/*") //任何资源都要进行过滤
public class Filter1_Loginflter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest)servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        //无论是否登陆过，都要放行的资源
        String requestURI = req.getRequestURI();
        System.out.println(requestURI);
        if (requestURI.contains("index.jsp") || requestURI.contains("logincontroller.do")){
            //直接放行
            filterChain.doFilter(req,resp);
            //后续代码不再执行
            return;
        }

        //需要登录之后才能访问的资源，如果没有登录，重定向到index.jsp上，提示用户进行登录
        HttpSession session = req.getSession();
        Object user = session.getAttribute("user");
        if (null != user) { //如果登录过，放行
            filterChain.doFilter(req,servletResponse);
        }else { //如果没有登陆过，跳转至登录页
            resp.sendRedirect("index.jsp");

        }

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}

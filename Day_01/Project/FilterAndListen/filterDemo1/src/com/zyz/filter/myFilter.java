package com.zyz.filter;


import javax.servlet.*;
import java.io.IOException;

public class myFilter implements Filter {


    //做出过滤的方法
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter doFilter 对请求做出过滤");

        //通过一行代码 放行请求
        //放行请求，交给请求链继续进行过滤
        filterChain.doFilter(servletRequest,servletResponse);

        System.out.println("Filter doFilter 对响应做出过滤");

    }

    //初始化方法
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MyFilter init invoked");
    }

    //销毁方法
    @Override
    public void destroy() {
        System.out.println("Myfilter destory invoked");
    }
}

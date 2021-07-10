package com.zyz.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;
import java.util.Enumeration;


@WebFilter(urlPatterns = "/myservlet1.do", initParams = {@WebInitParam(name="realname",value = "zhangsan"),@WebInitParam(name="charset",value = "UTF-8")})
public class Myfilter1 implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Myfilter1 在过滤请求");

        filterChain.doFilter(servletRequest,servletResponse);

        System.out.println("Myfilter1 再过滤响应");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String realname = filterConfig.getInitParameter("realname");
        System.out.println("realname:" + realname);

        Enumeration<String> pName = filterConfig.getInitParameterNames();
        while (pName.hasMoreElements()) {
            String s = pName.nextElement();
            System.out.println(s + ":" + filterConfig.getInitParameter(s));
        }
    }

    @Override
    public void destroy() {

    }
}

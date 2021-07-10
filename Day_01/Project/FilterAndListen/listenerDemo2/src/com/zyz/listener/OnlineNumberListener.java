package com.zyz.listener;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class OnlineNumberListener implements HttpSessionListener {
    /**
     *
     * 在线人数统计
     * */
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        //向Application域中，增加一个数字
        HttpSession session =se.getSession();
        ServletContext application = session.getServletContext();
        Object attribute = application.getAttribute("count");
        if (null == attribute) { //第一次放数据
            application.setAttribute("count",1);
        }else {
            int count=(int)attribute;
            application.setAttribute("count", ++count);
        }

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        //向Application域中，减少一个数字
        HttpSession session =se.getSession();
        ServletContext application = session.getServletContext();
        Object attribute = application.getAttribute("count");
        if (null == attribute) { //第一次放数据
            application.setAttribute("count",1);
        }else {
            int count=(int)attribute;
            application.setAttribute("count", --count);
        }
    }
}

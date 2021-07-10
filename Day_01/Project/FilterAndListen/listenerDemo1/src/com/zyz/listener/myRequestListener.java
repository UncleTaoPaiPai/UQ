package com.zyz.listener;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class myRequestListener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        //监听HttpServletRequest对象的销毁，项目中任何一个Request对象的销毁都会触发该方法的执行
        ServletRequest servletRequest = sre.getServletRequest();
        System.out.println("request" + servletRequest.hashCode() + "对象销毁了");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        //监听HttpServletRequest对象的创建并初始化，项目中任何一个Request对象的创建并触发该方法的执行
        ServletRequest servletRequest = sre.getServletRequest();
        System.out.println("request" + servletRequest.hashCode() + "对象初始化");
    }
}

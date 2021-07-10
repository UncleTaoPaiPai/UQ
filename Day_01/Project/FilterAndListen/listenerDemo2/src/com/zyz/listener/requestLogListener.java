package com.zyz.listener;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebListener
public class requestLogListener implements ServletRequestListener {

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {

    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        //获得请求发出的IP
        //获得请求的URL
        //获得请求产生的时间
        HttpServletRequest httpservletRequest = (HttpServletRequest) sre.getServletRequest();
        String remoteHost = httpservletRequest.getRemoteHost();
        String requestURI = httpservletRequest.getRequestURI().toString();
        String requestDate = simpleDateFormat.format(new Date());

        //准备输出流
        try {
            PrintWriter printWriter = new PrintWriter(new FileOutputStream (new File("d:/zyz.txt"),true));
            printWriter.println(remoteHost+" "+requestURI+" "+requestDate);
            printWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}

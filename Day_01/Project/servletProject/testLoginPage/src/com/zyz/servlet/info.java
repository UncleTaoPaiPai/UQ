package com.zyz.servlet;

public class info {

    /**
     * 实现登录一次即可，在一次会话中，可以反复多次访问WEB-INFO/welcome.html
     * 如果没有登录过，跳转到登录页，登录成功后，可以访问项目结构：
     *
     *      组件介绍：
     *
     *          index.html
     *          登录信息页面
     *
     *          LoginServlet
     *          用来校验登录的，登录成功将用户信息存户HttpSession，否则回到登录页
     *
     *
     *          WelcomeServlet
     *          用来向Welcome.html中跳转的，同时验证登录，登录过，可以直接跳转，否则返回登录页
     *
     *          welcome.html
     *          登录成功之后可以访问的资源

     *
     *          User
     *          用来存储一个用户的信息的实体类对象
     *
     * */
}

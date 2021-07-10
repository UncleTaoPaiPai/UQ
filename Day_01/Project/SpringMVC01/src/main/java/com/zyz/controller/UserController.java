package com.zyz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @RequestMapping("reg.do")
    public ModelAndView reg(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        String username = request.getParameter("username");
        request.setAttribute("name",username);
        System.out.println("进入reg处理器里......");
        mv.setViewName("success.jsp");

        return mv;
    }

    @RequestMapping("login.do")
    public ModelAndView login(String username, String password){
        ModelAndView mv = new ModelAndView();

        if ("admin".equals(username) && "123".equals(password)) {
            mv.addObject("name",username);
            mv.addObject("password",password);
            mv.setViewName("success.jsp");

        }else {
            mv.addObject("info","登录失败！请重试！！！");
            mv.setViewName("login.jsp");
        }
        System.out.println("进入reg处理器里......");
        return mv;
    }
}

package com.zyz.controller;


import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
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
        System.out.println("进入reg 处理器");
        mv.setViewName("success.jsp");
        return mv;
    }

    @RequestMapping("login.do")
    public ModelAndView login(String username, String pwd){

        ModelAndView mv = new ModelAndView();

        if ("admin".equals(username) && "123".equals(pwd)){
            mv.addObject("name",username);
            mv.addObject("pwd",pwd);
            mv.setViewName("success.jsp");
        }else{
            mv.addObject("info","登陆失败！");
            mv.setViewName("login.jsp");
        }

        System.out.println("进入reg 处理器");
        return mv;
    }

}

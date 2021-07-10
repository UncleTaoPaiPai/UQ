package com.zyz.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController implements Controller {


    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws Exception {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("ok.jsp");
        System.out.println("跳转到jsp.页面");
        return mv;

    }
}

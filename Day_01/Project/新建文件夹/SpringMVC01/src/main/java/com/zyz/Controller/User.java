package com.zyz.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("user")
public class User {

    @RequestMapping("/reg.do") //请求映射，接收前端"reg.do"的请求
    public ModelAndView reg(HttpServletRequest request){
        //  创建ModelAndView类
        ModelAndView mv = new ModelAndView();
        //  从前端当中接收"username"
        String username = request.getParameter("username");
        //设置主类
        request.setAttribute("username",username);
        System.out.println("程序完成");
        //跳转到"success.jsp"页面
        mv.setViewName("success.jsp");
        return mv;
    }

    @RequestMapping("/login.do")
    public ModelAndView login(String username, String pwd){

        ModelAndView mv=new ModelAndView();

        System.out.println("进入系统");
        if ("admin".equals(username) && "123".equals(pwd)) {
            mv.addObject("username",username);
            mv.addObject("info","注册成功");
            mv.setViewName("/success.jsp");
        }else {
            mv.addObject("info","注册失败");
            mv.setViewName("fail.jsp");
        }
        return mv;

    }


}

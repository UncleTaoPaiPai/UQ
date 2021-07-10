package com.zyz.servlet;

import com.zyz.pojo.user;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

@WebServlet(urlPatterns = "/servlet1.do")
public class servlet1 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求参数
        String username = req.getParameter("username");
        System.out.println("username"+username);
        String[] hobby = req.getParameterValues("hobby");
        System.out.println("hobby" + Arrays.toString(hobby));


        //向三个域中放入数据
        /* 向request(请求域)中放入数据 */
        user user = new user(1,"Tony","888");
        req.setAttribute("user",user);
        req.setAttribute("msg","requestMessage");


        /* 向session域中放入数据 */
        List<user> users = new ArrayList<>();
        user user1 = new user(2,"Lucy","111");
        user user2 = new user(3,"Mike","222");
        user user3 = new user(4,"Jack","333");
        Collections.addAll(users,user1,user2,user3);
        HttpSession session = req.getSession();
        session.setAttribute("users",users);
        session.setAttribute("msg","sessionMessage");

        /* 向Application域中放入数据 */
        ServletContext application = req.getServletContext();
        Map<String,user> map = new HashMap<>();
        map.put("a",user1);
        map.put("b",user2);
        map.put("c",user3);
        application.setAttribute("usermap",map);
        application.setAttribute("msg","applicationMessage");

        /* 跳转至jsp */
        req.getRequestDispatcher("showInfo.jsp").forward(req,resp);

    }
}

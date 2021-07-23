package com.zyz;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther : YongggzHi
 * @Date : 2021/7/23 - 11:42
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */

@WebServlet("/hhh/login")
public class MyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("slfskldjf");
    }
}

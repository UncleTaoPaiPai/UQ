package com.zyz.servlet;


import com.zyz.dao.adminDao;
import com.zyz.dao.daoFactory;
import com.zyz.dao.studentsDao;
import com.zyz.dao.teacherDao;
import com.zyz.entity.admin;
import com.zyz.entity.students;
import com.zyz.entity.teacher;
import com.zyz.util.MD5;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/login")
public class loginServlet extends HttpServlet {



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MD5 md5 = new MD5();

        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        String type = req.getParameter("type");
        HttpSession session = req.getSession();

        if (StringUtils.isBlank(userName) || StringUtils.isBlank(password) || StringUtils.isBlank(type)) {
            req.setAttribute("error","录入信息不能为空");
            req.getRequestDispatcher("login.jsp").forward(req,resp);
            return;
        }


        if (StringUtils.isNotBlank(type)) {
            try {
                if ("0".equals(type)) {
                    //学生登录验证
                    students students = daoFactory.getInstance().getstudentsDao().login(userName, md5.encrypByMd5(md5.encrypByMd5(password)));
                    if (students != null) {
                        session.setAttribute("user", students);
                        session.setAttribute("type",type);
                        resp.sendRedirect("index.jsp");

                    }else {
                        req.setAttribute("error","用户名或密码错误");
                        req.getRequestDispatcher("login.jsp").forward(req,resp);
                    }

                } else if ("1".equals(type)) {
                    //老师登录验证
                    teacher teacher = daoFactory.getInstance().getteacherDao().login(userName, md5.encrypByMd5(md5.encrypByMd5(password)));
                    if (teacher != null) {
                        session.setAttribute("user", teacher);
                        session.setAttribute("type",type);
                        resp.sendRedirect("index.jsp");
                    }else {

                    }

                } else {
                    //管理员登录验证
                    admin admin = new admin();
                    admin.setUsername(userName);
                    admin.setPwd(md5.encrypByMd5(md5.encrypByMd5(password)));
                    admin entity = daoFactory.getInstance().getadminDao().login(admin);

                    if (entity != null) {
                        //执行跳转
                        session.setAttribute("user", entity);
                        session.setAttribute("type",type);
                        resp.sendRedirect("index.jsp");

                    } else {
                        //用户或密码错误
                    }

                }
            }catch (SQLException e){
                e.printStackTrace();
            }

        }else {

        }
    }
}

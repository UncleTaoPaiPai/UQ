package com.zyz.servlet;

import com.sun.javafx.scene.shape.PathUtils;
import com.zyz.dao.daoFactory;
import com.zyz.entity.students;
import com.zyz.util.MD5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/student")
public class studentServlet extends HttpServlet {

    MD5 md5 = new MD5();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getParameter("method");
        if ("list".equals(method)) {
            this.list(request,response);
        }else if ("add".equals(method)) {
            this.add(request,response);
        }else if ("edit".equals(method)) {
            this.findById(request,response);
        }
    }

    private void findById(HttpServletRequest request, HttpServletResponse response) {

        String id = request.getParameter("id");

        try {
            students student = daoFactory.getInstance().getstudentsDao().findById(Integer.parseInt(id));
            request.setAttribute("student",student);
            request.getRequestDispatcher(PathUtils.getBasePath(request)+"page/student/update.jsp").forward(request,response);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    private void add(HttpServletRequest request, HttpServletResponse response) {

        String stuNo = request.getParameter("stuNo");
        String stuName = request.getParameter("stuName");
        String stuPwd = request.getParameter("stuPwd");
        students students = new students();
        students.setStuName(stuName);
        students.setStuNo(stuNo);
        students.setStuPwd(md5.encrypByMd5(md5.encrypByMd5(stuPwd)));
        try {
            daoFactory.getInstance().getstudentsDao().add(students);
            //直接重定向到列表页面
            response.sendRedirect("student?method=list");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void list(HttpServletRequest request, HttpServletResponse response){

        try {
            List<students> list = daoFactory.getInstance().getstudentsDao().list(null);
            request.setAttribute("list",list);
            request.getRequestDispatcher("page/student/list.jsp").forward(request,response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

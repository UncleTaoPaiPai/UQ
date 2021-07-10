package com.zyz.servlet;

import com.zyz.dao.empDao;
import com.zyz.dao.impl.empDaoImpl;
import com.zyz.pojo.Emp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/empservlet1.do")
public class empServlet1 extends HttpServlet {


    /**
     * 1、请求这个empServlet，由这个empServlet连接数据库查询。
     * 2、由他给我们返回一个List集合，这个List集合装了一堆Emp对象。
     * 3、拿到这个装了Emp对象的List集合之后呢，再把这个Emp对象的集合
     *    给到showEmp.jsp这个页面里面去。在这个页面上遍历这个Emp的集合。
     * 4、然后呢，再把这个集合的数据以表格的形式把所有的Emp信息展现出来。
     * 展现出来之后，再把这些数据响应到页面里面去就可以了。
     *
     * */

    // dao对象
    empDao empDao = new empDaoImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //获取数据
        List<Emp> list = empDao.findAll();

        //将数据放入请求域
        req.setAttribute("emps",list);

        //请求转发给jsp
        req.getRequestDispatcher("showEmp.jsp").forward(req,resp);






    }
}

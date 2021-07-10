package com.zyz.test;

import com.zyz.mapper.EmpDeptMapper;
import com.zyz.mapper.EmpMapper;
import com.zyz.mapper.OrderdetailMapper;
import com.zyz.mapper.UsersMapper;
import com.zyz.pojo.*;
import com.zyz.util.Page;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MyBatisTest {

    private SqlSessionFactory factory;

    @Before
    public void before() throws Exception {
        InputStream resource = Resources.getResourceAsStream("SqlMapperConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(resource);
    }

    @Test
    public void Test01() throws Exception {

        SqlSession sqlSession = factory.openSession();
        EmpDeptMapper mapper = sqlSession.getMapper(EmpDeptMapper.class);
        List<EmpDept> empDepts = mapper.selectAll();
        sqlSession.close();
        for (EmpDept empDept : empDepts) {
            System.out.println(empDept.getEmpno() + ";" + empDept.getEname() + ";" + empDept.getDeptno() + ";" + empDept.getDname() + ";" + empDept.getLoc());
        }
    }

    @Test
    public void Test02() throws Exception {

        SqlSession sqlSession = factory.openSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> empDepts = mapper.selectAllEmp();
        sqlSession.close();
        for (Emp emp : empDepts)
            System.out.println(emp.getEmpno() + ";" + emp.getEname() + ";" + emp.getDept().getDeptno() + ";" + emp.getDept().getDname() + ";" + emp.getDept().getLoc());
    }


    @Test
    public void Test03() throws Exception {

        SqlSession sqlSession = factory.openSession();
        UsersMapper mapper = sqlSession.getMapper(UsersMapper.class);
        Users users = mapper.selectAll(1003);
        sqlSession.close();
        System.out.println("1003对应的用户信息：" + users.getUid() + ";" + users.getUname() + ";" + users.getAddress());
        for (Orders order : users.getOrders()) {
            System.out.println(order.getOrderid() + ";" + order.getCreatetime() + ";" + order.getStatus());
            for (Orderdetail orderOrder : order.getOrders()) {
                System.out.println(orderOrder.getItemnum() + ";" + orderOrder.getItems().getName() + ";" + orderOrder.getItems().getPrice());

            }
        }
    }

    @Test
    public void Test04() throws Exception {

        SqlSession sqlSession = factory.openSession();
        UsersMapper mapper = sqlSession.getMapper(UsersMapper.class);
        Page page = new Page();
        page.setDatacount(mapper.selectCount());
        page.setShowdata(2);
        page.setPageindex(1);
        page.getPagecount();
        page.setList(mapper.selectUserByPage(page));
        List<Users> list = page.getList();
        System.out.println("当前是第" + page.getPageindex() + "页: 一共有" + page.getPagecount() + "页");
        for (Users users : list) {
            System.out.println(users.getUid() + ";" + users.getUname() + ";" + users.getAddress());
        }

    }

    @Test
    public void Test05() throws Exception {

        SqlSession sqlSession = factory.openSession();
        OrderdetailMapper mapper = sqlSession.getMapper(OrderdetailMapper.class);
        Orderdetail orderdetail = mapper.selectLazyLoadByid(6);
        sqlSession.close();




    }


}
package com.zyz.test;


import com.sun.corba.se.impl.interceptors.PICurrent;
import com.zyz.pojo.dept;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class mybatisTest {



    @Test
    public void test01() throws IOException {

        // 装载resources文件下的“SqlMapConfig.xml”
        InputStream resource = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 连接数据库
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(resource,"development123");
        SqlSession session = factory.openSession();

        // 将数据库中的数据打印出来
        List<dept> list = session.selectList("selectAllDept");
        for (dept dept : list) {
            System.out.println(dept.getDname() + ";" + dept.getDeptno() + ";" + dept.getLoc());
        }
        session.close();
    }


//    private SqlSessionFactory factory;
//
//    @Before
//    public void before() throws IOException {
//
//        InputStream resource = Resources.getResourceAsStream("SqlMapConfig.xml");
//
//        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//        factory = builder.build(resource,"development123");
//    }


    //查找数据库
    @Test
    public void findByIdt() throws IOException {
        InputStream resource = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 连接数据库
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(resource,"development123");
        SqlSession session = factory.openSession();
        dept dept = session.selectOne("selectDeptById", 10);
        System.out.println(dept.getDeptno() + ";" + dept.getDname() + ";" + dept.getLoc());
        session.close();
    }

    //添加数据到数据库
    @Test
    public void addDept() throws IOException {
        InputStream resource = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 连接数据库
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(resource,"development123");
        SqlSession session = factory.openSession();

        dept dept = new dept(11,"运维部","上海");
        int insertDept = session.insert("insertDept", dept);

        //注意：session 进行手动提交
        session.commit();
        session.close();
        System.out.println(insertDept == 1 ? "添加成功" : "添加失败");
    }


    //主键自增的添加
    @Test
    public void addDeptwithoutId() throws IOException {
        InputStream resource = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 连接数据库
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(resource,"development123");
        SqlSession session = factory.openSession();

        dept dept = new dept();
        dept.setDname("开发二组");
        dept.setLoc("北京");
        int insertDept = session.insert("insertDept", dept);

        //注意：session 进行手动提交
        session.commit();
        session.close();
        System.out.println(insertDept == 1 ? "添加成功" : "添加失败");
    }

    //更新数据库中数据
    @Test
    public void updateDept() throws IOException {
        InputStream resource = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 连接数据库
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(resource,"development123");
        SqlSession session = factory.openSession();

        dept dept = new dept();
        dept.setDeptno(11);
        dept.setLoc("西雅图");
        int insertDept = session.insert("updDeptById", dept);

        //注意：session 进行手动提交
        session.commit();
        session.close();
        System.out.println(insertDept == 1 ? "修改成功" : "修改失败");
    }


    //删除数据库中的数据
    @Test
    public void deleteDept() throws IOException {
        InputStream resource = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 连接数据库
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(resource,"development123");
        SqlSession session = factory.openSession();

        int delDeptByid = session.delete("delDeptByid", 41);

        //注意：session 进行手动提交
        session.commit();
        session.close();
        System.out.println(delDeptByid == 1 ? "删除成功" : "删除失败");
    }



}

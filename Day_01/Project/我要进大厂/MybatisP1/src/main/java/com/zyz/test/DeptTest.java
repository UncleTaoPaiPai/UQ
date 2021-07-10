package com.zyz.test;

import com.zyz.pojo.Dept;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class DeptTest {


    private SqlSessionFactory factory;

    @Before
    public void before() throws IOException {
        InputStream resource = Resources.getResourceAsStream("SqlMapperConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        factory = sqlSessionFactoryBuilder.build(resource);
    }

    @Test
    public void findAll() {

        SqlSession sqlSession = factory.openSession();
        List<Dept> dept = sqlSession.selectList("selectAllDept");
        for (Dept dept1 : dept) {
            System.out.println(dept1.getDeptno() + ";" + dept1.getDname() + ";" + dept1.getLoc());
        }
        sqlSession.close();
    }

    @Test
    public void findDeptByid() {
        SqlSession sqlSession = factory.openSession();
        Dept dept = sqlSession.selectOne("selectDeptById", 1000);
        System.out.println(dept.getDeptno() + ";" + dept.getDname() + ";" + dept.getLoc());
        sqlSession.close();

    }


    @Test
    public void insertDept() {

        SqlSession sqlSession = factory.openSession();
        Dept dept = new Dept(1111, "情报局", "洛杉矶");
        int insertDept = sqlSession.insert("insertDept", dept);
        System.out.println(insertDept == 1 ? "ok" : "No");
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteDept(){
        SqlSession sqlSession = factory.openSession();
        int deleteDepyByid = sqlSession.delete("deleteDepyByid", 30);
        System.out.println(deleteDepyByid == 1 ? "OK" : "NO");
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void UpdateByID(){
        SqlSession sqlSession = factory.openSession();
        Dept dept = new Dept();
        dept.setDeptno(20);
        dept.setLoc("China");
        int updateDepyBYid = sqlSession.update("updateDepyBYid", dept);
        System.out.println(updateDepyBYid == 1 ? "OK" : "No");
        sqlSession.commit();
        sqlSession.close();
    }

}

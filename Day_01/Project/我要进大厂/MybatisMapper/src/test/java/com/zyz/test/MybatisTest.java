package com.zyz.test;

import com.zyz.mapper.DeptMapper;
import com.zyz.mapper.EmpMapper;
import com.zyz.pojo.Dept;
import com.zyz.pojo.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MybatisTest {


    private SqlSessionFactory factory;

    @Before
    public void before() throws IOException {
        InputStream resource = Resources.getResourceAsStream("SqlMapperConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        factory=sqlSessionFactoryBuilder.build(resource);
    }

    @Test
    public void t() throws Exception{
        SqlSession sqlSession =factory.openSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        List<Dept> list = mapper.selectAll();
        for (Dept dept : list) {
            System.out.println(dept.getLoc() + ";" + dept.getDname() + ";" + dept.getDeptno());
        }
        sqlSession.close();
    }


    @Test
    public void test01() throws Exception{
        SqlSession sqlSession =factory.openSession();
        DeptMapper deptmapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = deptmapper.selectOneByid(10);
        System.out.println(dept.getDeptno() + ";" + dept.getDname() + ";" + dept.getLoc());
        sqlSession.close();

    }

    @Test
    public void test02() throws Exception{
        SqlSession sqlSession =factory.openSession();
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = new Emp();
        emp.setSal(3000.0);
//        emp.setEname("王五");
        List<Emp> emps = empMapper.selectEmpBysalname(emp);
        sqlSession.close();
        for (Emp emp1 : emps) {
            System.out.println(emp1.getEmpno() + ";" + emp1.getEname() + ";" + emp1.getSal() + ";" + emp1.getDeptno());
        }

    }

    @Test
    public void test03() throws Exception{
        SqlSession sqlSession =factory.openSession();
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = new Emp();
//        emp.setSal(3000.0);
//        emp.setEname("王五");
        emp.setDeptno(10);
        List<Emp> emps = empMapper.selectEmpByinfo(emp);
        sqlSession.close();
        for (Emp emp1 : emps) {
            System.out.println(emp1.getEmpno() + ";" + emp1.getEname() + ";" + emp1.getSal() + ";" + emp1.getDeptno());
        }

    }

    @Test
    public void test04() throws Exception{
        SqlSession sqlSession =factory.openSession();
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = new Emp();
        emp.setEmpno(1222411);
        emp.setEname("sfs");
        emp.setMgr(33343.0);
//        emp.setSal(8000.0);
        int i = empMapper.insertEmp(emp);
        sqlSession.commit();
        sqlSession.close();
        System.out.println(i == 1 ? "ok" : "no");

    }

    @Test
    public void test05() throws Exception{
        SqlSession sqlSession =factory.openSession();
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = new Emp();
        emp.setMgr(88.0);
        emp.setSal(80020.0);
        emp.setEname("宇智波");
        emp.setJob("副村长");
        emp.setEmpno(111113);
        int i = empMapper.updateEmp(emp);
        sqlSession.commit();
        sqlSession.close();
        System.out.println(i == 1 ? "ok" : "no");
    }

    @Test
    public void test06() throws Exception{
        SqlSession sqlSession =factory.openSession();
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        List<Integer> list = new ArrayList<Integer>();
        list.add(7369);
        list.add(7123);
        List<Emp> emps = empMapper.selectEmpByempnos(list);
        sqlSession.close();
        for (Emp emp : emps) {
            System.out.println(emp.getEmpno() + ";" + emp.getEname() + ";" + emp.getMgr());
        }

    }

    @Test
    public void test07() throws Exception{
        SqlSession sqlSession =factory.openSession();
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        int[] arr={7369,7123};
        List<Emp> emps = empMapper.selectEmpByArray(arr);
        sqlSession.close();
        for (Emp emp : emps) {
            System.out.println(emp.getEmpno() + ";" + emp.getEname() + ";" + emp.getMgr());
        }

    }

    @Test
    public void test08() throws Exception{
        SqlSession sqlSession =factory.openSession();
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        Map<String,List<Integer>> map = new HashMap<String,List<Integer>>();
            List<Integer> list = new ArrayList<Integer>();
            list.add(7369);
            list.add(7123);
        map.put("empnos",list);

        List<Emp> emps = empMapper.selectEmpByMap(map);
        sqlSession.close();
        for (Emp emp : emps) {
            System.out.println(emp.getEmpno() + ";" + emp.getEname() + ";" + emp.getMgr());
        }

    }

    @Test
    public void test09() throws Exception{
        SqlSession sqlSession =factory.openSession();
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("deptnokey",10);
        map.put("enamekey","五");


        List<Integer> list = new ArrayList<Integer>();
        list.add(7369);
        list.add(7123);
        map.put("empnos",list);

        List<Emp> emps = empMapper.selectEmpByMapInfo(map);
        sqlSession.close();
        for (Emp emp : emps) {
            System.out.println(emp.getEmpno() + ";" + emp.getEname() + ";" + emp.getMgr());
        }

    }







}

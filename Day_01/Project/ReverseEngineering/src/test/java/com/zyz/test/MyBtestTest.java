package com.zyz.test;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import com.zyz.mapper.EmpMapper;
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

public class MyBtestTest {

    private SqlSessionFactory factory;



    @Before
    public void init() throws IOException {

        InputStream stream = Resources.getResourceAsStream("SqlmapConfig.xml");

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        factory = builder.build(stream);


    }

    @Test
    public void test01() throws Exception{
        System.out.println("jjj");
        SqlSession session = factory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emp = new Emp();
//        emp.setSal(7000.0);
        emp.setEname("张三");
        List<Emp> list = mapper.selectEmpBysalename(emp);
        session.close();
        for (Emp emp1 : list) {
            System.out.println(emp1.getDeptno() + ";" + emp1.getEmpno() + ";" + emp1.getEname() + ";" + emp1.getSal());
        }
    }

    @Test
    public void test02() throws Exception{
        System.out.println("jjj");
        SqlSession session = factory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emp = new Emp();
//        emp.setSal(7000.0);
//        emp.setEname("张三");
        emp.setDeptno(10);
        List<Emp> list = mapper.selectEmpByinfo(emp);
        session.close();
        for (Emp emp1 : list) {
            System.out.println(emp1.getDeptno() + ";" + emp1.getEmpno() + ";" + emp1.getEname() + ";" + emp1.getSal());
        }
    }

//    @Test
//    public void test03() throws Exception{
//        System.out.println("jjj");
//        SqlSession session = factory.openSession();
//        EmpMapper mapper = session.getMapper(EmpMapper.class);
//        Emp emp = new Emp();
//        emp.setEmpno(1222);
//        emp.setEname("李铁旦");
//        emp.setSal(4000.0);
//
//        int i = mapper.insertEmp(emp);
//        session.commit();
//        session.close();
//        System.out.println(i == 1 ? "添加成功" : "添加失败");
//
//    }

//    @Test
//    public void test04() throws Exception{
//
//        SqlSession session = factory.openSession();
//        EmpMapper mapper = session.getMapper(EmpMapper.class);
//        Emp emp = new Emp();
//        emp.setMgr(73639.0);
//        emp.setSal(45200.0);
//        emp.setEname("王五");
//        emp.setJob("开发");
//        emp.setEmpno(7123);
//        int i = mapper.updateEmp(emp);
//        session.commit();
//        session.close();
//        System.out.println(i == 1 ? "修改成功" : "修改失败");
//
//    }

    @Test
    public void test05() throws Exception{

        SqlSession session = factory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        List<Integer> list = new ArrayList<Integer>();
        list.add(1111);
        list.add(1222);
        List<Emp> emps = mapper.selectEmpByempnos(list);
        for (Emp emp : emps) {
            System.out.println(emp.getEmpno() + ";" + emp.getEname() + ";" + emp.getMgr());
        }

    }

    @Test
    public void test06() throws Exception{

        SqlSession session = factory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        int[] arr={7321,1111};
        List<Emp> emps1 = mapper.selectEmpByArray(arr);
        session.close();


        for (Emp emp : emps1) {
            System.out.println(emp.getEmpno() + ";" + emp.getEname() + ";" + emp.getMgr());
        }

    }

    @Test
    public void test07() throws Exception{

        SqlSession session = factory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Map<String,List<Integer>> map = new HashMap<String, List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        list.add(7321);

        map.put("empnos",list);
        List<Emp> emps = mapper.selectEmpByMap(map);
        session.close();
        for (Emp emp : emps) {
            System.out.println(emp.getEmpno() + ";" + emp.getEname() + ";" + emp.getMgr());
        }
    }

    @Test
    public void test08() throws Exception{

        SqlSession session = factory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Map<String,Object> map = new HashMap<String, Object>();



        map.put("deptnokey",10);
        map.put("enamekey","五");
        List<Integer> list = new ArrayList<Integer>();

        list.add(7381);
        map.put("empnos",list);
        List<Emp> emps = mapper.selectEmpByMapinfo(map);
        session.close();
        for (Emp emp : emps) {
            System.out.println(emp.getEmpno() + ";" + emp.getEname() + ";" + emp.getMgr());
        }
    }

}

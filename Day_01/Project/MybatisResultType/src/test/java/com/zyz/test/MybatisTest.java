package com.zyz.test;

import com.zyz.mapper.DeptMapper;
import com.zyz.mapper.EmpDeptMapper;
import com.zyz.mapper.EmpMapper;
import com.zyz.pojo.Dept;
import com.zyz.pojo.Emp;
import com.zyz.pojo.EmpDept;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MybatisTest {


    private SqlSessionFactory factory;

    @Before
    public void init() throws Exception{
        InputStream stream = Resources.getResourceAsStream("SqlMapConfig.xml");

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory=builder.build(stream);
    }

//    @Test
//    public void test01() throws Exception{
//
//        SqlSession session = factory.openSession();
//        EmpDeptMapper empDeptMapper = session.getMapper(EmpDeptMapper.class);
//        List<EmpDept> empDepts = empDeptMapper.selectAll();
//        for (EmpDept empDept : empDepts) {
//            System.out.println(empDept.getEmpno() + ";" + empDept.getEname() + ";" + empDept.getDeptno() + ";" + empDept.getDname() + ";" + empDept.getLoc());
//        }
//    }

    @Test
    public void test02() throws Exception{

        SqlSession session = factory.openSession();
        EmpMapper empMapper = session.getMapper(EmpMapper.class);
        List<Emp> list = empMapper.selectAllEmp();
        session.close();
        for (Emp emp : list) {
            System.out.println(emp.getEmpno() + ";" + emp.getEname() + ";" + emp.getDept().getDeptno() + ";" + emp.getDept().getDname() + ";" + emp.getDept().getLoc());
        }
    }

    @Test
    public void test03() throws Exception{

        SqlSession session = factory.openSession();
        DeptMapper mapper = session.getMapper(DeptMapper.class);
        Dept dept = mapper.selectDeptById(10);
        session.close();
        System.out.println("部门编号：" + dept.getDeptno() + "部门名称：" + dept.getDname() + "部门地址：" + dept.getLoc());
        System.out.println("当前部门下所有员工信息：");
        for (Emp emp : dept.getEmps()) {
            System.out.println(emp.getEmpno() + ";" + emp.getEname() + ";" + emp.getDept().getDeptno() + ";" + emp.getDept().getDname() + ";" + emp.getDept().getLoc());
        }

    }
}

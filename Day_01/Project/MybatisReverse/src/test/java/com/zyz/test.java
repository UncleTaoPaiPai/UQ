package com.zyz;

import com.zyz.bean.Emp;
import com.zyz.mapper.EmpMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test {

    private SqlSessionFactory factory;

    @Before
    public void init() throws IOException {
        InputStream Is = Resources.getResourceAsStream("generatorConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(Is);
    }

    @Test
    public void test01() throws Exception {
        SqlSession session = factory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emp = new Emp();
        emp.setSal(2000.0);
//        emp.setEname("Tom");
        List<Emp> emps = mapper.selectEmpBysalename(emp);
        session.close();
        for (Emp emp1 : emps) {
            System.out.println(emp1.getEmpno()  + ";" + emp1.getSal() + ";" + emp1.getDeptno());
        }

    }






}

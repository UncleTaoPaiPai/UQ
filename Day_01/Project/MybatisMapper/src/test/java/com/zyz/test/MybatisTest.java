package com.zyz.test;

import com.zyz.mapper.deptMapper;
import com.zyz.pojo.dept;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTest {

    private SqlSessionFactory factory;



    @Before
    public void before() throws IOException{
        InputStream stream = Resources.getResourceAsStream("SqlMapConfig.xml");

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory=builder.build(stream);
    }

    @Test
    public void test01() throws Exception{
        SqlSession session = factory.openSession();
        deptMapper mapper = session.getMapper(deptMapper.class);
        dept dept = mapper.selectOneById(10);
        System.out.println(dept.getDeptno() + ";" + dept.getDname() + ";" + dept.getLoc());
        session.close();
    }
}

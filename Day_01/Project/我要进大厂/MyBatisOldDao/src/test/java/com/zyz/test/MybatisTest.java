package com.zyz.test;

import com.zyz.dao.impl.DeptDaoImpl;
import com.zyz.pojo.Dept;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    private SqlSessionFactory factory;

    @Before
    public void before() throws IOException {
        InputStream resource = Resources.getResourceAsStream("SqlMapperConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        factory=sqlSessionFactoryBuilder.build(resource);
    }


    @Test
    public void findAll() throws Exception{
        DeptDaoImpl deptDaoImpl = new DeptDaoImpl(factory);
        List<Dept> list = deptDaoImpl.selectAll();
        for (Dept dept : list) {
            System.out.println(dept.getDeptno() + ";" + dept.getDname() + ";" + dept.getLoc());
        }

    }






}

package com.zyz.test;


import com.zyz.pojo.Dept;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class mybatisTest {

    @Test
    public void test() throws IOException {

        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(resourceAsStream);
        SqlSession sqlSession = factory.openSession();

        List<Dept> selectAllDept = sqlSession.selectList("selectAllDept");
        for (Dept dept : selectAllDept) {
            System.out.println(dept.getDeptno() + ";" + dept.getDname() + ";" + dept.getLoc());
        }
        sqlSession.close();

    }

}

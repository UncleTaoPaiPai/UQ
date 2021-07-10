package com.zyz.Test;

import com.zyz.mapper.DeptMapper;
import com.zyz.pojo.Dept;
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
    public void before() throws Exception{

        InputStream resource = Resources.getResourceAsStream("MybatisConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        factory=sqlSessionFactoryBuilder.build(resource);
    }

    @Test
    public void Test01() throws  Exception{

        SqlSession sqlSession = factory.openSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        List<Dept> list = mapper.selectAll();
        for (Dept dept : list) {
            System.out.println(dept.getDeptno() + ";" + dept.getDname() + ";" + dept.getLoc());
        }
        sqlSession.close();
    }

}

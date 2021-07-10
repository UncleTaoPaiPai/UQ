package com.zyz.Test;

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
import java.util.List;

public class deptTest {

    private SqlSessionFactory factory;

    @Before
    public void b() throws Exception{

        InputStream resource = Resources.getResourceAsStream("SqlMapperConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        factory = sqlSessionFactoryBuilder.build(resource);

    }

    @Test
    public void te() throws IOException {

        SqlSession sqlSession = factory.openSession();
        deptMapper mapper = sqlSession.getMapper(deptMapper.class);
        List<dept> depts = mapper.selectAll();
        for (dept dept : depts) {
            System.out.println(dept.getDeptno() + ";" + dept.getDname() + ";" + dept.getLoc());
        }
        sqlSession.close();
    }
}

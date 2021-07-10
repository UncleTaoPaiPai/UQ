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

/**
 * @Auther : YongggzHi
 * @Date : 2021/7/9 - 20:38
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */
public class Test01 {
    private SqlSession sqlSession;

    @Test
    public void init() throws IOException {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream resourceAsStream = Resources.getResourceAsStream("DeptMapper.xml");
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
        sqlSession=build.openSession();
        List<Dept> findAll = sqlSession.selectList("findAll");
        System.out.println(findAll);
        sqlSession.close();
    }
}

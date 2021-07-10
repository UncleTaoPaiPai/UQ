package com.zyz.dao.impl;

import com.zyz.dao.DeptDao;
import com.zyz.pojo.Dept;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;
import java.util.List;

public class DeptDaoImpl implements DeptDao {


    private SqlSessionFactory factory;

    public DeptDaoImpl(SqlSessionFactory factory) {
        this.factory = factory;
    }

    public List<Dept> selectAll() throws IOException {
        List<Dept> list = null;
        SqlSession sqlSession = factory.openSession();
        list = sqlSession.selectList("selectAllDept");
        sqlSession.close();
        return list;
    }

    public Dept selectOneByid() throws IOException {
        Dept dept = null;
        SqlSession sqlSession = factory.openSession();
        dept = sqlSession.selectOne("selectDeptByid", 1111);
        sqlSession.close();
        return dept;
    }

    public int insertDept(Dept dept) throws IOException {
        SqlSession sqlSession = factory.openSession();
        int insertDept = sqlSession.insert("insertDept");
        sqlSession.commit();
        sqlSession.close();
        return insertDept;
    }

    public int updateDept(Dept dept) throws IOException {
        SqlSession sqlSession = factory.openSession();
        int updateDept = sqlSession.insert("updateDept");
        sqlSession.commit();
        sqlSession.close();
        return updateDept;
    }

    public int deleteDept(int id) throws IOException {
        SqlSession sqlSession = factory.openSession();
        int delDept = sqlSession.insert("delDept");
        sqlSession.commit();
        sqlSession.close();
        return delDept;
    }
}

package com.zyz.dao.impl;

import com.zyz.dao.deptDao;
import com.zyz.pojo.dept;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class deptDaoImpl implements deptDao {

    private SqlSessionFactory factory;

    public deptDaoImpl(SqlSessionFactory factory) {
        this.factory = factory;
    }

    public List<dept> selectAll() throws Exception {
        List<dept> list = null;
        SqlSession sqlSession = factory.openSession();
        list = sqlSession.selectList("selectAllDept");
        sqlSession.close();
        return list;
    }

    public dept selectOneById() throws Exception {
        dept dept = null;
        SqlSession sqlSession = factory.openSession();
        dept = sqlSession.selectOne("selectDeptByDeptno");
        sqlSession.close();
        return dept;
    }

    public int insertDept(dept dept) throws Exception {
        SqlSession sqlSession = factory.openSession();
        int insertDept = sqlSession.insert("insertDept", dept);
        sqlSession.commit();
        sqlSession.close();
        return insertDept;
    }

    public int updateDept(dept dept) throws Exception {
        SqlSession sqlSession = factory.openSession();
        int updateDept = sqlSession.update("updateDept", dept);
        sqlSession.commit();
        sqlSession.close();
        return updateDept;
    }

    public int deleteDept(int id) throws Exception {
        SqlSession sqlSession = factory.openSession();
        int deleteDept = sqlSession.delete("deleteDept", id);
        sqlSession.commit();
        sqlSession.close();

        return deleteDept;
    }
}

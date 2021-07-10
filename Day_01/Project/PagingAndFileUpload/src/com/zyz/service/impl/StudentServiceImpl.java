package com.zyz.service.impl;

import com.zyz.dao.StudentDao;
import com.zyz.dao.impl.StudentDaoImpl;
import com.zyz.pojo.PageBean;
import com.zyz.pojo.Student;
import com.zyz.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {


    //在做数据封装的业务处理前，必须要对Student表格进行查询
    // 这些查询的方法要交给StudentDao
    private StudentDao studentDao = new StudentDaoImpl();



    /**
     *
     * 做分页数据封装的业务处理
     */

    @Override
    public PageBean<Student> findByPage(int currentPage, int pageSize) {

        //查询出该页所有的数据
        List<Student> students=studentDao.findBypage(currentPage,pageSize);

        //查询出有多少条数据
        int totalSize=studentDao.findTotalSize();

        //总页数
        //如果能整除就直接相除，不行就相除+1
        int totalPage = totalSize%2==0?totalSize / pageSize:totalSize / pageSize + 1;


        //当前页
        //页大小
        PageBean<Student> pagebean = new PageBean<>(students, totalSize, pageSize, totalPage, currentPage);



        return pagebean;
    }
}

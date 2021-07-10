package com.zyz.dao;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class daoFactory {


    //类似于工厂 + 单例模式
    private static daoFactory factory = new daoFactory();

    private Map<String, Object> map = new ConcurrentHashMap<>();

    private daoFactory() {

    }

    public static daoFactory getInstance() {
        return factory;
    }

    public adminDao getadminDao() {

        adminDao adminDao = (adminDao)map.get("adminDao");
        if (adminDao != null) {
            return adminDao;
        }else {
            adminDao = new adminDao();
            map.put("adminDao",adminDao);
        }
        return adminDao;

    }

    public studentsDao getstudentsDao() {

        studentsDao studentsDao = (studentsDao) map.get("studentsDao");
        if (studentsDao != null) {
            return studentsDao;
        }else {
            studentsDao = new studentsDao();
            map.put("studentsDao",studentsDao);
        }
        return studentsDao;

    }

    public courseDao getcourseDao() {

        courseDao courseDao = (courseDao) map.get("courseDao");
        if (courseDao != null) {
            return courseDao;
        }else {
            courseDao = new courseDao();
            map.put("courseDao",courseDao);
        }
        return courseDao;

    }

    public scDao getscDao() {

        scDao scDao = (scDao) map.get("scDao");
        if (scDao != null) {
            return scDao;
        }else {
            scDao = new scDao();
            map.put("scDao",scDao);
        }
        return scDao;

    }

    public teacherDao getteacherDao() {

        teacherDao teacherDao = (teacherDao) map.get("teacherDao");
        if (teacherDao != null) {
            return teacherDao;
        }else {
            teacherDao = new teacherDao();
            map.put("teacherDao",teacherDao);
        }
        return teacherDao;

    }





}

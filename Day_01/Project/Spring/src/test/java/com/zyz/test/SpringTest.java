package com.zyz.test;

import com.zyz.pojo.Student;
import com.zyz.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest {

    @Test
    public void test01(){
//        //1.加载配置文件
//        ApplicationContext app1 = new FileSystemXmlApplicationContext()
        ApplicationContext app = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml","a1.xml"});
        //2.获得user对象：
//        User user = (User) app.getBean("us");
//        user.setUage(11);
//        user.setUid(1);
//        user.setUname("ss");
//        user.setUsex("jj");
//        System.out.println(user);
        User user = (User)app.getBean("us2");
        System.out.println(user);
        User user1 = (User)app.getBean("us5");
        System.out.println(user1);

    }

    @Test
    public void test2(){

        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContextDI.xml");
        Student student =(Student) app.getBean("student");
        System.out.println(student.toString());
    }

}

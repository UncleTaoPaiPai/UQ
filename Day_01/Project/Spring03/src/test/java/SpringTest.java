import com.zyz.pojo.Dept;
import com.zyz.service.DeptService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringTest {

    @Test
    public void test01(){
        ApplicationContext app= new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptService deptService=(DeptService)app.getBean("deptServiceImpl");
        List<Dept> list = null;
        try {
            list = deptService.findAll();
            for (Dept dept : list) {
                System.out.println(dept.getDeptno() + ";" + dept.getDname() + ";" + dept.getLoc());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

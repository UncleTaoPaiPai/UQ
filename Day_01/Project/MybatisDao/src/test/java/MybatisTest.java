import com.zyz.dao.impl.deptDaoImpl;
import com.zyz.pojo.dept;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.lf5.util.Resource;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    private SqlSessionFactory factory;

    @Before
    public void init() throws IOException {
        InputStream resource = Resources.getResourceAsStream("SqlMapConfig.xml");

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(resource);
    }

    @Test
    public void findAll() throws Exception{
        deptDaoImpl deptDao = new deptDaoImpl(factory);
        List<dept> list = deptDao.selectAll();
        for (dept dept : list) {
            System.out.println(dept.getDeptno() + ";" + dept.getDname() + ";" + dept.getLoc());
        }
    }
}

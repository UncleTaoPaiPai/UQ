package com.zyz.dao;

import com.zyz.domain.User;
import com.zyz.utill.DataSourceUtil;
import org.apache.commons.dbutils.*;

/**
 * @Auther : YongggzHi
 * @Date : 2021/8/7 - 23:54
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */
public class UserDao {

    private QueryRunner queryRunner = new QueryRunner(DataSourceUtil.getDataSource());
    //开启驼峰映射
    private BeanProcessor beanProcessor = new GenerousBeanProcessor();
    private RowProcessor processor = new BasicRowProcessor(beanProcessor);


    public int save(User user) {
        "insert into user("
    }

}

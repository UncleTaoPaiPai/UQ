package com.zyz.test;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public void generator() throws Exception{
        List<String> warings = new ArrayList<String>();
        boolean overwrite = true;

        File configFile = new File("C:\\Users\\Yongzhi\\Desktop\\Project\\MybatisReverse\\src\\main\\resources\\generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,callback,warings);
        myBatisGenerator.generate(null);

    }

    public static void main(String[] args) throws Exception {
        try{
            Test test = new Test();
            test.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
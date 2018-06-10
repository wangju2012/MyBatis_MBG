package com.wangju.mybatis.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 描述信息.
 * Created with IntelliJ IDEA.
 * User: wangju
 * Date: 2017/7/6
 * Time: 9:30
 */
public class MyBatisTest {


    public SqlSessionFactory getSqlSessionFactory() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        return  new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testMbg() throws Exception {

        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("mbg.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

   /* @Test
    public void testSimple() throws IOException {
        SqlSessionFactory sqlSessionFactory=getSqlSessionFactory();
        SqlSession openSession = sqlSessionFactory.openSession();
        try {
            EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
            List<Employee> list = mapper.selectByExample(null);
            for (Employee employee:list) {
                System.out.println(employee);
            }
        } finally {
            openSession.close();
        }
    }*/

    /*@Test
    public void testMyBatis3() throws IOException {
        SqlSessionFactory sqlSessionFactory=getSqlSessionFactory();
        SqlSession openSession = sqlSessionFactory.openSession();
        try {
            EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
//          查询员工名字中带有e字母的，和员工性别是1的
//            封装员工查询条件的example
            EmployeeExample example = new EmployeeExample();
            EmployeeExample.Criteria criteria1 = example.createCriteria();
            criteria1.andLastNameLike("%e%");
            criteria1.andGenderEqualTo("1");

            EmployeeExample.Criteria criteria2= example.createCriteria();
            criteria2.andEmailLike("%e%");
            //完成两个条件的拼装
            example.or(criteria2);

            List<Employee> emps = mapper.selectByExample(example);
            for (Employee emp:emps) {
                System.out.println(emp);
            }
        } finally {
            openSession.close();
        }

    }*/
//            封装xxxExample用来封装查询条件的，如果没有条件，就传null
//            List<Employee> emps = mapper.selectByExample(null);
}


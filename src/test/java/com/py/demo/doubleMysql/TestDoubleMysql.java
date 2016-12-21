package com.py.demo.doubleMysql;

import com.py.demo.dao.UserMapper;
import com.py.demo.model.User;
import com.py.demo.tool.mysql.DataSourceContextHolder;
import com.py.demo.tool.mysql.DataSourceType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by Administrator on 2016/9/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration//JUnit和Swagger冲突
@ContextConfiguration("classpath:application.xml") //加载xml文件
public class TestDoubleMysql {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {

        User user = new User();
        user.setUsername("PY");
        user.setPassword("admin");

        DataSourceContextHolder.setDBType(DataSourceType.TEST_ONE);//设置数据源

        int row1 = userMapper.insert(user);
        User getUser1 = userMapper.getById(user.getId());

        System.out.println("row1=" + row1 + "   " + "getUser=" + getUser1);


        DataSourceContextHolder.clearDBType();//关闭数据源
        DataSourceContextHolder.setDBType(DataSourceType.TEST_TWO);//切换数据源

        int row2 = userMapper.insert(user);
        User getUser2 = userMapper.getById(user.getId());


        DataSourceContextHolder.clearDBType();//关闭数据源

        System.out.println("row2=" + row2 + "   " + "getUser2=" + getUser2);
    }
}

package com.py.demo.interceptor;

import com.py.demo.service.UserServicre;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/12/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration//JUnit和Swagger冲突
@ContextConfiguration("classpath:application.xml") //加载xml文件
public class TestException {
    @Resource
    private UserServicre userServicre;

    @Test
    public void test() {
        userServicre.insert(null);
    }
}

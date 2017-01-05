/**
 * MongoTest.java
 * ��Ȩ����(C) 2012
 * ����:cuiran 2012-12-12 11:54:30
 */
package com.py.demo.mongo;

import com.py.demo.model.User;
import com.py.demo.tool.mongo.impl.MongoUserDao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.util.List;


/**
 * TODO
 *
 * @author cuiran
 * @version TODO
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration//JUnit和Swagger冲突
@ContextConfiguration("classpath:application.xml")
public class MongoTest {

    private static Log log = LogFactory.getLog(MongoTest.class.getName());

    @Resource
    private MongoUserDao pr;

//    @Resource
//    private AbstractRepository pr;

    /**
     * 新增
     */
    @Test
    public void insert() {

        User user = new User();
        user.setId(100L);
        user.setUsername("admin");
        user.setPassword("admin");
        pr.insert(user);

//        Admin admin = new Admin();
//        admin.setId(100L);
//        admin.setUsername("admin");
//        admin.setPassword("admin");
//        pr.insert(admin);


    }


    /**
     * 查询一条
     */
    @Test
    public void findOne() {
        Long id = 70L;
        User user = pr.findOne(id);
        System.out.println(user);
    }


    /**
     * 查询所有
     */
    @Test
    public void listAll() {

        List<User> list = pr.findAll();
        log.debug("findAll:");
        for (User p : list) {
            System.out.println(p.toString());
        }


    }

    /**
     * 正则查询
     */
    @Test
    public void findByRegex() {

        List<User> userList = pr.findByRegex("admin");
        for (User p : userList) {
            System.out.println(p.toString());
        }
    }

    @Test
    public void removeOne() {

        pr.removeOne(70L);

    }

    @Test
    public void findAndModify() {

//        pr.findAndModify(70L, "username", "test");
        pr.findAndModify(70L);

    }

    @Test
    public void removeAll() {

        pr.removeAll();

    }

    /**
     * <b>function:</b>���Է���
     *
     * @author cuiran
     * @createDate 2012-12-12 16:11:37
     */
    public void start() {

        //insert();
        //listAll();

        findOne();
    }

    /**
     * <b>function:</b>main����
     *
     * @author cuiran
     * @createDate 2012-12-12 11:54:30
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MongoTest t = new MongoTest();
        t.start();
    }

}

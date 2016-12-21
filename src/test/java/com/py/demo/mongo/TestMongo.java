package com.py.demo.mongo;

//import com.py.test.util.cache.RedisCache;
//import mongoModel.friend;
//import mongoModel.imuser;
//import mongoModel.newfriend;

import com.py.demo.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/9/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration//JUnit和Swagger冲突
@ContextConfiguration("classpath:application.xml")
public class TestMongo {
    @Resource
    private MongoTemplate mongoTemplate;

    @Test
    public void test() {

        User user = new User();
        user.setId(70L);
        user.setUsername("admin");
        user.setPassword("admin");
        mongoTemplate.insert(user);
        user = mongoTemplate.findOne(new Query(Criteria.where("id").is(70)), User.class);
        System.out.println(user);
    }
}

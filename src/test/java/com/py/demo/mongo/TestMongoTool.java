package com.py.demo.mongo;

import com.py.demo.model.User;
import org.junit.Test;

/**
 * Created by Administrator on 2016/12/30.
 */
public class TestMongoTool {

    @Test
    public void testFindOne() {

        User user = new User();
        user.setId(70L);
        user.setUsername("admin");
        user.setPassword("admin");
//        mongoTemplate.insert(user);
//        user = mongoTemplate.findOne(new Query(Criteria.where("id").is(70)), User.class);
        System.out.println(user);
    }
}

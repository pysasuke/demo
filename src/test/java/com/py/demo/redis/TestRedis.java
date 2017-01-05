package com.py.demo.redis;

import com.py.demo.model.User;
import com.py.demo.tool.redis.RedisCache;
import com.py.demo.tool.redis.RedisClient;
import com.py.demo.tool.redis.RedisOperationManager;
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
@ContextConfiguration("classpath:application.xml")
public class TestRedis {
    @Autowired
    private RedisCache cache;

    @Test
    public void test() {
        cache.putCacheWithExpireTime("what", "1", 60);
        String s = cache.getCache("what", String.class);
        System.out.println(s);
    }

    @Test
    public void testRedisOperationManager() {
        RedisOperationManager redisOperationManager = RedisOperationManager.init();
//        int count = redisOperationManager.getInt(Constants.CUNUM) + 1;
        //把key和value写入redis
        redisOperationManager.setDate("test:", 2);
        int count = redisOperationManager.getInt("test:");
        System.out.println(count);
        //"%06d" : 用0填充总长度6位
//        System.out.println("CU"+ TimeTools.getCodingDate()+String.format("%06d",count));
        User user = new User();

        user.setId(1L);
        user.setUsername("PY");
        user.setPassword("admin");
        redisOperationManager.setDate("user:", user);

        user = (User) redisOperationManager.getObject("user:");
        System.out.println("username:" + user.getUsername() + "   " + "password:" + user.getPassword());
    }


    @Test
    public void testRedisClient() {
        User user = new User();
        user.setId(1L);
        user.setUsername("PY");
        user.setPassword("admin44");
        boolean reusltCache = RedisClient.set("admin", user);
        if (reusltCache) {
            System.out.println("向缓存中保存对象成功。");
        } else {
            System.out.println("向缓存中保存对象失败。");
        }

        user = RedisClient.get("admin", User.class);
        if (user != null) {
            System.out.println("从缓存中获取的对象，" + user.getUsername() + "@" + user.getPassword());
        }
    }


}

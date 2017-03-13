package com.py.demo.commonUtil;

import com.py.demo.model.User;
import com.py.demo.util.CommonUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/28.
 */
public class TestCommonUtil {

    @Test
    public void testCombineStrs() {
        String s = CommonUtil.combineStrs("what", "are", "you", "doing?");
        System.out.println(s);
    }

    @Test
    public void testGetRandomString() {
        String s = CommonUtil.getRandomString(10);
        System.out.println(s);
    }

    @Test
    public void testGetRandomNumber() {
        String s = CommonUtil.getRandomNumber(10);
        System.out.println(s);
    }

    @Test
    public void testEncoderByMd5() {
        String s = CommonUtil.encoderByMd5("123456");
        System.out.println(s);
    }

    @Test
    public void testEncoderPwdByMd5() {
        String s = CommonUtil.encoderPwdByMd5("123456");
        System.out.println(s);
    }

    @Test
    public void testToInteger() {
        User user = new User();
        Integer i = CommonUtil.toInteger(user);
        System.out.println(i);
    }

    @Test
    public void testCreateToken() {
        String s = CommonUtil.createToken();
        System.out.println(s);
    }

    @Test
    public void testGetRomStr() {
        String s = CommonUtil.getRomStr();
        System.out.println(s);
    }

    @Test
    public void testGetMapFromJson() {
        Map<?, ?> map = CommonUtil.getMapFromJson("{\"A\":\"6\"}");
        System.out.println(map);
    }

    @Test
    public void testGetFromBASE64() {
        String s = CommonUtil.getFromBASE64("YWRtaW4=");
        System.out.println(s);
    }

    @Test
    public void testListToJsonString() {
        User user1 = new User();
        user1.setUsername("admin");
        user1.setUsername("123456");
        User user2 = new User();
        user2.setUsername("user");
        user2.setUsername("123");


        List<User> userlist = new ArrayList<User>();
        userlist.add(user1);
        userlist.add(user2);
//        String s = commonUtil.listToJsonString(userlist);
        System.out.println(userlist.toString());
    }

}

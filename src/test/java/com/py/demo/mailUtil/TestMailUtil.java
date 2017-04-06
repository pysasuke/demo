package com.py.demo.mailUtil;

import com.py.demo.util.Mail;
import org.junit.Test;

/**
 * Created by Administrator on 2016/12/30.
 */
public class TestMailUtil {

    @Test
    public void test() {
        Mail.send("smtp.163.com", "18720978420@163.com", "404158848@qq.com",
                "这是一条测试信息", "我想和你聊聊天", "18720978420@163.com", "pengyong940130");
    }
}

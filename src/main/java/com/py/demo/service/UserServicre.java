package com.py.demo.service;

import com.py.demo.common.enums.ResponseCode;
import com.py.demo.dao.UserMapper;
import com.py.demo.model.User;
import com.py.demo.util.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/12/20.
 */
@Service("userService")
public class UserServicre {
    @Autowired
    private UserMapper userMapper;

    public int insert(User user) {
        throw new ServiceException(ResponseCode.SYSTEM_EXCEPTION, "WHAT");
//        return userMapper.insert(user);
    }
}

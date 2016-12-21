package com.py.demo.controller;

import com.py.demo.service.UserServicre;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/12/20.
 */
@Controller
@RequestMapping(value = "/v1/user", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "user")
public class UserController {
    @Resource
    private UserServicre userServicre;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "test", httpMethod = "GET", response = UserController.class, notes = "test")
    public void test() {
        userServicre.insert(null);
    }
}

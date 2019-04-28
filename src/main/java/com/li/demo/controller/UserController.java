package com.li.demo.controller;

import com.li.demo.pojo.PersonInfo;
import com.li.demo.pojo.UserInfo;
import com.li.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by user on 2019/4/27.
 *
 * @Author user
 */
@Controller
@RequestMapping(value = "/aopController")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/query" ,method = RequestMethod.POST)
    public String login( UserInfo userInfo){
        String user = userService.getUserInfo(userInfo);
        return user;
    }
}

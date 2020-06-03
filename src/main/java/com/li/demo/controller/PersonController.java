package com.li.demo.controller;

import com.li.demo.pojo.PersonInfo;
import com.li.demo.pojo.UserInfo;
import com.li.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * Created by user on 2019/4/26.
 *
 * @Author user
 */
@Controller
@RequestMapping(value = "/aopController")
public class PersonController {
    @Autowired
    private PersonService personService;
    @RequestMapping(value = "/login" ,method = RequestMethod.POST)
    public String login( PersonInfo personInfo){
        String person = personService.getPersonInfo(personInfo);
        return person;
    }
//licenfeng 123
    @RequestMapping(value = "/logout" ,method = RequestMethod.POST)
    public String logout( PersonInfo personInfo){
        return personInfo.toString();
    }
}

package com.li.demo.service;

import com.li.demo.pojo.PersonInfo;
import org.springframework.stereotype.Service;

/**
 * Created by user on 2019/4/27.
 *
 * @Author user
 */
@Service
public class PersonService {
    public String getPersonInfo(PersonInfo personInfo){
        String s = null;
        s.equals("ss");
        return personInfo.toString();
    }
}

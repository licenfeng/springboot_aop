package com.li.demo.service;

import com.li.demo.pojo.UserInfo;
import org.springframework.stereotype.Service;

/**
 * Created by user on 2019/4/27.
 *
 * @Author user
 */
@Service
public class UserService {
    public String getUserInfo(UserInfo userInfo){
        return userInfo.toString();
    }
}

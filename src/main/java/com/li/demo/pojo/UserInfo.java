package com.li.demo.pojo;

/**
 * Created by user on 2019/4/26.
 *
 * @Author user
 */
public class UserInfo {
    private String name;
    private String mobile;
    private Integer age;

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

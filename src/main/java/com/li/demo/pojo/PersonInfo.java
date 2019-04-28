package com.li.demo.pojo;

/**
 * Created by user on 2019/4/27.
 *
 * @Author user
 */
public class PersonInfo {
    private String job;
    private String hobby;
    private String high;
    private String weight;

    @Override
    public String toString() {
        return "PersonInfo{" +
                "job='" + job + '\'' +
                ", hobby='" + hobby + '\'' +
                ", high='" + high + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}

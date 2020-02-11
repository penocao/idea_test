package com.exodus.pojo;

/**
 * @Author: soushihou
 * @Date: 2020/1/31
 * @Description: com.exodus.pojo
 * @version: 1.0
 */
public class User {
    private Integer userid;
    private String username;
    private Integer userage;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserage() {
        return userage;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }
}

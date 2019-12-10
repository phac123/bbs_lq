package com.ncu.bbs.entity;

//user_list(用户表)：
public class User {
    private Integer uid;         //用户id
    private String account;      //账号
    private String username;     //用户名
    private String password;     //密码
    private String phone;        //电话号码
    private String profession;   //职业
    private String workplace;    //工作地点
    private String head;         //头像
    private Integer integral;    //积分
    private Integer flag;        //判断用户是否为管理员；1：超级管理员； 2：普通用户

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", account='" + account + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", profession='" + profession + '\'' +
                ", workplace='" + workplace + '\'' +
                ", head='" + head + '\'' +
                ", integral=" + integral +
                ", flag=" + flag +
                '}';
    }
}

package com.ncu.bbs.entity;

//prob_list(问题表)：
public class Problem {
    private Integer prob_id;       //问题id
    private String prob_unique;    //问题编号
    private Integer user_id;       //发问题的用户id，外键
    private String prob_theme;     //问题的题目
    private String prob_describe;  //问题描述
    private long prob_time;         //问题发布时间
    private String prob_label;      //问题标签
    private Integer prob_ward;      //问题赏金

    public Integer getProb_id() {
        return prob_id;
    }

    public void setProb_id(Integer prob_id) {
        this.prob_id = prob_id;
    }

    public String getProb_unique() {
        return prob_unique;
    }

    public void setProb_unique(String prob_unique) {
        this.prob_unique = prob_unique;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getProb_theme() {
        return prob_theme;
    }

    public void setProb_theme(String prob_theme) {
        this.prob_theme = prob_theme;
    }

    public String getProb_describe() {
        return prob_describe;
    }

    public void setProb_describe(String prob_describe) {
        this.prob_describe = prob_describe;
    }

    public long getProb_time() {
        return prob_time;
    }

    public void setProb_time(long prob_time) {
        this.prob_time = prob_time;
    }

    public String getProb_label() {
        return prob_label;
    }

    public void setProb_label(String prob_label) {
        this.prob_label = prob_label;
    }

    public Integer getProb_ward() {
        return prob_ward;
    }

    public void setProb_ward(Integer prob_ward) {
        this.prob_ward = prob_ward;
    }

    @Override
    public String toString() {
        return "Problem{" +
                "prob_id=" + prob_id +
                ", prob_unique='" + prob_unique + '\'' +
                ", user_id=" + user_id +
                ", prob_theme='" + prob_theme + '\'' +
                ", prob_describe='" + prob_describe + '\'' +
                ", prob_time=" + prob_time +
                ", prob_label='" + prob_label + '\'' +
                ", prob_ward=" + prob_ward +
                '}';
    }
}

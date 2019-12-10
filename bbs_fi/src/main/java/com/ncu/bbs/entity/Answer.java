package com.ncu.bbs.entity;

//answer_list（回答表）
public class Answer {
    private Integer answer_id;         //回答id,  主键，自增
    private String answer_unique;      //回答编号
    private Integer prob_id;           //问题id， 外键
    private Integer user_id;           //进行回答的用户id， 外键
    private String answer_describe;    //回答内容
    private long answer_time;          //回答的时间

    public Integer getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(Integer answer_id) {
        this.answer_id = answer_id;
    }

    public String getAnswer_unique() {
        return answer_unique;
    }

    public void setAnswer_unique(String answer_unique) {
        this.answer_unique = answer_unique;
    }

    public Integer getProb_id() {
        return prob_id;
    }

    public void setProb_id(Integer prob_id) {
        this.prob_id = prob_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getAnswer_describe() {
        return answer_describe;
    }

    public void setAnswer_describe(String answer_describe) {
        this.answer_describe = answer_describe;
    }

    public long getAnswer_time() {
        return answer_time;
    }

    public void setAnswer_time(long answer_time) {
        this.answer_time = answer_time;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "answer_id=" + answer_id +
                ", answer_unique='" + answer_unique + '\'' +
                ", prob_id=" + prob_id +
                ", user_id=" + user_id +
                ", answer_describe='" + answer_describe + '\'' +
                ", answer_time=" + answer_time +
                '}';
    }
}

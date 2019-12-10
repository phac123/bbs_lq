package com.ncu.bbs.entity;

//card_list(帖子表):
public class Card {
    private Integer card_id;       //帖子id   主键，自增
    private String card_unique;    //帖子编号
    private Integer user_id;       //发帖用户id，外键
    private String card_theme;     //帖子题目
    private String card_describe;  //帖子内容
    private Integer like_num;      //点赞数
    private Integer read_num;      //阅读量
    private long card_time;        //帖子发布时间

    public Integer getCard_id() {
        return card_id;
    }

    public void setCard_id(Integer card_id) {
        this.card_id = card_id;
    }

    public String getCard_unique() {
        return card_unique;
    }

    public void setCard_unique(String card_unique) {
        this.card_unique = card_unique;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getCard_theme() {
        return card_theme;
    }

    public void setCard_theme(String card_theme) {
        this.card_theme = card_theme;
    }

    public String getCard_describe() {
        return card_describe;
    }

    public void setCard_describe(String card_describe) {
        this.card_describe = card_describe;
    }

    public Integer getLike_num() {
        return like_num;
    }

    public void setLike_num(Integer like_num) {
        this.like_num = like_num;
    }

    public Integer getRead_num() {
        return read_num;
    }

    public void setRead_num(Integer read_num) {
        this.read_num = read_num;
    }

    public long getCard_time() {
        return card_time;
    }

    public void setCard_time(long card_time) {
        this.card_time = card_time;
    }

    @Override
    public String toString() {
        return "Card{" +
                "card_id=" + card_id +
                ", card_unique='" + card_unique + '\'' +
                ", user_id=" + user_id +
                ", card_theme='" + card_theme + '\'' +
                ", card_describe='" + card_describe + '\'' +
                ", like_num=" + like_num +
                ", read_num=" + read_num +
                ", card_time=" + card_time +
                '}';
    }
}

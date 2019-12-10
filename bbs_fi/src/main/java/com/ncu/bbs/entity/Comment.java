package com.ncu.bbs.entity;

//comment_list(评论表)：
public class Comment {
    private Integer comment_id;          //评论id,主键，自增
    private  String comment_unque;       //评论编号
    private Integer user_id;             //发表品论用户id，外键
    private Integer card_id;             //所属帖子id，外键
    private String comment_describe;     //评论内容
    private long comment_time;           //评论时间

    public Integer getComment_id() {
        return comment_id;
    }

    public void setComment_id(Integer comment_id) {
        this.comment_id = comment_id;
    }

    public String getComment_unque() {
        return comment_unque;
    }

    public void setComment_unque(String comment_unque) {
        this.comment_unque = comment_unque;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getCard_id() {
        return card_id;
    }

    public void setCard_id(Integer card_id) {
        this.card_id = card_id;
    }

    public String getComment_describe() {
        return comment_describe;
    }

    public void setComment_describe(String comment_describe) {
        this.comment_describe = comment_describe;
    }

    public long getComment_time() {
        return comment_time;
    }

    public void setComment_time(long comment_time) {
        this.comment_time = comment_time;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "comment_id=" + comment_id +
                ", comment_unque='" + comment_unque + '\'' +
                ", user_id=" + user_id +
                ", card_id=" + card_id +
                ", comment_describe='" + comment_describe + '\'' +
                ", comment_time=" + comment_time +
                '}';
    }
}

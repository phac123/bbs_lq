package com.ncu.bbs.entity;

//announcement_list(公告表)
public class Announcement {
    private Integer anno_id;        //公告id，主键，自增
    private String anno_unique;     //公告编号
    private String anno_theme;      //公告题目
    private String anno_describe;   //公告内容
    private long anno_time;         //公告发布时间

    public Integer getAnno_id() {
        return anno_id;
    }

    public void setAnno_id(Integer anno_id) {
        this.anno_id = anno_id;
    }

    public String getAnno_unique() {
        return anno_unique;
    }

    public void setAnno_unique(String anno_unique) {
        this.anno_unique = anno_unique;
    }

    public String getAnno_theme() {
        return anno_theme;
    }

    public void setAnno_theme(String anno_theme) {
        this.anno_theme = anno_theme;
    }

    public String getAnno_describe() {
        return anno_describe;
    }

    public void setAnno_describe(String anno_describe) {
        this.anno_describe = anno_describe;
    }

    public long getAnno_time() {
        return anno_time;
    }

    public void setAnno_time(long anno_time) {
        this.anno_time = anno_time;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "anno_id=" + anno_id +
                ", anno_unique='" + anno_unique + '\'' +
                ", anno_theme='" + anno_theme + '\'' +
                ", anno_describe='" + anno_describe + '\'' +
                ", anno_time=" + anno_time +
                '}';
    }
}

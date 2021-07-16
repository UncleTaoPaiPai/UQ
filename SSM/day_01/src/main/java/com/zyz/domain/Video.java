package com.zyz.domain;

import java.util.Date;

/**
 * @Auther : YongggzHi
 * @Date : 2021/7/17 - 0:40
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */
public class Video {

    private int id;
    private String title;
    private String summary;
    private int price;
    private String coverImg;
    private Date createTime;

    public Video() {
    }

    public Video(int id, String title) {
        this.id = id;
        this.title = title;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", price=" + price +
                ", coverImg='" + coverImg + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}

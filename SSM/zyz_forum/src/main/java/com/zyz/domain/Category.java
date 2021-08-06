package com.zyz.domain;

import java.util.Date;

/**
 * @Auther : YongggzHi
 * @Date : 2021/8/5 - 18:39
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */
public class Category {

    private int id;
    private String name;
    private int weight;

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

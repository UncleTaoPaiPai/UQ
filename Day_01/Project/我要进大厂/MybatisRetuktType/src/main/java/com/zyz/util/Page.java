package com.zyz.util;

import com.zyz.pojo.Users;

import java.util.List;

public class Page {

    //一共有多少条数据
    private Integer datacount;

    //每页显示多少页数据；
    private Integer showdata;

    //当前分成多少个页
    private Integer pagecount;

    //当前是第几页
    private Integer pageindex;

    private List<Users> list;

    public Page() {
    }

    public Page(Integer datacount, Integer showdata, Integer pagecount, Integer pageindex, List<Users> list) {
        this.datacount = datacount;
        this.showdata = showdata;
        this.pagecount = pagecount;
        this.pageindex = pageindex;
        this.list = list;
    }

    public Integer getDatacount() {
        return datacount;
    }

    public void setDatacount(Integer datacount) {
        this.datacount = datacount;
    }

    public Integer getShowdata() {
        return showdata;
    }

    public void setShowdata(Integer showdata) {
        this.showdata = showdata;
    }

    public Integer getPagecount() {
        return this.datacount%this.showdata==0?this.datacount/this.showdata:this.datacount/this.showdata+1;
    }

//    public void setPagecount(Integer pagecount) {
//        this.pagecount = pagecount;
//    }

    public Integer getPageindex() {
        return pageindex;
    }

    public void setPageindex(Integer pageindex) {
        this.pageindex = pageindex;
    }

    public List<Users> getList() {
        return list;
    }

    public void setList(List<Users> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Page{" +
                "datacount=" + datacount +
                ", showdata=" + showdata +
                ", pagecount=" + pagecount +
                ", pageindex=" + pageindex +
                ", list=" + list +
                '}';
    }
}

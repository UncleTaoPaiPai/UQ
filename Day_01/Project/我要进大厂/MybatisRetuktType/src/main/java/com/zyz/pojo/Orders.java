package com.zyz.pojo;

import java.util.Date;
import java.util.List;

public class Orders {
    private Integer oid;

    private Integer userid;

    private String orderid;

    private Date createtime;

    private String status;

    private List<Orderdetail> orders;

    public List<Orderdetail> getOrders() {
        return orders;
    }

    public void setOrders(List<Orderdetail> orders) {
        this.orders = orders;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}
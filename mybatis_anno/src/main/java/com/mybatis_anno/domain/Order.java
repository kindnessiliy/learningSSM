package com.mybatis_anno.domain;

import java.util.Date;

/**
 * @author:zyh
 * @Time:2020-11-18-10:22
 * @email:1269231889@qq.com
 */
public class Order {
    private int id;
    private int status;
    private Customer customer;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + id +
                ",order_date="+ date +
                ", status=" + status +
                ", customer=" + customer +
                '}';
    }
}

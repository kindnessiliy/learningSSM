package com.springtry.domain;

import java.util.Date;
import java.util.List;

/**
 * @author:zyh
 * @Time:2020-11-23-17:44
 * @email:1269231889@qq.com
 */
public class SmallStore {
    private List<User> user;
    private Date endDate;
    private String storeName;
    private String kind;
    private String address;

    public SmallStore() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public SmallStore(String storeName, String kind, String address) {
        this.storeName = storeName;
        this.kind = kind;
        this.address = address;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public List<User> getUser() {
        return user;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}

package com.springtry.domain;

/**
 * @author:zyh
 * @Time:2020-11-23-17:44
 * @email:1269231889@qq.com
 */
public class User {
    private String name;
    private String address;
    private boolean isFemale;
    private String phone;
    private boolean isVip;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }
}

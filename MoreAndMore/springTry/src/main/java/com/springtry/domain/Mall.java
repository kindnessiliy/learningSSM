package com.springtry.domain;

import java.util.Date;
import java.util.List;

/**
 * @author:zyh
 * @Time:2020-11-23-17:44
 * @email:1269231889@qq.com
 */
public class Mall {
    private List<SmallStore> smallStore;
    private String address;
    private String mallName;
    private Date beginDate;

    public List<SmallStore> getSmallStore() {
        return smallStore;
    }

    public void setSmallStore(List<SmallStore> smallStore) {
        this.smallStore = smallStore;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }
}

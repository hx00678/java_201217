package com.qa.springboot.entry;

public class UserAddress {
    private Integer aid;

    private String shAddress;

    private Integer userid;

    private Integer status;

    private String postcode;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getShAddress() {
        return shAddress;
    }

    public void setShAddress(String shAddress) {
        this.shAddress = shAddress == null ? null : shAddress.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }
}
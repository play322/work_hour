package com.it.wh.pojo;

import java.util.Date;

public class SysUser {
    private Long id;

    private String suName;

    private String suLoginName;

    private String suLoginPasswd;

    private Byte suSex;

    private Date suBirthDt;

    private String suIcon;

    private String suAddress;

    private String suProvince;

    private String suCity;

    private String suDistrict;

    private Long suDeptId;

    private String suEmail;

    private String suMobile;

    private Byte suStatus;

    private Byte suCreateUid;

    private Date suCreateDt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSuName() {
        return suName;
    }

    public void setSuName(String suName) {
        this.suName = suName == null ? null : suName.trim();
    }

    public String getSuLoginName() {
        return suLoginName;
    }

    public void setSuLoginName(String suLoginName) {
        this.suLoginName = suLoginName == null ? null : suLoginName.trim();
    }

    public String getSuLoginPasswd() {
        return suLoginPasswd;
    }

    public void setSuLoginPasswd(String suLoginPasswd) {
        this.suLoginPasswd = suLoginPasswd == null ? null : suLoginPasswd.trim();
    }

    public Byte getSuSex() {
        return suSex;
    }

    public void setSuSex(Byte suSex) {
        this.suSex = suSex;
    }

    public Date getSuBirthDt() {
        return suBirthDt;
    }

    public void setSuBirthDt(Date suBirthDt) {
        this.suBirthDt = suBirthDt;
    }

    public String getSuIcon() {
        return suIcon;
    }

    public void setSuIcon(String suIcon) {
        this.suIcon = suIcon == null ? null : suIcon.trim();
    }

    public String getSuAddress() {
        return suAddress;
    }

    public void setSuAddress(String suAddress) {
        this.suAddress = suAddress == null ? null : suAddress.trim();
    }

    public String getSuProvince() {
        return suProvince;
    }

    public void setSuProvince(String suProvince) {
        this.suProvince = suProvince == null ? null : suProvince.trim();
    }

    public String getSuCity() {
        return suCity;
    }

    public void setSuCity(String suCity) {
        this.suCity = suCity == null ? null : suCity.trim();
    }

    public String getSuDistrict() {
        return suDistrict;
    }

    public void setSuDistrict(String suDistrict) {
        this.suDistrict = suDistrict == null ? null : suDistrict.trim();
    }

    public Long getSuDeptId() {
        return suDeptId;
    }

    public void setSuDeptId(Long suDeptId) {
        this.suDeptId = suDeptId;
    }

    public String getSuEmail() {
        return suEmail;
    }

    public void setSuEmail(String suEmail) {
        this.suEmail = suEmail == null ? null : suEmail.trim();
    }

    public String getSuMobile() {
        return suMobile;
    }

    public void setSuMobile(String suMobile) {
        this.suMobile = suMobile == null ? null : suMobile.trim();
    }

    public Byte getSuStatus() {
        return suStatus;
    }

    public void setSuStatus(Byte suStatus) {
        this.suStatus = suStatus;
    }

    public Byte getSuCreateUid() {
        return suCreateUid;
    }

    public void setSuCreateUid(Byte suCreateUid) {
        this.suCreateUid = suCreateUid;
    }

    public Date getSuCreateDt() {
        return suCreateDt;
    }

    public void setSuCreateDt(Date suCreateDt) {
        this.suCreateDt = suCreateDt;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "id=" + id +
                ", suName='" + suName + '\'' +
                ", suLoginName='" + suLoginName + '\'' +
                ", suLoginPasswd='" + suLoginPasswd + '\'' +
                ", suSex=" + suSex +
                ", suBirthDt=" + suBirthDt +
                ", suIcon='" + suIcon + '\'' +
                ", suAddress='" + suAddress + '\'' +
                ", suProvince='" + suProvince + '\'' +
                ", suCity='" + suCity + '\'' +
                ", suDistrict='" + suDistrict + '\'' +
                ", suDeptId=" + suDeptId +
                ", suEmail='" + suEmail + '\'' +
                ", suMobile='" + suMobile + '\'' +
                ", suStatus=" + suStatus +
                ", suCreateUid=" + suCreateUid +
                ", suCreateDt=" + suCreateDt +
                '}';
    }

    
}
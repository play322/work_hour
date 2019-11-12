package com.it.wh.pojo;

import java.util.Date;

public class SysRole {
    private Long id;

    private String srName;

    private String srSign;

    private String srRemark;

    private Long srCreateUid;

    private Date srCreateDt;

    private Date srUpdateDt;

    private Long srUpdateUid;

    private String srIssuperadmin;

    private String srIssysadmin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSrName() {
        return srName;
    }

    public void setSrName(String srName) {
        this.srName = srName == null ? null : srName.trim();
    }

    public String getSrSign() {
        return srSign;
    }

    public void setSrSign(String srSign) {
        this.srSign = srSign == null ? null : srSign.trim();
    }

    public String getSrRemark() {
        return srRemark;
    }

    public void setSrRemark(String srRemark) {
        this.srRemark = srRemark == null ? null : srRemark.trim();
    }

    public Long getSrCreateUid() {
        return srCreateUid;
    }

    public void setSrCreateUid(Long srCreateUid) {
        this.srCreateUid = srCreateUid;
    }

    public Date getSrCreateDt() {
        return srCreateDt;
    }

    public void setSrCreateDt(Date srCreateDt) {
        this.srCreateDt = srCreateDt;
    }

    public Date getSrUpdateDt() {
        return srUpdateDt;
    }

    public void setSrUpdateDt(Date srUpdateDt) {
        this.srUpdateDt = srUpdateDt;
    }

    public Long getSrUpdateUid() {
        return srUpdateUid;
    }

    public void setSrUpdateUid(Long srUpdateUid) {
        this.srUpdateUid = srUpdateUid;
    }

    public String getSrIssuperadmin() {
        return srIssuperadmin;
    }

    public void setSrIssuperadmin(String srIssuperadmin) {
        this.srIssuperadmin = srIssuperadmin == null ? null : srIssuperadmin.trim();
    }

    public String getSrIssysadmin() {
        return srIssysadmin;
    }

    public void setSrIssysadmin(String srIssysadmin) {
        this.srIssysadmin = srIssysadmin == null ? null : srIssysadmin.trim();
    }
}
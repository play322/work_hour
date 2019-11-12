package com.it.wh.pojo;

import java.util.Date;

public class SysDict {
    private Long id;

    private String sdName;

    private String sdValue;

    private String sdType;

    private String sdDesc;

    private Integer sdOrder;

    private Long sdParentId;

    private Long sdCreateUid;

    private Date sdCreateDt;

    private Long sdUpdateUid;

    private Date sdUpdateDt;

    private String sdRemark;

    private String sdDelFlag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSdName() {
        return sdName;
    }

    public void setSdName(String sdName) {
        this.sdName = sdName == null ? null : sdName.trim();
    }

    public String getSdValue() {
        return sdValue;
    }

    public void setSdValue(String sdValue) {
        this.sdValue = sdValue == null ? null : sdValue.trim();
    }

    public String getSdType() {
        return sdType;
    }

    public void setSdType(String sdType) {
        this.sdType = sdType == null ? null : sdType.trim();
    }

    public String getSdDesc() {
        return sdDesc;
    }

    public void setSdDesc(String sdDesc) {
        this.sdDesc = sdDesc == null ? null : sdDesc.trim();
    }

    public Integer getSdOrder() {
        return sdOrder;
    }

    public void setSdOrder(Integer sdOrder) {
        this.sdOrder = sdOrder;
    }

    public Long getSdParentId() {
        return sdParentId;
    }

    public void setSdParentId(Long sdParentId) {
        this.sdParentId = sdParentId;
    }

    public Long getSdCreateUid() {
        return sdCreateUid;
    }

    public void setSdCreateUid(Long sdCreateUid) {
        this.sdCreateUid = sdCreateUid;
    }

    public Date getSdCreateDt() {
        return sdCreateDt;
    }

    public void setSdCreateDt(Date sdCreateDt) {
        this.sdCreateDt = sdCreateDt;
    }

    public Long getSdUpdateUid() {
        return sdUpdateUid;
    }

    public void setSdUpdateUid(Long sdUpdateUid) {
        this.sdUpdateUid = sdUpdateUid;
    }

    public Date getSdUpdateDt() {
        return sdUpdateDt;
    }

    public void setSdUpdateDt(Date sdUpdateDt) {
        this.sdUpdateDt = sdUpdateDt;
    }

    public String getSdRemark() {
        return sdRemark;
    }

    public void setSdRemark(String sdRemark) {
        this.sdRemark = sdRemark == null ? null : sdRemark.trim();
    }

    public String getSdDelFlag() {
        return sdDelFlag;
    }

    public void setSdDelFlag(String sdDelFlag) {
        this.sdDelFlag = sdDelFlag == null ? null : sdDelFlag.trim();
    }
}
package com.it.wh.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ProjectInfo {

    private Long id;

    private String piName;

    private String piDepartment;

    private Long piCreateId;

    private String piUsers;


    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date piCreateDt;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date piPlanStartDt;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date piPlanEndDt;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date piRealStartDt;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date piRealEndDt;

    private Byte piState;

    public String getPiUsers() {
        return piUsers;
    }

    public void setPiUsers(String piUsers) {
        this.piUsers = piUsers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPiName() {
        return piName;
    }

    public void setPiName(String piName) {
        this.piName = piName == null ? null : piName.trim();
    }

    public String getPiDepartment() {
        return piDepartment;
    }

    public void setPiDepartment(String piDepartment) {
        this.piDepartment = piDepartment == null ? null : piDepartment.trim();
    }

    public Long getPiCreateId() {
        return piCreateId;
    }

    public void setPiCreateId(Long piCreateId) {
        this.piCreateId = piCreateId;
    }

    public Date getPiCreateDt() {
        return piCreateDt;
    }

    public void setPiCreateDt(Date piCreateDt) {
        this.piCreateDt = piCreateDt;
    }

    public Date getPiPlanStartDt() {
        return piPlanStartDt;
    }

    public void setPiPlanStartDt(Date piPlanStartDt) {
        this.piPlanStartDt = piPlanStartDt;
    }

    public Date getPiPlanEndDt() {
        return piPlanEndDt;
    }

    public void setPiPlanEndDt(Date piPlanEndDt) {
        this.piPlanEndDt = piPlanEndDt;
    }

    public Date getPiRealStartDt() {
        return piRealStartDt;
    }

    public void setPiRealStartDt(Date piRealStartDt) {
        this.piRealStartDt = piRealStartDt;
    }

    public Date getPiRealEndDt() {
        return piRealEndDt;
    }

    public void setPiRealEndDt(Date piRealEndDt) {
        this.piRealEndDt = piRealEndDt;
    }

    public Byte getPiState() {
        return piState;
    }

    public void setPiState(Byte piState) {
        this.piState = piState;
    }

    @Override
    public String toString() {
        return "ProjectInfo{" +
                "id=" + id +
                ", piName='" + piName + '\'' +
                ", piDepartment='" + piDepartment + '\'' +
                ", piCreateId=" + piCreateId +
                ", piCreateDt=" + piCreateDt +
                ", piPlanStartDt=" + piPlanStartDt +
                ", piPlanEndDt=" + piPlanEndDt +
                ", piRealStartDt=" + piRealStartDt +
                ", piRealEndDt=" + piRealEndDt +
                ", piState=" + piState +
                '}';
    }
}
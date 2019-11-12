package com.it.wh.pojo;

public class SysDept {
    private Long deptId;

    private Long deptParentId;

    private String deptName;

    private Integer deptOrder;

    private Byte deptFlag;

    private String deptAddr;

    private String deptContact;

    private String deptPhone;

    private String deptDesc;

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getDeptParentId() {
        return deptParentId;
    }

    public void setDeptParentId(Long deptParentId) {
        this.deptParentId = deptParentId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public Integer getDeptOrder() {
        return deptOrder;
    }

    public void setDeptOrder(Integer deptOrder) {
        this.deptOrder = deptOrder;
    }

    public Byte getDeptFlag() {
        return deptFlag;
    }

    public void setDeptFlag(Byte deptFlag) {
        this.deptFlag = deptFlag;
    }

    public String getDeptAddr() {
        return deptAddr;
    }

    public void setDeptAddr(String deptAddr) {
        this.deptAddr = deptAddr == null ? null : deptAddr.trim();
    }

    public String getDeptContact() {
        return deptContact;
    }

    public void setDeptContact(String deptContact) {
        this.deptContact = deptContact == null ? null : deptContact.trim();
    }

    public String getDeptPhone() {
        return deptPhone;
    }

    public void setDeptPhone(String deptPhone) {
        this.deptPhone = deptPhone == null ? null : deptPhone.trim();
    }

    public String getDeptDesc() {
        return deptDesc;
    }

    public void setDeptDesc(String deptDesc) {
        this.deptDesc = deptDesc == null ? null : deptDesc.trim();
    }
}
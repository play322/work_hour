package com.it.wh.pojo;

public class SysUserRole {
    private Long id;

    private Long surUserId;

    private Long surRoleId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSurUserId() {
        return surUserId;
    }

    public void setSurUserId(Long surUserId) {
        this.surUserId = surUserId;
    }

    public Long getSurRoleId() {
        return surRoleId;
    }

    public void setSurRoleId(Long surRoleId) {
        this.surRoleId = surRoleId;
    }
}
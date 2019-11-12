package com.it.wh.pojo;

import java.util.Date;

public class SysMenu {
    private Long id;

    private Long smParentId;

    private String smName;

    private String smUrl;

    private String smPerms;

    private Integer smType;

    private String smIcon;

    private Integer smOrder;

    private Date smCreateDt;

    private Long smCreateUid;

    private Date smUpdateDt;

    private Long smUpdateUid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSmParentId() {
        return smParentId;
    }

    public void setSmParentId(Long smParentId) {
        this.smParentId = smParentId;
    }

    public String getSmName() {
        return smName;
    }

    public void setSmName(String smName) {
        this.smName = smName == null ? null : smName.trim();
    }

    public String getSmUrl() {
        return smUrl;
    }

    public void setSmUrl(String smUrl) {
        this.smUrl = smUrl == null ? null : smUrl.trim();
    }

    public String getSmPerms() {
        return smPerms;
    }

    public void setSmPerms(String smPerms) {
        this.smPerms = smPerms == null ? null : smPerms.trim();
    }

    public Integer getSmType() {
        return smType;
    }

    public void setSmType(Integer smType) {
        this.smType = smType;
    }

    public String getSmIcon() {
        return smIcon;
    }

    public void setSmIcon(String smIcon) {
        this.smIcon = smIcon == null ? null : smIcon.trim();
    }

    public Integer getSmOrder() {
        return smOrder;
    }

    public void setSmOrder(Integer smOrder) {
        this.smOrder = smOrder;
    }

    public Date getSmCreateDt() {
        return smCreateDt;
    }

    public void setSmCreateDt(Date smCreateDt) {
        this.smCreateDt = smCreateDt;
    }

    public Long getSmCreateUid() {
        return smCreateUid;
    }

    public void setSmCreateUid(Long smCreateUid) {
        this.smCreateUid = smCreateUid;
    }

    public Date getSmUpdateDt() {
        return smUpdateDt;
    }

    public void setSmUpdateDt(Date smUpdateDt) {
        this.smUpdateDt = smUpdateDt;
    }

    public Long getSmUpdateUid() {
        return smUpdateUid;
    }

    public void setSmUpdateUid(Long smUpdateUid) {
        this.smUpdateUid = smUpdateUid;
    }
}
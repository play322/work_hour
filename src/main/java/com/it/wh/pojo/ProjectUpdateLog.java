package com.it.wh.pojo;

import java.util.Date;

public class ProjectUpdateLog {
    private Long id;

    private Long pulPiId;

    private Long pulUpdateUid;

    private Date pulUpdateDt;

    private String pulUpdateContents;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPulPiId() {
        return pulPiId;
    }

    public void setPulPiId(Long pulPiId) {
        this.pulPiId = pulPiId;
    }

    public Long getPulUpdateUid() {
        return pulUpdateUid;
    }

    public void setPulUpdateUid(Long pulUpdateUid) {
        this.pulUpdateUid = pulUpdateUid;
    }

    public Date getPulUpdateDt() {
        return pulUpdateDt;
    }

    public void setPulUpdateDt(Date pulUpdateDt) {
        this.pulUpdateDt = pulUpdateDt;
    }

    public String getPulUpdateContents() {
        return pulUpdateContents;
    }

    public void setPulUpdateContents(String pulUpdateContents) {
        this.pulUpdateContents = pulUpdateContents == null ? null : pulUpdateContents.trim();
    }
}
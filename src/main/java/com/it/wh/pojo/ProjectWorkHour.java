package com.it.wh.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ProjectWorkHour {
    private Long id;

    private Long puiPiId;

    private  String piName;

	  private String suName;

    private Long puiSuId;

	public String getPiName() {
		return piName;
	}

	public void setPiName(String piName) {
		this.piName = piName;
	}

	public String getSuName() {
		return suName;
	}

	public void setSuName(String suName) {
		this.suName = suName;
	}

	private Long puiWorkHour;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date puiInputDt;

	@Override
	public String toString() {
		return "ProjectWorkHour{" +
				"id=" + id +
				", puiPiId=" + puiPiId +
				", piName='" + piName + '\'' +
				", suName='" + suName + '\'' +
				", puiSuId=" + puiSuId +
				", puiWorkHour=" + puiWorkHour +
				", puiInputDt=" + puiInputDt +
				'}';
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPuiPiId() {
        return puiPiId;
    }

    public void setPuiPiId(Long puiPiId) {
        this.puiPiId = puiPiId;
    }

    public Long getPuiSuId() {
        return puiSuId;
    }

    public void setPuiSuId(Long puiSuId) {
        this.puiSuId = puiSuId;
    }

    public Long getPuiWorkHour() {
        return puiWorkHour;
    }

    public void setPuiWorkHour(Long puiWorkHour) {
        this.puiWorkHour = puiWorkHour;
    }

    public Date getPuiInputDt() {
        return puiInputDt;
    }

    public void setPuiInputDt(Date puiInputDt) {
        this.puiInputDt = puiInputDt;
    }
}
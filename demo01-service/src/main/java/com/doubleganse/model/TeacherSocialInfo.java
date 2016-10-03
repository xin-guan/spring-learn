package com.doubleganse.model;

import java.io.Serializable;
import java.util.Date;

/**
 * member.teacher_social_info  
 *
 * @author mingjun chen
 * @date 2016-10-2
 *
 */
public class TeacherSocialInfo implements Serializable {
    /**  */
    private Integer id;

    /** 政治面貌 */
    private String politicsStatus;

    /** 从事的专业方向 */
    private String profession;

    /** 学历 */
    private String degree;

    /** 开始工作时间 */
    private Date workTime;

    /** 工作状态 */
    private String workStatus;

    /** 职位 */
    private String position;

    /** 来校时间 */
    private Date comeSchoolTime;

    /** 教师id */
    private Integer teacherId;

    /** 党政职务 */
    private String partyPosition;

    /** 创建时间 */
    private Date createTime;

    /** 最后更新时间 */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPoliticsStatus() {
        return politicsStatus;
    }

    public void setPoliticsStatus(String politicsStatus) {
        this.politicsStatus = politicsStatus == null ? null : politicsStatus.trim();
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    public Date getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Date workTime) {
        this.workTime = workTime;
    }

    public String getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus == null ? null : workStatus.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Date getComeSchoolTime() {
        return comeSchoolTime;
    }

    public void setComeSchoolTime(Date comeSchoolTime) {
        this.comeSchoolTime = comeSchoolTime;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getPartyPosition() {
        return partyPosition;
    }

    public void setPartyPosition(String partyPosition) {
        this.partyPosition = partyPosition == null ? null : partyPosition.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
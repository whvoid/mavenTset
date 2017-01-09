package com.wanghao.domain;
public class Enroll {
    private long id;
    private long createAt;
    private long updateAt;
    private String studentName;
    private String studentQq;
    private String joinTime;
    private String studentNumber;
    private String logLink;
    private String target;
    private String reference;
    public Enroll() {
	super();
    }
    public Enroll(long id, long createAt, long updateAt, String studentName, String studentQq, String joinTime,
	    String studentNumber, String logLink, String target, String reference) {
	super();
	this.id = id;
	this.createAt = createAt;
	this.updateAt = updateAt;
	this.studentName = studentName;
	this.studentQq = studentQq;
	this.joinTime = joinTime;
	this.studentNumber = studentNumber;
	this.logLink = logLink;
	this.target = target;
	this.reference = reference;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getCreateAt() {
        return createAt;
    }
    public void setCreateAt(long createAt) {
        this.createAt = createAt;
    }
    public long getUpdateAt() {
        return updateAt;
    }
    public void setUpdateAt(long updateAt) {
        this.updateAt = updateAt;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentQq() {
        return studentQq;
    }
    public void setStudentQq(String studentQq) {
        this.studentQq = studentQq;
    }
    public String getJoinTime() {
        return joinTime;
    }
    public void setJoinTime(String joinTime) {
        this.joinTime = joinTime;
    }
    public String getStudentNumber() {
        return studentNumber;
    }
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
    public String getLogLink() {
        return logLink;
    }
    public void setLogLink(String logLink) {
        this.logLink = logLink;
    }
    public String getTarget() {
        return target;
    }
    public void setTarget(String target) {
        this.target = target;
    }
    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }   
}

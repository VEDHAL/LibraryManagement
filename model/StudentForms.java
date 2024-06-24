package com.mru.model;

public class StudentForms {
private String name;
private String name1;

private String course;
private String type;
private String email;
private String numb;
private String gname;
private String no;
private String gender;
private String nation;
private String address;
private String msg;
public StudentForms(String name,String name1 ,String course, String type, String email, String numb, String gname, String no,
		String gender, String nation, String address, String msg) {
	super();
	this.name = name;
	this.name = name1;
	this.course = course;
	this.type = type;
	this.email = email;
	this.numb = numb;
	this.gname = gname;
	this.no = no;
	this.gender = gender;
	this.nation = nation;
	this.address = address;
	this.msg = msg;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getName1() {
	return name1;
}
public void setName1(String name1) {
	this.name1 = name1;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getNumb() {
	return numb;
}
public void setNumb(String numb) {
	this.numb = numb;
}
public String getGname() {
	return gname;
}
public void setGname(String gname) {
	this.gname = gname;
}
public String getNo() {
	return no;
}
public void setNo(String no) {
	this.no = no;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getNation() {
	return nation;
}
public void setNation(String nation) {
	this.nation = nation;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}

}

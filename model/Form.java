package com.mru.model;

public class Form {
private int id;
private String firstname;
private String email;
private String Password;
private long numb;
private String msg;
private String sub;
private String gender;
private String type;
private String state;
private String file;

public Form(int id,String firstname, String email, String password, long numb,String msg,String sub,String gender,String state,String file,String type) {
	super();
	this.id=id;
	this.firstname = firstname;
	this.email = email;
	this.Password = password;
	this.numb = numb;
	this.msg = msg;
	this.sub = sub;
	this.gender = gender;
	this.type = type;
	this.state = state;
	this.file = file;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public long getNumb() {
	return numb;
}
public void setNumb(long numb) {
	this.numb = numb;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
public String getSub() {
	return sub;
}
public void setSub(String sub) {
	this.sub = sub;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getFile() {
	return file;
}
public void setFile(String file) {
	this.file = file;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@Override
public String toString() {
	return "id="+id + ",firstname="+firstname + ",email=" +email + ",Password="+Password + ",numb=" + numb+ ",msg" +msg + 
			",sub="+sub +",gender="+gender  +",type="+type +",state="+state +",file="+file;
}
}

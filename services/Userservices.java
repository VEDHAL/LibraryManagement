package com.demo.services;

import com.demo.dao.*;
import com.mru.model.*;
import java.util.ArrayList;
import java.util.List;

public class Userservices {
	List<Form> li = new ArrayList<Form>();
	FormDao dao = new FormDao();
public String adduser(Form user) {
//	li.add(user);
//	dao.createForm(user);
	return dao.createForm(user);
}
//public List<Form> getuserlist(){
//	List<Form> list = new ArrayList<Form>();
//	Form ob = new Form("rfg","hsgdv@jhygv");
//	Form ob1 = new Form("abd","hsd@jhygv");
//	
//	list.add(ob);
//	list.add(ob1);
//	
//	return list;
//}
public List<Form> getuserlist(){
//	return null;
	return dao.getStudentList();
}
public String userUpdate(Form f) {
	return dao.userUpdate(f);
}
public String userDelete(int id) {
	return dao.userDelete(id);
}
}
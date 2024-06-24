package com.demo.services;

	import com.mru.model.*;
	import java.util.ArrayList;
	import java.util.List;

	public class Studentservices {
		List<StudentForms> lisf = new ArrayList<StudentForms>();
		
	public String adduser(StudentForms user) {
		lisf.add(user);
		return "Student form is Created Succcessfully";
	}
}

package controller.advjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.services.Studentservices;
import com.demo.services.Userservices;
import com.mru.model.Form;
import com.mru.model.StudentForms;

public class Studentservlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("This is a student form");
		String name = req.getParameter("studentname");
		String name1 = req.getParameter("studentname1");
		String course = req.getParameter("course");
		String type = req.getParameter("date");
		String email = req.getParameter("email");
		String numb = req.getParameter("number");
		String gname = req.getParameter("guardianname");
		String no = req.getParameter("numb");
		String gender = req.getParameter("gender");
		String nation = req.getParameter("nation");
		String address = req.getParameter("address");
		String msg = req.getParameter("message");
		
		System.out.println(name);
		System.out.println(name1);
		System.out.println(course);
		System.out.println(type);
		System.out.println(email);
		System.out.println(numb);
		System.out.println(gname);
		System.out.println(no);
		System.out.println(gender);
		System.out.println(nation);
		System.out.println(address);
		System.out.println(msg);
		
		req.setAttribute("Studentname",name);
		
		PrintWriter out = resp.getWriter();
		out.println("Student First Name :" +name);
		out.println("Student Last Name :" +name1);
		out.println("Course choosen :" +course);
		out.println("Date of borth :" +type);
		out.println("E-mail :" +email);
		out.println("Student PH number:" +numb);
		out.println("Guardian Name :" +gname);
		out.println("Guardian PH number :" +no);
		out.println("Gender :" +gender);
		out.println("Nationality :" +nation);
		out.println("House address:" +address);
		out.println("Feedback:" +msg);
		
		StudentForms sf = new StudentForms(name,name1,course,type,email,numb,gname,no,gender,nation,address,msg);
		Studentservices sse = new Studentservices();
		String s = sse.adduser(sf);
		System.out.println(s);	
	}
	}
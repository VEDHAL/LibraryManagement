package controller.advjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.services.Userservices;
import com.mru.model.Form;

public class Updateuserservlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstname = req.getParameter("username");
		String email = req.getParameter("email");
		String Password = req.getParameter("password");
		int id= Integer.parseInt(req.getParameter("id"));
		long numb = Long.parseLong(req.getParameter("number"));
		String msg = req.getParameter("message");
		String sub = req.getParameter("subscribe");
		String gender = req.getParameter("gender");
		String type = req.getParameter("date");
		String state = req.getParameter("state");
		String file = req.getParameter("file");
		
		
		PrintWriter out = resp.getWriter();
		out.println("Form Details: ");
		out.println("ID :" + id);
		out.println("User Name :" + firstname);
		out.println("email :" + email);
		out.println("Password :" + Password);
		out.println("Number :"+numb);
		out.println("Feedback :"+msg);
		out.println("Subscription :"+sub);
		out.println("Gender :"+gender);
		out.println("Date of birth :"+type);
		out.println("State :"+state);
		out.println("Attached file :"+file);
	
		Form f = new Form(id,firstname,email,Password,numb,msg,sub,gender,state,file,type);
		Userservices se = new Userservices();
		String a = se.userUpdate(f);
		System.out.println(a);
	}


}

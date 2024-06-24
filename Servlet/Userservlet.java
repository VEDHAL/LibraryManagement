package controller.advjava;

import java.io.IOException; 
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.demo.services.Userservices;
import com.mru.model.Form;

public class Userservlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("I am servlet here");
		int id= Integer.parseInt(req.getParameter("id"));
		String firstname = req.getParameter("username");
		String email = req.getParameter("email");
		String Password = req.getParameter("password");
		long numb = Long.parseLong(req.getParameter("number"));
		String msg = req.getParameter("message");
		String sub = req.getParameter("subscribe");
		String gender = req.getParameter("gender");
		String type = req.getParameter("date");
		String state = req.getParameter("state");
		String file = req.getParameter("file");
	

		System.out.println(id);
		System.out.println(firstname);
		System.out.println(email);
		System.out.println(Password);
		System.out.println(numb);
		System.out.println(msg);
		System.out.println(sub);
		System.out.println(gender);
		System.out.println(type);
		System.out.println(state);
		System.out.println(file);
		

		req.setAttribute("id", id);
		req.setAttribute("username", firstname);
		req.setAttribute("email", email);
		req.setAttribute("password", Password);
		req.setAttribute("number", numb);
		req.setAttribute("message", msg);
		req.setAttribute("subscribe", sub);
		req.setAttribute("gender", gender);
		req.setAttribute("date", type);
		req.setAttribute("state", state);
		req.setAttribute("file", file);
	

//	req.getRequestDispatcher("response.jsp").forward(req, resp);

		PrintWriter out = resp.getWriter();
		out.println("Form Details: ");
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
		String s = se.adduser(f);
		System.out.println(s);
	
	}
}
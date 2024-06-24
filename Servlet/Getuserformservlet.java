package controller.advjava;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import com.demo.services.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mru.model.Form;


public class Getuserformservlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Userservices gu = new Userservices();
		List<Form> lis = gu.getuserlist();
		
//		PrintWriter pw = resp.getWriter();
//		for(Form u : lis) {
//			System.out.println("Email :"+u.getEmail() + " "+ " UserName :"+ u.getFirstname());
//		
//			pw.println("User Name : "+u.getFirstname());
//			pw.println("Email : "+u.getEmail());
//		
//		}
		PrintWriter pw = resp.getWriter();
			for(Form u : lis) {
				pw.println(u);
			}
	}
}

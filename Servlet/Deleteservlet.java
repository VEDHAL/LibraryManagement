package controller.advjava;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.demo.services.Userservices;

public class Deleteservlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id =Integer.parseInt(req.getParameter("id"));	
	Userservices se = new Userservices();
	String a = se.userDelete(id);
	System.out.println(a);
		
	}
}

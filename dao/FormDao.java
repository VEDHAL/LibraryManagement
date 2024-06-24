package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.mru.model.*;
import java.sql.ResultSet;

public class FormDao {

String url="jdbc:mysql://localhost:3306/FORM";
String user="root";
String pass="Mrud@123M";
	
  public List<Form> getStudentList()
  {
	  List<Form> reslst= new ArrayList<Form>();
	  System.out.println("DAO LAYER");
	  try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select* from FORMS");
		while(rs.next()) {

			int id=rs.getInt("ID");
			String name=rs.getString("USERNAME");
			String email=rs.getString("E_MAIL");
			String password = rs.getString("PASSWORD");
			long numb = rs.getLong("NUMBER");
			String msg =rs.getString("FEEDBACK");
			String sub = rs.getString("SUBSCRIPTION");
			String gender = rs.getString("GENDER");
			String type = rs.getString("DATE_OF_BIRTH");
			String state = rs.getString("STATE");
			String file = rs.getString("ATTTACHED_FILE");
			System.out.println("ID :"+id +" "+" Email :"+email + " "+ " UserName :"+ name+ " " +"Password :"+password +" " + "Number:"+numb+" "+"Feedback :"+msg +" "+ 
			"Subscription:"+sub +" "+ "Gender :"+gender+" "+"Date_of_birth:"+type+" "+"State :"+state+" "+"File :"+file);
			
			Form j = new Form(id,name,email,password,numb,msg,sub,gender,type,state,file);
			reslst.add(j);
		}
	  }
	  catch(ClassNotFoundException e) {
		  e.printStackTrace();
	  }catch (SQLException e) {
		  e.printStackTrace();
	  }
	  return reslst;
  }
  
  public String createForm(Form fobj) {
	  try {
		  Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,pass);
			String query="insert into FORMS(ID,USERNAME,E_mail,PASSWORD,NUMBER,FEEDBACK,SUBSCRIPTION,GENDER,STATE,ATTTACHED_FILE) values(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query); 

			ps.setInt(1,fobj.getId());
			ps.setString(2,fobj.getFirstname());
			ps.setString(3,fobj.getEmail());
			ps.setString(4,fobj.getPassword());
			ps.setLong(5,fobj.getNumb());
			ps.setString(6,fobj.getMsg());
			ps.setString(7,fobj.getSub());
			ps.setString(8,fobj.getGender());
			ps.setString(9,fobj.getState());
			ps.setString(10,fobj.getFile());
//			ps.setString(10,fobj.getType());
			int res=ps.executeUpdate();
			if (res>0) {
				return "successfull inserted";
			}
	  }
	  catch(ClassNotFoundException e) {
		  e.printStackTrace();
	  }catch (SQLException e) {
		  e.printStackTrace();
	  }
	  return "something went wrong";
  }


public String userUpdate(Form f) {
	// TODO Auto-generated method stub
	  
		  try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,pass);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select* from FORMS  where id="+f.getId());
//			int res = st.executeUpdate("select * from FORMS where id="+f.getId());
		while(rs.next()) {
		String updatequery = "update FORMS set USERNAME=?,PASSWORD=? WHERE ID=?";
		PreparedStatement ps = con.prepareStatement(updatequery); 
		ps.setString(1,f.getFirstname());
		ps.setString(2,f.getPassword());
		ps.setInt(3,f.getId());
		int psres=ps.executeUpdate();
		if (psres>0) {
			return "successfull";
		}
  }
	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return "Unsuccessfull";
}


public String userDelete(int f) {
	
	 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,pass);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from FORMS  where id = "+f);
		while(rs.next()&&rs.getInt(1)>0) {
		String updatequery = "delete from FORMS WHERE ID=?";
		PreparedStatement ps = con.prepareStatement(updatequery); 
		ps.setInt(1,f);
		int psres=ps.executeUpdate();
		if (psres>0) {
			return "Deleted successfull";
		}
  }
	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return " Deleted Unsuccessfull";
}
}

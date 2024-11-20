package com.jbk.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Student_Crud {
	public void Insert()throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Shivani@2003");
		PreparedStatement ps=c.prepareStatement("insert into student values(?,?,?)");
		ps.setInt(1,17);
		ps.setString(2, "Vaish");
		ps.setInt(3, 21);
		ps.executeUpdate();
		
		System.out.println("insert data successfully.....");
		c.close();
		
	}
	
	public void updatedata()throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Shivani@2003");
		PreparedStatement ps=c.prepareStatement("update student set name=?where stud_id=?");
		ps.setString(1,"Shiv");
		ps.setInt(2, 11);
		ps.executeUpdate();
		System.out.println("Update data Successfully...");
		c.close();
	}
	
	public void deletedata()throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Shivani@2003");
		PreparedStatement ps=c.prepareStatement("delete from student where stud_id=?");
		ps.setInt(1, 1);
		ps.executeUpdate();
		System.out.println("delete data successfully....");
		c.close();
	}
	public void Fetchdata()throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Shivani@2003");
		PreparedStatement ps=c.prepareStatement("select*from student");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println("Stud_id= "+rs.getInt(1)+" name= "+rs.getString(2)+" age= "+rs.getInt(3));
		}
		c.close();
	}
	
	
	public static void main(String[] args)throws Exception{
		Student_Crud S =new Student_Crud();
		//S.Insert();
		//S.updatedata();
		//S.deletedata();
		S.Fetchdata();
	}
	

}

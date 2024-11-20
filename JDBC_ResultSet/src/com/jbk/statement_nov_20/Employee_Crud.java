package com.jbk.statement_nov_20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employee_Crud {
	public void insertdata() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch197ad", "root", "Shivani@2003");
		Statement s = c.createStatement();
		s.executeUpdate("insert into employee values(19,'vaisha')");
		System.out.println("data is inserted...");
		c.close();
	}

	public void updatedata() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch197ad", "root", "Shivani@2003");
		Statement s = c.createStatement();
		s.executeUpdate("update employee set name='Prachi'where emp_id=3 ");
		System.out.println("data is Updated...");
		c.close();
	}

	public void deletedata() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch197ad", "root", "Shivani@2003");
		Statement s = c.createStatement();
		s.executeUpdate("delete from employee where emp_id=3 ");
		System.out.println("data is deleted...");
		c.close();

	}

	public void Fetchdata()throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch197ad", "root", "Shivani@2003");
		Statement s = c.createStatement();
		ResultSet rs =s.executeQuery("select*from employee ");
		while(rs.next()) {
			System.out.println("EmployeeID= "+rs.getInt(1)+" Employee_Name= "+rs.getString(2));
		}
		
		c.close();
	}

	public static void main(String[] args) throws Exception {
		Employee_Crud d = new Employee_Crud();
		d.insertdata();
		// d.updatedata();
		// d.deletedata();
		//d.Fetchdata();

	}
}

package com.studentmanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.studentmanagement.db.DBConnection;
import com.studentmanagement.model.Student;

public class StudentDao implements StudentDaoInterface {

	@Override
	public boolean insertStudent(Student s) {
		// TODO Auto-generated method stub
		boolean flag=false;
		try {
			Connection con=DBConnection.createConnection();
			String query="insert into Students (rollNo,name,gender,email,Dob,ClgName,city,percentage) values(?,?,?,?,?,?,?,?)";
			
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1, s.getRollNum());
			pst.setString(2, s.getName());
			pst.setString(3, s.getGender());
			pst.setString(4, s.getEmail());
			pst.setDate(5, s.getDoB());
			pst.setString(6, s.getClgName());
			pst.setString(7, s.getCity());
			pst.setFloat(8, (float) s.getPercentage());
			pst.executeUpdate();
			flag=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean delete(String roll) {
		// TODO Auto-generated method stub
		boolean flag=false;
		try {
			Connection con=DBConnection.createConnection();
			String query="delete from Students where rollNo=?";
			PreparedStatement pst= con.prepareStatement(query);
			pst.setString(1, roll);
			int row=pst.executeUpdate();
			if(row>0) {
			flag=true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return flag;
	}

	@Override
	public boolean update(String roll, String update, int ch, Student s) {
	    boolean flag = false;
	    try {
	        Connection con = DBConnection.createConnection();
	        String query = "";
	        
	        if (ch == 1)
	            query = "UPDATE Students SET name=? WHERE rollNo=?";
	        else if (ch == 2)
	            query = "UPDATE Students SET clgName=? WHERE rollNo=?";
	        
	        PreparedStatement ps = con.prepareStatement(query);
	        ps.setString(1, update);
	        ps.setString(2, roll);
	        
	        int rows = ps.executeUpdate();
	        if (rows > 0) flag = true;
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return flag;
	}


	@Override
	public void showAllStudent() {
		// TODO Auto-generated method stub
		try {
			Connection con=DBConnection.createConnection();
			String query="select * from Students";
			Statement stmt=con.createStatement();
			stmt.execute(query);
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println("RollNumber:"+rs.getString(1)+"\n"+
						"Name:"+rs.getString(2)+"\n"+"Gender"+rs.getString(3)+"\n"+
									"email:"+rs.getString(4)+"\n"+"Dob:"+
						rs.getString(5)+"\n"+"ClgName:"+rs.getString(6)+"\n"+
									"city:"+rs.getString(7)+"\n"+"percentage:"+rs.getFloat(8));
						
						System.out.println("-------------------------------");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public boolean showStudentById(String roll) {
		// TODO Auto-generated method stub
		boolean flag=false;
		try {
			Connection con=DBConnection.createConnection();
			String query="select * from Students where rollNo =?";
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.setString(1, roll);
			ResultSet rs=stmt.executeQuery();
			if(rs.next()) {
				System.out.println("RollNumber:"+rs.getString(1)+"\n"+
						"Name:"+rs.getString(2)+"\n"+"Gender"+rs.getString(3)+"\n"+
									"email:"+rs.getString(4)+"\n"+"Dob:"+
						rs.getString(5)+"\n"+"ClgName:"+rs.getString(6)+"\n"+
									"city:"+rs.getString(7)+"\n"+"percentage:"+rs.getFloat(8));
						flag=true;
						System.out.println("-------------------------------");
			}
			else {
				System.out.println("Sry!! Guru jiii....");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}

	

	
	
}

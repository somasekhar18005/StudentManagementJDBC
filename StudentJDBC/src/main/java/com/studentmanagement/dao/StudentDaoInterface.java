package com.studentmanagement.dao;

import com.studentmanagement.model.Student;

public interface StudentDaoInterface {

	public boolean insertStudent(Student s);
	public boolean delete(String roll);
	public boolean update(String roll,String update,int ch,Student s);
	public void showAllStudent();
	public boolean showStudentById(String roll);
	
	
	
	
}

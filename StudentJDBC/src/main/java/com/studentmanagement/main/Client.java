package com.studentmanagement.main;

import java.sql.Date;
import java.util.Scanner;

import com.studentmanagement.model.Student;
import com.studentmanagement.dao.*;

public class Client {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		StudentDaoInterface dao=new StudentDao();
		
		System.out.println("Welcome to Student Management System Gururjii!!!");
		
		
		while(true) {
			System.out.println("\n 1.Add Students"
					+"\n 2.Show All Students"+
					"\n 3.Details with rollNo"+
					"\n 4.Delete the Account"+
					"\n 5.Update the Account"+
					"\n 6.Exist");
			
			System.out.println("Enter the choice guru");
			
			int choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("Add Student");
				
				System.out.println("Enter the student roll");
				
				String rollNo=sc.next();
				sc.nextLine();
				System.out.println("Enter the student name");
				String name=sc.nextLine();
				
				System.out.println("Enter the Gender");
				String Gender=sc.nextLine();
				
				System.out.println("Enter the E-mail");
				String email=sc.nextLine();
				
				System.out.println("Enter the DOB");
				String DOB_str=sc.nextLine();
				Date Dob=Date.valueOf(DOB_str);
				
				System.out.println("Enter the College Name");
				String clgName=sc.next();
				sc.nextLine();
				System.out.println("Enter the city");
				
				String city=sc.next();
				sc.nextLine();
				System.out.println("Enter the percentage");
				float percentage=sc.nextFloat();
				sc.nextLine();
				Student st=new Student(rollNo,name,Gender,email,Dob,clgName,city,percentage);
				boolean ans=dao.insertStudent(st);
				if(ans) {
					System.out.println("Record inserted successfully");
				}
				else {
					System.out.println("Something is unusuall???");
				}
				
				break;
			case 2:
				System.out.println("Show All Students");
				dao.showAllStudent();
				break;
			case 3:
				System.out.println("Details with rollNo");
				System.out.println("Enter the regd.no gurujii!!");
				sc.nextLine();
				String roll=sc.next();
				dao.showStudentById(roll);
				break;
			case 4:
				System.out.println("Delete the Account");
				System.out.println("Enter the roll number to delete");
				String rollN=sc.next();
				boolean f=dao.delete(rollN);
				if(f) {
					System.out.println("record deleted Successfully...");
				}
				else {
					System.out.println("Something want wroooong!!!");
				}
				break;
			case 5:
				System.out.println("Update the Account");
			    System.out.println("\n 1. Update Name\n 2. Update ClgName");
			    System.out.print("Enter your choice: ");
			    int cho = sc.nextInt();
			    sc.nextLine(); // clear the newline

			    if (cho == 1 || cho == 2) {
			        System.out.print("Enter the roll number: ");
			        String ro = sc.nextLine();

			        if (cho == 1) {
			            System.out.print("Enter the new name: ");
			        } else {
			            System.out.print("Enter the new college name: ");
			        }

			        String updateValue = sc.nextLine();

			        boolean flag = dao.update(ro, updateValue, cho, null); // no need for Student object
			        if (flag) {
			            System.out.println("Record updated successfully.");
			        } else {
			            System.out.println("Something went wrong, Guruji...");
			        }
			    } else {
			        System.out.println("Invalid choice for update!");
			    }
			    break;
			case 6:
				System.out.println("Successfully moved out!!"+"\n Thanx for visiting Hope U will Back in no long time Guru");
				System.exit(0);
			
			default:
				System.out.println("Plz see the option number u entered");
			
			
			
			
			
			}
		}
	}
}

package com.masai;

import java.util.Scanner;

public class course {
	
	int coursrId;
	String courseName;
	int courseFees;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		course call= new course();
		
		 call.authenticate("Admin","1234");
		 call.authenticate("Admin","123");
		 
	}
	
	
	
	void authenticate(String username, String pswrd){
		
		if(username.equals("Admin") && pswrd.equals("1234")) {
			
			course cor= new course();
			
			Scanner scn= new Scanner(System.in);
			
			System.out.println("courseId");
			int Id= scn.nextInt();
			cor.coursrId= Id;
			
			System.out.println("courseName");
			String Name= scn.next();
			cor.courseName= Name;
			
			System.out.println("courseFees");
			int fees= scn.nextInt();
			cor.courseFees= fees;
			
			displayCourseDetails(Id,Name,fees);
		}
		else {
			System.out.println("Invalid Username or password");
		}
		
	}
	
	void displayCourseDetails(int id, String Name,int fees){
			
		System.out.println(id);
		System.out.println(Name);
		System.out.println(fees);
			
		}
	

}

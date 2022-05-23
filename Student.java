package com.masai;

import java.util.Scanner;

public class Student {
	
	private int rollNumber;
	private String studentName;
	private int marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
//	public Student() {
//		// TODO Auto-generated constructor stub
//		
//	}
	
	
	public void setroll(int roll) {
		
		this.rollNumber= roll;
		
	}
	
	public void setName(String name) {
			
			this.studentName= name;
			
	}
	public void setMarks(int mark) {
			
			this.marks= mark;
			
	}
	
	public int getroll() {
		return rollNumber;
	}
	public String getName() {
		return studentName;
	} 
	public int getmarks() {
		return marks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st= new Student();
		Scanner scn= new Scanner(System.in);
		System.out.println("rollNumber");
		int roll=scn.nextInt();
		st.setroll(roll);
		
		System.out.println("Name");
		String name= scn.next();
		st.setName(name);
		System.out.println("marks");
		int mark= scn.nextInt();
		st.setMarks(mark);
		

	}
	
	

}

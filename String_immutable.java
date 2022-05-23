package com.masai;

public class String_immutable {
	
	
	public static void main(String[] args) {
		
		System.out.println("String is immutable because of Security and Syncronizasion that other can not chance it");
		System.out.println("Difference: In String class once string is created it never can be changed but in String Builder we can change the string value when ever we need.");
	
		String str= "Anni";
		
		String str1=str.concat(" how r u? ");
		
		String str3= str1.toUpperCase();
		
		String str4= str3.toLowerCase();
		String str5= str4.trim();
		
		
		System.out.println(str1);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
	
	}
	
	
}

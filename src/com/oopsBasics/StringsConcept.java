package com.oopsBasics;

public class StringsConcept {
	public static void main(String[] args) {
		String language = "Java";
		String language1 = "Java";
		String language2;
		
		language2 = language1.concat(language1); // To combine two Strings
		System.out.println("Language1 : " + language1);
		System.out.println("Language2 : " + language2);
		
		
		if (language.equals(language1)) { // It will only compare Outer part of Strings
			System.out.println("Both Are Similar");
		}
		else {
			System.out.println("Both Are Different");
		}
		
		
		if (language == language1) { // It will Compare Reference of the String
			System.out.println("Both Are Similar");
		}
		else {
			System.out.println("Both Are Different");
		}
		
		
		System.out.println("Comparing Strings ==== " + language.compareTo(language1));
		System.out.println("Comparing Strings ==== " + language.compareTo("html"));

	
	String s = new String("Python");
	String s1 = new String("Python");
	
	
	if (s.equals(s1)) { // It will only compare Outer part of Strings
		System.out.println("Both Are Similar");
	}
	else {
		System.out.println("Both Are Different");
	}
	
	
	if (s == s1) { // It will Compare Reference of the String
		System.out.println("Both Are Similar");
	}
	else {
		System.out.println("Both Are Different");
	}
	
	
	System.out.println("Comparing Strings ==== " + s.compareTo(s1));
	System.out.println("Comparing Strings ==== " + s.compareTo("PYTHON"));
 }
}

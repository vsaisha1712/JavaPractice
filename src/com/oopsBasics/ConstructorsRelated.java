package com.oopsBasics;

public class ConstructorsRelated {
	
	// Default Constructor
	public ConstructorsRelated() {
		System.out.println("This is an default constructor");
	}
	
	//Parameterized Constructor 
	public ConstructorsRelated(String Name,int RegNo) {
		System.out.println("Name : " + Name);
		System.out.println("RegNo : " + RegNo);
		}
	
	//Parameterized Constructor with overloading
	public ConstructorsRelated(String Name,int RegNo,String Subject) {
		System.out.println("Nanme : " + Name);
		System.out.println("RegNo : " + RegNo);
		System.out.println("Subject : " + Subject);
		}
	
	//Main Method
	public static void main(String args[]) {
		ConstructorsRelated c = new ConstructorsRelated();
		ConstructorsRelated c1 = new ConstructorsRelated("Saisha",12345);
		ConstructorsRelated c2 = new ConstructorsRelated("Saisha",12345,"Java");
	}
}

package com.oopsBasics;

public class ReturnTypes {
	public String name = "java";
	public int a=1,b = 2,c = 3, d;
	public boolean z = false; 
	
	// To return String type
	public String printString() {
		System.out.println("Name : " + name);
		return name;
	}
	
	// To return int type
	public int mulOfNum() {
		System.out.println("Mutiplication of a,b,c is : " + (a * b * c));
		return a * b * c;		
    }
	
	// To return boolean type 
	public boolean toCheck() {
		System.out.println(z);
		return z;
	}
	
	//Main method
    public static void main(String[] args) {
    	ReturnTypes returnTypes = new ReturnTypes();
    	returnTypes.printString();
    	returnTypes.mulOfNum();
    	returnTypes.toCheck();
    }
}

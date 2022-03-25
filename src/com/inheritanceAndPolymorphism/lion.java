package com.inheritanceAndPolymorphism;


// Child class
public class lion extends Animal { // Inheriting from parent class
	public static void main(String[] args) {
	lion l = new lion();
	l.walking(); // calling a method from parent class
	l.Roaring();
	System.out.println(l.a+ " " + l.b); // To call Objects from parent class
	
	
	// Overloading parameters
	l.printString("Good","Bad","This","Boy"); // Calling 4 parameter Overloaded method
	l.printString("Python","Java"); // Calling 2 parameter Overloaded method
	
	
	//Changing into different data types
	l.sub(10, 5); // int data type
	l.sub(8.2, 5.2); // double data type
	
	l.eating(); //Calling overridden method
}
	
	
	// Overriding the method of parent class	
public void eating() { 
	System.out.println("I can eat");
	System.out.println("I only eat meat");
	}


// Over Loading
	// By overloading parameters
public void printString(String a,String b) {
	System.out.println("String1 : " + a);
	System.out.println("String2 : " + b);
}
public void printString(String a,String b,String c) {
	System.out.println("String1 : " + a);
	System.out.println("String2 : " + b);
	System.out.println("String3 : " + c);
}
public void printString(String a,String b,String c,String d) {
	System.out.println("String1 : " + a + " " + d);
	System.out.println("String2 : " + b + " " + d);
	System.out.println("String3 : " + c + " " + d);
}


   // Overloading by changing to different data types
public void sub(int a,int b) {
	System.out.println("Subtraction of a & b is : " + (a-b));
}
public void sub(double a,double b) {
	System.out.println("Subtraction of a & b is : " + (a-b));
}

}
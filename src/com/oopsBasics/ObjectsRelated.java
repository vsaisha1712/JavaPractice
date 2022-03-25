package com.oopsBasics;

public class ObjectsRelated {
	
	
		public void diffOfNumbers() { // To create a method
			int a = 10, b = 20 , c;
			c = b - a;
			System.out.println("The value of c = " + c);
	   }
		
		public void ifelse() {
			int age = 10,votingAge = 18;
			if (age >= votingAge ) {
				System.out.println("Eligible to vote");
			}
			else {
				System.out.println("Not Eligible to vote");
			}
		}
		
		public static void printStatements() {
			System.out.println("Printing a statement without object Reference");
		}
		
public static void main(String args[]) {
	System.out.println("Learning java"); // To print a statement
	printStatements();
	ObjectsRelated o = new ObjectsRelated();//Create an object
	ObjectsRelated o1 = new ObjectsRelated();//creating Another Object
	o.diffOfNumbers();// Calling a method with object reference
	o1.ifelse();
	printStatements();//Calling a method without object reference
 }
}

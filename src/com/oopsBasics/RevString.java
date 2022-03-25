package com.oopsBasics;

public class RevString {
	public static void main(String[] args) {
		RevString revString = new RevString();
		
		String language = "Java";
		char[] chr = language.toCharArray();
		String rev = "";
		
		int lengthOfStr = language.length();
		
		for (int i = lengthOfStr-1 ; i >= 0 ; i--) {
			rev = rev + chr[i];
			System.out.println("Reversed String : " + rev);
		}
	}
}

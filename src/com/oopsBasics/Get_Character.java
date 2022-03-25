package com.oopsBasics;

public class Get_Character {
	
	public static void main(String[] args) {
		String Name = "saisha";
		char chr[] = Name.toCharArray();
		char wanted_char = 'h';
		
		for(int i=0;i<chr.length;i++) {
			if (wanted_char == chr[i]) {
				System.out.println("Character is : " + chr[i]);
			}
			else {
				System.out.println("Character not found");
			}
		}
	}
}

package com.bridge.D2_assignments;



public class VowelConsonantSW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'v';
		
		switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(ch+" is a vowel");
				break;
			default:
				System.out.println(ch+" is a consonant");
		}

	}

}

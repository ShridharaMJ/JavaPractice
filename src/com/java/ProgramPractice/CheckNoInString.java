package com.java.ProgramPractice;

public class CheckNoInString {

	public static void checkNos(String str) {
		str=str.replaceAll("[^0-9]", "");
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		checkNos("This used kjdh 88789 hhsadjh89dy8db87Y89d8a");
	}
}

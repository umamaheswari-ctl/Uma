package com.uma.string;

public class IntegerorString {
	public static boolean isNumber(String s) {
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))== false) {
				System.out.println(Character.isDigit(s.charAt(i))== false);
				return false;
			}
			System.out.println(Character.isDigit(s.charAt(i)));
			return true;
		}
		return true;
	}
	public static void main(String[] args) {
		String str="Akshara";
		if(isNumber(str)) {
		System.out.println("Integer");	
		} else
			System.out.println("String");
	}

}

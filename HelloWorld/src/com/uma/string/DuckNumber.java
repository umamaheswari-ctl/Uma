package com.uma.string;

public class DuckNumber {
	public static boolean duckNumber1(String num){
		int n=num.length();
		int i = 0;
		 while (i < n && num.charAt(i) == '0') 
	            i++; 
		 while (i < n) {
			if(num.charAt(i)=='0') 
				return true;
			i++;
		 }
		return false;
	}
	public static void main(String[] args) {
		String num="0012003";
		if(duckNumber1(num)) {
			System.out.println("Yes");
		}else
			System.out.println("No");
	}

}

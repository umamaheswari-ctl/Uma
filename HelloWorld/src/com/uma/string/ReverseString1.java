package com.uma.string;

public class ReverseString1 {
	public static void main(String[] args) {
		String input= "Umamaheswari Subramaniam";
		StringBuilder sb=new StringBuilder();
		sb.append(input);
		sb=sb.reverse();
		System.out.println(sb);
	}

}

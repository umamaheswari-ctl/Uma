package com.uma.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringReduction {
	static ArrayList<Integer> count=new ArrayList<>();
	
static void stringReduction(String s) {
	ArrayList<String> list=new ArrayList<>();
//	Integer middle= s.length()/2;
	
	final int mid = s.length() / 2; //get the middle of the String
	String[] parts = {s.substring(0, mid),s.substring(mid)};
	System.out.println(parts[0]); //first part
	System.out.println(parts[1]); //second part
	String left=s.substring(0, mid);
	String right=s.substring(mid);
	String s1= right.concat(left);
	StringBuilder sb= new StringBuilder(s1);
//	System.out.println("sb ** " + sb);
	if(sb.length()>=3) {
	char ch=sb.charAt(mid);
	char ch1=sb.charAt(mid+1);
	char ch2=sb.charAt(mid-1);
	System.out.println(ch+ "&&"+ch1+"&&" +ch2);
	if(ch==ch1 && ch==ch2) {
		sb=sb.deleteCharAt(mid);
		sb=sb.deleteCharAt(mid+1);
		sb=sb.deleteCharAt(mid-1);
		System.out.println("sb $$ " + sb);
		stringReduction(sb.toString());
	} else if(ch==ch2) {
		System.out.println("sb ** " + sb);
		StringBuilder sb1=sb.deleteCharAt(mid);
		sb1=sb.deleteCharAt(mid-1);
		System.out.println("sb1 ** " + sb1);
		stringReduction(sb1.toString());
	} else if(ch==ch1) {
		System.out.println("sb ** " + sb);
		StringBuilder sb1=sb.deleteCharAt(mid);
		sb1=sb.deleteCharAt(mid+1);
		System.out.println("sb1 ** " + sb1);
		stringReduction(sb1.toString());
	}
//	stringReduction(sb.toString());
	}else if(sb.length()==2) {
		char ch=sb.charAt(mid);	
		char ch2=sb.charAt(mid-1);
		if(ch==ch2) {
			System.out.println("sb ** " + sb);
			StringBuilder sb1=sb.deleteCharAt(mid);
			sb1=sb.deleteCharAt(mid-1);
			System.out.println("sb1 ** " + sb1);
			stringReduction(sb1.toString());
		} 
	}
	count.add(s.length());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
stringReduction(s.nextLine());
Collections.sort(count);
System.out.println(count.get(0));
	}

}

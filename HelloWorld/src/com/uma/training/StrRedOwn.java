package com.uma.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class StrRedOwn {
	static HashMap<String, String> hs=new HashMap<String,String>();
	static List<Integer> length=new ArrayList<Integer>();
static {
	hs.put("ab", "c");
	hs.put("ba", "c");
	hs.put("ac", "b");
	hs.put("ca", "b");
	hs.put("bc", "a");
	hs.put("cb", "a");
}
public static void stringReduction(String s){
	List<String> list=new ArrayList<>();
	for(int i=0; i<s.length()-1;i++) {
		list.add(s.charAt(i)+""+s.charAt(i+1));
	}
	for(String listItem:list) {
		if(hs.containsKey(listItem)) {
			stringReduction(s.replace(listItem, hs.get(listItem)));
		}
	}
	length.add(s.length());
}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	stringReduction(s.nextLine());
	Collections.sort(length);
	System.out.println(length.get(0));
}
}

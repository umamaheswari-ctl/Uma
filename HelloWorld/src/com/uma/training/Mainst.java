package com.uma.training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Mainst implements Runnable {

	static HashMap<String, String> map = new HashMap<String, String>();
	static List<Integer> length = new ArrayList<Integer>();
	static {
		map.put("ab", "c");
		map.put("ba", "c");
		map.put("ac", "b");
		map.put("ca", "b");
		map.put("bc", "a");
		map.put("cb", "a");
	}

	public static void StringReduction(String str) {
		// code goes here
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < str.length() - 1; i++) {
			list.add(str.charAt(i) + "" + str.charAt(i + 1));
		}

		for (String listItem : list) {
			if (map.containsKey(listItem)) {
				StringReduction(str.replace(listItem, map.get(listItem)));
			}
		}
		length.add(str.length());
	}

	public static void main(String[] args) {
		// keep this function call here
		
		Scanner s = new Scanner(System.in);
//		StringReduction(s.nextLine());
//		Collections.sort(length);
//		System.out.print(length.get(0));
		Mainst m = new Mainst();
		Thread t = new Thread(m);
		t.start();
	}

	@Override
	public void run() {
		System.out.println("Test");
		
	}

}
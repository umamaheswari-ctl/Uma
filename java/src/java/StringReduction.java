package java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class StringReduction {
	static HashMap<String, String> map = new HashMap<String, String>();
	static List<Integer> len = new ArrayList<Integer>();
	static {
		map.put("ab", "c");
		map.put("ba", "c");
		map.put("ac", "b");
		map.put("ca", "b");
		map.put("bc", "a");
		map.put("cb", "a");

		Collections.sort(len);
		System.out.println(len.get(0));
	}

	public static void main(String args[]) throws Exception {

		reduce("abcabc");

	}

	static void reduce(String s) {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < s.length() - 1; i++) {
			list.add(s.charAt(i) + "" + s.charAt(i + 1));
		}
		// int count = 0;
		for (Object comb : list) {
			if (map.containsKey((String) comb)) {

				reduce(s.replace((String) comb, map.get((String) comb)));
			}
		}
		len.add(s.length());
	}

} 	 	
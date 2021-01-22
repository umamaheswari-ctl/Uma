package com.uma.string;

public class CharSame {
	public static boolean allCharactersSame(String s){
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=s.charAt(0)) {
				return false;
			}
//			return true;
		}
		return true;
	}
	public static void main(String[] args) {
		String s="aasaa";
		if(allCharactersSame(s)) {
			System.out.println("All char Same");
		} else
			System.out.println("All char not same");
	}

}

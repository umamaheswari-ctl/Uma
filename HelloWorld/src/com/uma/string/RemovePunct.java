package com.uma.string;

public class RemovePunct {
	public static void main(String[] args) {
		String str="Welcome???@@##$$to&&**the**(%@$$!!@#World&*#%$^%@#baby";
		str=str.replaceAll("\\p{Punct}", "");
		System.out.println(str);
	}

}

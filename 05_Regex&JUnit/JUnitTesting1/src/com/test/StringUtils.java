package com.test;

public class StringUtils {

	public String reverse(String s) {
		String reversedString="";
		for(int i=s.length()-1;i>=0;i--) {
			reversedString+=s.charAt(i);
		}
		return reversedString;
	}
	public boolean isPalindrome(String s) {
		return s.equals(reverse(s));
	}
	public String toUppercase(String s) {
		return s.toUpperCase();
	}

}

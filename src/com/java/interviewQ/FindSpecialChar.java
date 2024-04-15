package com.java.interviewQ;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindSpecialChar {

	public static void main(String[] args) {

		String str = "This is the@ Spceail Char%";
		Pattern pat = Pattern.compile(str);
		Matcher mt = pat.matcher(str);
		boolean b = mt.find();
		if (b) {
			System.out.println(str + ":special char");
		} else {
			System.out.println(str + ":dont have special char");
		}
	}
}

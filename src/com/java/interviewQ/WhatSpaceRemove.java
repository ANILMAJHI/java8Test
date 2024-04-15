package com.java.interviewQ;

public class WhatSpaceRemove {
	public static void main(String[] args) {
		String str = "this is the remove whatSpace";

		StringBuffer sb = new StringBuffer();

		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (!Character.isWhitespace(c)) {
				sb.append(c);
			}
			//System.out.println(sb);
		}
		System.out.println(sb);
	}

}

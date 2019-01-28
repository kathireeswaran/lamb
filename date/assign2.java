package com.cg.date;

import java.util.Scanner;

public class assign2 {
	public static String positive(String str) {

		String str1 = str + "z";
		String bin = "";
		for (int i = 1; i < str1.length(); i++) {
			if (str1.charAt(i - 1) < str1.charAt(i)) {
				bin = bin + str1.charAt(i - 1);
			}
		}
		return bin;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = scn.next();
		str = str.toLowerCase();
		String bin = assign2.positive(str);
		if (bin.equals(str)) {
			System.out.println("entered string is positive string");
		} else {
			System.out.println("entered string is negative string");
		}

	}
}

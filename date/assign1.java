package com.cg.date;

import java.util.Scanner;

public class assign1 {
	enum Option 
	{
		CONCAT, REPLACE, REMOVE, UPPERCASE
	}

	static Scanner scn = new Scanner(System.in);

	public void con() {
		System.out.println("enter the string to concat itself :");
		String name1 = scn.next();
		String conname = name1.concat(name1);
		System.out.println("concat value:   " + conname);
		System.out.println();
	}

	public String replace() {
		System.out.println("enter the string to replace");
		String name1 = scn.next();
		System.out.println("after replacing");
		String bin="";
		for (int i = 0; i < name1.length(); i++) {
			char ch = name1.charAt(i);
			if (i % 2 == 0)
				bin=bin+ch;
			else
				bin=bin+'#';
		}
		return bin;
	}

	public void remove() {
		System.out.println("enter the string remove ");
		String name1 = scn.next();
		String bin = "";
		for (int i = 0; i < name1.length(); i++) {
			char ch = name1.charAt(i);
			if (ch != ' ') {
				bin = bin + ch;
				name1 = name1.replace(ch, ' ');
			}
		}
		System.out.println("after removing duplicate:"+bin);
		
	}

	public void uppercase() {
		System.out.println("enter the string ");
		String name1 = scn.next();
		System.out.println("after changing");
		for (int i = 0; i < name1.length(); i++) {
			char ch = name1.charAt(i);
			if (i % 2 == 0) {
				char temp = (char) (ch - 32);
				System.out.print(temp);
			} else
				System.out.print(ch);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		assign1 obj = new assign1();
		System.out.println("Enter ur choice(concat,replace,remove,uppercase) :");
		String ref1 = scn.next();
		ref1=ref1.toUpperCase();
		Option ref = Option.valueOf(ref1);
		switch (ref) {
		case CONCAT:
			obj.con();
			break;
		case REPLACE:
			String str=obj.replace();
			System.out.println(str);
			break;
		case REMOVE:
			obj.remove();
			break;
		case UPPERCASE:
			obj.uppercase();
			break;
		default:
			System.out.println("ur choice is wrng");
			break;
		}
	}

}

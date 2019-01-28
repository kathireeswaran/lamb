package com.cg.date;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Personclass {
	public static int period(String input)
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate enteredDate = LocalDate.parse(input,formatter);	
		//LocalDate start = LocalDate.of(enteredDate);
		LocalDate end = LocalDate.now();
		Period period = enteredDate.until(end);
		 int age=period.getYears();
		return age;
	}

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter date in dd/MM/yyyy format:");
		String input  = scanner.nextLine();
		int age=Personclass.period(input);
		System.out.println("enter the first name:");
		String fname  = scanner.nextLine();
		System.out.println("enter the first name:");
		String lname  = scanner.nextLine();
		String name=Personclass.getFullName(fname,lname); 
		System.out.println("name :"+name);
		System.out.println("age :"+age);
		
	}

	private static String getFullName(String fname, String lname) {
		String str=fname+" "+lname;
		return str;
	}
}

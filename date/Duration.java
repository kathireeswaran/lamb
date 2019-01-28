//3.3: Create a method to accept date and print the duration in days, months and years with regards to current system date.

package com.cg.date;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Duration {

	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("enter the date in the dd/mm/yyyy format");
		String text = sc.next();
		LocalDate startdate = LocalDate.parse(text, formatter);
		LocalDate endDate = LocalDate.now();
		Period period = startdate.until(endDate);
		System.out.println("Days : "+ period.get(ChronoUnit.DAYS));
		System.out.println("Months : "+ period.get(ChronoUnit.MONTHS));
		System.out.println("Years : "+ period.get(ChronoUnit.YEARS));

	}

}

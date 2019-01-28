//3.4: Revise exercise 3.3 to accept two LocalDates and print the duration between dates in days, months and years.

package com.cg.date;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Duration_34 {

	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("enter the start date in the dd/mm/yyyy format");
		String stDate = sc.next();
		LocalDate startdate = LocalDate.parse(stDate, formatter);
		System.out.println("enter the end date in the dd/mm/yyyy format");
		String enDate = sc.next();
		LocalDate enddate = LocalDate.parse(enDate, formatter);
		Period period = startdate.until(enddate);
		System.out.println("Days : "+ period.getDays());
		System.out.println("Months : "+ period.getMonths());
		System.out.println("Years : "+ period.getYears());

	}

}

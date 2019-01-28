//3.5: Create a method to accept product purchase date and warrantee period (in terms of months and years). Print the date on which warrantee of product expires.

package com.cg.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WarranteeExpirationDate {

	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("enter the purchase  date in the dd/mm/yyyy format");
		String startDate = sc.next();
		LocalDate startdate = LocalDate.parse(startDate, formatter);
		System.out.println("enter the Warranty month and year mm/yy format");
		String endDate = sc.next();
		int year=0, month=0;
		for(int i=0;i<endDate.length();i++)
		{
			if(endDate.charAt(i)=='/')
			{
				year = Integer.parseInt(endDate.substring(i+1,endDate.length()));
				month = Integer.parseInt(endDate.substring(0,i));
			}
		}
	
		int y = startdate.getYear();
		int m = startdate.getMonthValue();
		int d= startdate.getDayOfMonth();
		y=y+year;
		m=m+month;
		if(m>12)
		{
			m = m-12;
			y= y+1;
			
		}
		
		System.out.println("Expiry Date is : - " + d + "/" + m + "/" + y);
		
		

}

}
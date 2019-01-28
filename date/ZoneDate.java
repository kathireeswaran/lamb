//3.6: Create a method which accept zone id and print the current date and time with respect to given zone. 
//(Hint: Few zones to test your code. America/New_York, Europe/London, Asia/Tokyo, US/Pacific, Africa/Cairo, Australia/Sydney etc.)
package com.cg.date;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class ZoneDate {
	
	public void zoneDateCalc(String zone)
	{
		ZonedDateTime time = ZonedDateTime.now(ZoneId.of(zone));
		System.out.println(zone+":-"  + time);
	}

	public static void main(String[] args) 
	{
		
			Scanner sc = new Scanner(System.in);
			String s = null;
			ZoneDate zd = new ZoneDate();
			String ans = null;

			do {
				
				System.out.println("1. America/New_York");
				System.out.println("2. Europe/London");
				System.out.println("3. Asia/Tokyo");
				System.out.println("4. US/Pacific");
				System.out.println("5. Africa/Cairo");
				System.out.println("6. Australia/Sydney");
				System.out.println("7. Exit.");
				System.out.println("**ENTER YOUR CHOICE**");

				int choice = sc.nextInt();

				switch (choice) {
				
				case 1:	zd.zoneDateCalc("America/New_York");
						break;
				
				case 2: zd.zoneDateCalc("Europe/London");
						break;
			
				case 3:zd.zoneDateCalc("Asia/Tokyo");
						break;
				
				
				case 4: zd.zoneDateCalc("US/Pacific");
						break;
						
				case 5: zd.zoneDateCalc("Africa/Cairo");
						break;
				
				case 6: zd.zoneDateCalc("Australia/Sydney");
						break;
				
				case 7: System.out.println("exit.!");
						System.exit(0);
				
				default:System.out.println("Invalid choice. Please enter the valid choice.");
						break;

				}
				System.out.println("Do you want to continue yes/no");
				ans = sc.next();

			} while (ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("y"));

		}

	}



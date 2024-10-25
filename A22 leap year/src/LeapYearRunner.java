//(c) A+ Computer Science
//www.apluscompsci.com

//Name -richmond
//Date -10/25/2024
//Lab  -leap year runner 

import static java.lang.System.*; 
import java.util.Scanner;

public class LeapYearRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		out.println("Enter a year: ");
		int year = keyboard.nextInt();
		LeapYear ref = new LeapYear();
		if (ref.isLeapYear(year) == true) {
			System.out.println(year + " is a leap year");
		}
		else { 
			System.out.println(year + " is NOT a leap year");
		}
	}
}
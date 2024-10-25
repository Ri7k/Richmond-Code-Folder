//(c) A+ Computer Science
//www.apluscompsci.com

//Name -Richmond 
//Date - 10/25/2024
//Lab  -leap year calc

import static java.lang.System.*; 
import java.util.Scanner;

public class LeapYear
{
	public boolean isLeapYear( int year )
	{
	if (year % 4 == 0 && year % 400 == 0) {
		return true;
	}	
	else if (year % 100 != 0) {
		return false;
	}
		return false;
	}
}


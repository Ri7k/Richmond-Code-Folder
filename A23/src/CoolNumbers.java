//(c) A+ Computer Science
//www.apluscompsci.com
//Name Richmond Meana

import static java.lang.System.*;

public class CoolNumbers 
{
	/*
	 *method isCoolNumber will return true if
	 *	num % 3-6 all have a remainder of 1
	 *it will return false otherwize
	 */
	public static boolean isCoolNumber( int x )
	{
		if (x % 3 == 1  && x % 4 == 1 && x % 5 == 1 && x % 6 == 1 ) {
			return true; 
		}
		
		 return false;
	}
	
	/*
	 *method countCoolNumbers will return the count
	 *of the coolNumbers between 6 and stop
	 */
	public static int countCoolNumbers( int stop )
	{
		int count = 0;
		for (int x = 6; x <= stop; x++)
		{
			if( isCoolNumber(x) ) {
				count++;
			}
		}
		return count;
	}
}
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Richmond Meana	
//Date - 10/22/2024
//Class - Mr Fox
//Lab  - Mi/h runner 

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		MilesPerHour test = new MilesPerHour(dist, hrs, mins);
		test.calcMPH();
		test.print();
		keyboard.close();
		//add more test cases
		
		
	}
}
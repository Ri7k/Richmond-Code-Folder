//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Richmond Meana
//Date - 10/22/2024
//Class - Mr Fox
//Lab  - Miles/h calculator

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour() {
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		distance = dist; 
		hours = hrs;
		minutes = mins;   
		System.out.println(distance);
		System.out.println(hours);
		System.out.println(minutes);
	}

	public void setNums(int dist, int hrs, int mins) {
	}

	public void calcMPH() {
		mph = Math.round(distance / (hours + (minutes/60.0)));
	}

	public void print()
	{
		System.out.printf(distance + " miles in " + hours + " hours " + "and " + minutes + " minutes = " + mph);
	}
}
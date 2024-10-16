//(c) A+ Computer Science
// www.apluscompsci.com

//Name - Richmond Meana	
//Date - 10/15/2024
//Class - Mr Fox
//Lab  - Area of a triangle 

import java.util.Scanner; 
import java.lang.Math.*;

public class Triangle
{
	private int sideA, sideB, sideC;
	private double perimeter;
	private double theArea;

	public Triangle()
	{
	   setSides(0,0,0);
	   perimeter=0;
	   theArea=0;
	}

	public Triangle(int a, int b, int c)
	{
		sideA = a;
		sideB = b;
		sideC = c; 
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}


	public void setSides(int a, int b, int c)
	{
		sideA = a;
		sideB = b;
		sideC = c;
	}

	public void calcPerimeter( )
	{
		perimeter = (( sideA + sideB + sideC)); 
		System.out.println("The perimeter is: " + perimeter);
	}

	public void calcArea( )
	{
		double s = (perimeter / 2);
		theArea = Math.sqrt(s*(s - sideA)*(s - sideB)*(s - sideC)); 
	}

	public void print( )
	{
	
		System.out.printf("The area of your triangle is: " + "%.2f", theArea);
		System.out.println();
	}
}
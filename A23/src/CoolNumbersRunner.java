//(c) A+ Computer Science
//www.apluscompsci.com
//Name Richmond Meana

import static java.lang.System.*;
import java.util.Scanner; 
public class CoolNumbersRunner
{
	public static void main( String[] args ){
	Scanner look = new Scanner(System.in); 
	System.out.println("Enter a number: ");
	int value = look.nextInt(); 
		System.out.println( CoolNumbers.countCoolNumbers(value) + " cool numbers between 6 - " + value);
		//add more test cases
}
}
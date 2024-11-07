//(c) A+ Computer Science
//www.apluscompsci.com
//Name Richmond Meana

import static java.lang.System.*;
import java.util.Scanner;
public class LoopStatsRunner
{
	public static void main ( String[] args )
	{
		LoopStats test = new LoopStats(); 
		Scanner call = new Scanner(System.in);
		System.out.println("Enter starting number: ");
		int beg = call.nextInt();
		System.out.println("Enter last number: ");
		int stop = call.nextInt();
		test.setNums(beg, stop);
		test.ans();
	}
}
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Richmond Meana
//Date - October 4, 2024
//Mr Fox
import java.util.Scanner; 
public class SumRunner
{
	public static void main( String[] args )
	{
		Scanner keys = new Scanner(System.in); 
		int num, num2;
		System.out.println("Enter a number");
		num = keys.nextInt(); 
		System.out.println("Enter a second number");
		num2 = keys.nextInt(); 
		Sum test = new Sum();				
		test.setNums(num, num2);
		test.sum( );
		test.print();
		keys.close();
	}
}
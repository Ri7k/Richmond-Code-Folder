/*Richmond Meana
 * Mr Fox
 * October 4, 2024
 * adding
*/ 
public class Sum
{
	private double one, two;
	private int answer; 

	public void setNums(double num1, double num2)
	{	one = num1;
		two = num2;
	}
	public void sum()
	{ answer = (int) (one + two) ;
	}
	public void print( )
	{System.out.println(answer);
	}
}

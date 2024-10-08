/*Richmond Meana 
Mr. Fox
10/8/2024
Celcius to fahrenheit
*/
public class Fahrenheit {
	private double one;
	private double answer;

	public void setNums(double num1) {	
		one = num1;
	}
	public void sum() { 
		answer = ((one * (9.0/5)) + 32) ;
	}
	public void print( ) {
		System.out.println(answer);
	}
}

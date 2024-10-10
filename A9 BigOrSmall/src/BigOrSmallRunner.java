// // Richmond Meana
// // Mr. Fox
// // October 2, 2024
// // Big or Small runner

//import static java.lang.System.*; 
//import java.util.Scanner;

public class BigOrSmallRunner
{
	public static void main( String args[] ){
		BigOrSmall test = new BigOrSmall();

		test.check( 10, 20);		
		test.check( 20, 10);	
		test.check( 20, 20);
		test.check( 10, 10);	
		test.check( 0, 1);	
		test.check( 1, 0 );	
		test.check( 3, 5);	
		test.check( 5, 3 );	
		test.check( 5342, 323 );						
	}
}
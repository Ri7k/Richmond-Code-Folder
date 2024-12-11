//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Richmond Meana 

import java.util.Arrays;
import java.lang.Math;

public class ArrayFunHouseStarterCode
{
	public static void main( String args[] )
	{
	// ARRAY NUMBER 1 ----------------------------------------
		int[] one = {7,4,10,0,1,7,6,5,3,2,9,7};

		// Print the array for the user to view
		System.out.println(Arrays.toString(one));

		// Sum the values of positions listed (e.g. array[3] to array[6])
		System.out.println("sum of spots 3-6  =  " + getSum(one,3,6));
		System.out.println("sum of spots 2-9  =  " + getSum(one,2,9));

		// Count the number of occurances of the number in the array
		System.out.println("# of 4s  =  " + getCount(one,4));
		System.out.println("# of 9s  =  " + getCount(one,9));
		System.out.println("# of 7s  =  " + getCount(one,7));



	// ARRAY NUMBER TWO ----------------------------------------
		int[] two = {7,4,2,7,3,4,6,7,8,9,7,0,10,7,0,1,7,6,5,7,3,2,7,9,9,8,7};
		
		System.out.println(Arrays.toString(two));

		System.out.println("sum of spots 3-16  =  " + getSum(two,3,16));
		System.out.println("sum of spots 2-9  =  " + getSum(two,2,9));

		System.out.println("# of 0s  =  " + getCount(two,0));
		System.out.println("# of 3s  =  " + getCount(two,3));
		System.out.println("# of 7s  =  " + getCount(two,7));

	}

// METHODS/FUNCTIONS INSTEAD OF A SECOND FILE ----------------------------------------
	//instance variables and constructors could be used, but are not really needed


	//getSum() will return the sum of the numbers from start to stop, not including stop
	public static int getSum(int[] numArray, int start, int stop)
	{	
		int total = 0;
		for(int r = start; r <= stop; r++){
			total = numArray[r] + total;
		}
		return total;
	}


	//getCount() will return number of times val is present
	public static int getCount(int[] numArray, int val)
	{
		int count = 0;
		for (int r = 0; r < numArray.length; r++) {
			if (numArray[r] == val) {
				count++;
			}
		}
		return count;
	}

	//Remove val will replace the instance of particular numbers.
	//Returns an entire array
	public static int[] removeVal(int[] numArray, int val)
	{
		return null;
	}
}
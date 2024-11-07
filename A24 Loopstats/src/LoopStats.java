//(c) A+ Computer Science
//www.apluscompsci.com
//Name Richmond Meana

import static java.lang.System.*;

public class LoopStats
{
	private int start, stop;


	public void setNums(int beg, int end)
	{
		start = beg;
		stop = end; 

	}

	public int getEvenCount()
	{
		int evenCount=0;
		for (int x = start; x <= stop; x++){
			if (x % 2 == 0){
				evenCount++; 
			}
		}

		return evenCount;
	}

	public int getOddCount()
	{
		int oddCount=0;
		for (int x = start; x <= stop; x++){
			if (x % 2 == 1){
				oddCount++; 
		}
		}


		return oddCount;
	}

	public int getTotal()
	{
		int total=0;
		for (int x = start; x <= stop; x++){		
				total = total + x;  
		}	
		return total;
	}

	public void ans()
	{
		System.out.println(start + " "+ stop);
		System.out.println("Even count: " + getEvenCount());
		System.out.println("Odd count: " + getOddCount());
		System.out.println("Total count: " + getTotal());
	}
}
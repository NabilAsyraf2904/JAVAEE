package Day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.lang.Math;

//---------------------------------------Before link with next method ---------------------------------------------\\
//++++++++++++++++++++++++++++++++End method without link from other method++++++++++++++++++++++++++++++++++++++++\\

public class MultipleEvenOdd {
		
		static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args)
	{
		getMultipleOfEvensAndOdd();

	}

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\
	
	public static void getMultipleOfEvensAndOdd()
	{
		List<Integer> nums1 = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		int sumEven = 0;
		int sumOdd = 0;
		for (int i = 0; i < nums1.size(); i++) 
		{
			int number = Math.abs(nums1.get(i));
			
			if (number % 2 == 0) 
			{
				sumEven += getSumOfEvenDigits(number);
				
			} else 
			{
				sumOdd += getSumOfOddDigits(number);
				
			}
			
		}
			System.out.println("Even sum:" + sumEven + " ");
			System.out.println("Odd sum:" + sumOdd + " ");
			System.out.println(sumEven*sumOdd);
		
	}

//--------------------------------------------------------------------------------------------------------------\\	
	
	public static int getSumOfEvenDigits(int number)
	{
		int Even = 0;
		Even += number;
		return Even;
	}

//--------------------------------------------------------------------------------------------------------------\\
	
	public static int getSumOfOddDigits(int number)
	{
		int Odd = 0;
		Odd += number;
		return Odd;
		
	}
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\
}
				//	1 2 3 4 -5
				//	Even sum:6 
				//	Odd sum:9 
				//	54


package Day7;

import java.util.Scanner;

//---------------------------------------Before link with next method ---------------------------------------------//
//++++++++++++++++++++++++++++++++End method without link from other method++++++++++++++++++++++++++++++++++++++++//

public class Method {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
		//printSign(Integer.parseInt(sc.nextLine()));
		System.out.print(  "Triangle : ");
		int n = sc.nextInt();
		printTriangle(n);

	}

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
	
	public static void printSign(int number)
	{
		if (number > 0)
		{
			System.out.printf("The number %d is positive.", number);
		} else if (number < 0)
		{
			System.out.printf("The number %d is negative", number);
		} else
		{
			System.out.printf("The number %d is zero", number);
		}
		
	}
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
	
	public static void printLine(int start, int end)
	{
		
		for (int i = start; i <= end; i++) 
		{
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
//--------------------------------------------------------------------------------------------------------------//
	
	public static void printTriangle(int n)
	{
		for (int line = 1; line <= n; line++)
		{
			printLine(1, line);
		}
		
		for (int line = n - 1; line >= 1; line--) 
		{
			printLine(1, line);
		}
	}
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//

}

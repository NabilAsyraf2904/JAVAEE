package Day7;

import java.util.Scanner;

//---------------------------------------Before link with next method ---------------------------------------------\\
//++++++++++++++++++++++++++++++++End method without link from other method++++++++++++++++++++++++++++++++++++++++\\

public class Method {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
				printSign(Integer.parseInt(sc.nextLine()));
				System.out.print(  "Triangle : ");
				int n = sc.nextInt();
				printTriangle(n);
				Double width = Double.parseDouble(sc.nextLine());
				Double height = Double.parseDouble(sc.nextLine());
				Double area = calculateRectangleArea(width, height);
				System.out.printf("The area of the rectangle : %.0f%n", area);
				mathPower(3, 2);
		
		
	}

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\
	
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
		
		//		3
		//		The number 3 is positive.
	}
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\
	
	public static void printLine(int start, int end)
	{
		
		for (int i = start; i <= end; i++) 
		{
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
//--------------------------------------------------------------------------------------------------------------\\
	
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
		
		//		Triangle : 12
		//		1 
		//		1 2 
		//		1 2 3 
		//		1 2 3 4 
		//		1 2 3 4 5 
		//		1 2 3 4 5 6 
		//		1 2 3 4 5 6 7 
		//		1 2 3 4 5 6 7 8 
		//		1 2 3 4 5 6 7 8 9 
		//		1 2 3 4 5 6 7 8 9 10 
		//		1 2 3 4 5 6 7 8 9 10 11 
		//		1 2 3 4 5 6 7 8 9 10 11 12 
		//		1 2 3 4 5 6 7 8 9 10 11 
		//		1 2 3 4 5 6 7 8 9 10 
		//		1 2 3 4 5 6 7 8 9 
		//		1 2 3 4 5 6 7 8 
		//		1 2 3 4 5 6 7 
		//		1 2 3 4 5 6 
		//		1 2 3 4 5 
		//		1 2 3 4 
		//		1 2 3 
		//		1 2 
		//		1 
	}
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\

	public static double calculateRectangleArea(double width, double height)
	{
		return width * height;
		//		3
		//		5
		//		The area of the rectangle : 15
	}
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\
	
	public static double mathPower(double number, int power)
	{
		double result = 1;
		for (int i = 0; i < power; i++) 
		{
			result *= number;
		}
		System.out.println(result);
		return result;
		//		9.0
	}
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\
}

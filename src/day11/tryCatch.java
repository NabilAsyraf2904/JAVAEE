package day11;

import java.util.Scanner;

public class tryCatch 
{
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws FileParseException 
	{
		tryCatchNum();
		//		String[] range = sc.nextLine().split(" ");
		//		int start = Integer.parseInt(range[0]);
		//		int end = Integer.parseInt(range[1]);
		//		System.out.printf("Range: [%d...%d]\n", start, end);
		//		
		//		int num = readNumberInRange(sc, start, end);
		//		System.out.println("Valid number: " + num);
		
		//tryFinallyExample();
	}

//------------------------------------------------------------------------------------------\\
	
	public static void tryCatchNum() throws FileParseException
	{
		String s = sc.nextLine();
		
		try
		{
			Integer.parseInt(s);
			System.out.printf("You entered a valid integer number: %s", s);
			
		}  catch (Exception ex) 
		{
			throw new FileParseException("This is an error msg", 37);
			
		}	
			//		input  : s
			//		output: Invalid integer number!
			//		input  : 5
			//		output: You entered a valid integer number: 5

	}
	
//------------------------------------------------------------------------------------------\\
	
	private static int readNumberInRange(Scanner scanner, int start, int end)
	{
		while (true) 
		{
			String line = sc.nextLine();
			try
			{
				int num = Integer.parseInt(line);
				if (num >= start && num <= end) 
				{
					return num; // valid number (in range)
				}
				
			} catch (Exception ex) 
			{
				// parse failed --> invalid number
				
			}
			
			System.out.println("Invalid number: " + line);
		}
		
			//		input  : 10 30
			//		output: Range: [10...30]
		
			//		input  : 5
			//		output: Invalid number: 5
		
			//		input  : ss
			//		output: Invalid number: ss
		
			//		input  : 20
			//		output: Valid number: 20
	}
	
//------------------------------------------------------------------------------------------\\
	
	static void tryFinallyExample()
	{
		System.out.println("Code executed before try-finally.");
		
		try
		{
			String str = sc.nextLine();
			Integer.parseInt(str);
			System.out.println("Parsing was successful.");
			//return;
			
		} 
		catch (NumberFormatException ex) 
		{
			System.out.println("Parsing failed");
			
		}
		finally 
		{
			System.out.println("This cleanup code is always executed.");
			
		}
		
		System.out.println("This code is after the try-finally block");
		
			//		input  : as
			//		output: Parsing failed
			//				  This cleanup code is always executed.
			//				  This code is after the try-finally block
		
			//		input  : 23
			//		output: Parsing was successful.
			//				  This cleanup code is always executed.
	}
	
//------------------------------------------------------------------------------------------\\

}

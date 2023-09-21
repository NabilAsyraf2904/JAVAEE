package Day9;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class MathMax 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
//		randomizeWord();
		bigFactorial();

	}
	
//------------------------------------------------------------------------------------------\\	
	
	public static void randomizeWord()
	{
		String[] words = sc.nextLine().split(" ");
		
		Random rnd = new Random();
		
		for (int pos1 = 0; pos1 < words.length; pos1++) 
		{
			int pos2 = rnd.nextInt(words.length);
			String temp = words[pos2];
		        words[pos2] = words[pos1];
		        words[pos1] = temp;
		}
		
		System.out.println(String.join(System.lineSeparator(), words));
		
			//		input : PHP Java C#
			//		output: 1st attempt ->  PHP
			//								C#
			//								Java
			//		output: 2nd attempt ->  C#
			//								PHP
			//								Java
		
	}

//------------------------------------------------------------------------------------------\\	
	
	public static void bigFactorial()
	{
		System.out.print("Insert number of n: ");
		int n = Integer.parseInt(sc.nextLine());
		
		BigInteger f = new BigInteger(String.valueOf(1));
		
		for (int i = 1; i <= n; i++) 
		{
			f = f.multiply(BigInteger.valueOf(Integer.parseInt(String.valueOf(i))));
		}
		
		System.out.print(n + " factorial : " + f);
		
			//		input : 5
			//		output: 120
	}
	
//------------------------------------------------------------------------------------------\\
	
}

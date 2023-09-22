package Day10;

import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

public class javaAPIClasses {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		//randomPredictable();
		//rangeRandom();
		interestCalculator();

	}

//------------------------------------------------------------------------------------------\\
	
	public static void randomPredictable()
	{
		Random randGen = new Random(12345);
		System.out.println("Random[1...1000000]: " + (randGen.nextInt(1_000_000) + 1));
		
		Random randGen2 = new Random(12345);
		System.out.println("Random[1...1000000]: " + (randGen2.nextInt(1_000_000) + 1));
		
		
		//		Output:  Random[1...1000000]: 966252
		//					Random[1...1000000]: 966252
	}

//------------------------------------------------------------------------------------------\\
	
	public static void rangeRandom()
	{
		Random randGen = new Random();
		int start = sc.nextInt();
		int end = sc.nextInt();
		int randomNum = randGen.nextInt(end - start + 1) + start;
		
		System.out.println(randomNum);
		//String.format("|%6d", 99);
		System.out.println(String.format("|%6d|", randomNum));
	}
	
	public static void interestCalculator()
	{
		System.out.print("initialAmount: ");
		BigDecimal initialAmount = new BigDecimal(sc.next());
		System.out.print("interestRate: ");
		BigDecimal interestRate = new BigDecimal(sc.next());
		BigDecimal hundred = new BigDecimal(100);
		BigDecimal total = initialAmount.add(initialAmount.multiply(interestRate.divide(hundred)));
		
		System.out.println("-----------------------------");
		System.out.println("Total amount: " + total);
	}
	
}

package Day2;

import java.util.Scanner;

public class MeterKilo 
{
	public static void main(String[] args)
	{
		/*// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	
		int meters = Integer.parseInt(scanner.nextLine());
		double kilometers = meters / 1000.0;
		System.out.printf("%.2f", kilometers);*/
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter centuries : ");
		
		byte centuries = scanner.nextByte();
		short years = (short) (centuries * 100);
		int days = (int) (years * 365);
		long hours = (long)(days * 24);
		
		
		System.out.printf("%d centuries = %d years = %d days = %d hours.", centuries, years, days, hours);
		

	}


}
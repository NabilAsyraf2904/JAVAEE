package Day2;

import java.math.BigDecimal;
import java.util.Scanner;

public class Totaladdition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n : ");
		int a = Integer.parseInt(scanner.nextLine());
		BigDecimal sum = new BigDecimal(0);
		System.out.println("Enter " + a + " number :" );
		for (int i = 0; i < a; i++) {
			
			BigDecimal number = new BigDecimal(scanner.nextLine());
			sum = sum.add(number);
		}
		
		System.out.println("The total is " + sum);

	}

}

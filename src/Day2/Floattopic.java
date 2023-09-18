package Day2;

import java.util.Scanner;

public class Floattopic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float floatPI = 3.141592653589793238f;
		double doublePI = 3.141592653589793238;
		System.out.println("Float PI is : " + floatPI);
		System.out.println("Double PI is : " + doublePI);
		
		double d = 1000000000000000000000000000000000.0;
		System.out.println(d);
		double d2 = 20e-3;
		System.out.println(d2);
		double d3 = Double.MAX_VALUE;
		System.out.println(d3);
		
		Scanner scanner = new Scanner(System.in);
		
		double num = Double.parseDouble(scanner.nextLine());
		double result = num * 1.31;
		System.out.printf("%.3f", result);
		
		System.out.println();
		
		/*System.out.println(10 / 4);
		System.out.println(10 / 4.0);
		System.out.println(10 / 0.0);
		System.out.println(-10 / 0.0);
		System.out.println(0 / 0.0);
		System.out.println(8 % 2.5);
		System.out.println(10 / 0);
		*/
		double a = 1.0f;
		double b = 0.33f;
		double sum = 1.33d;
		System.out.printf("a+b=%f sum=%f equal=%b", a+b, sum, a + b == sum);
		
		double num1 = 0;
		for (int i = 0; i < 10000; i++) {
			num1 += 0.0001;
			
			
		}System.out.println(num1);
		
	}

}

package Day2;

import java.util.Scanner;

public class SpecialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This code to check the sum of two digit is equal 5, 7 or 11 thus the number is special \nEnter number : ");
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		//for (int num = 1; num <= n; num++) {
			int sumOfDigits = 0;
			//int digits = n;
			while (n > 0) {
				sumOfDigits += n % 10;
				n = n / 10;
			}
			if (sumOfDigits % 5 == 0 || sumOfDigits % 7 == 0 || sumOfDigits % 11 == 0)
			{
				System.out.println("is Special number");
			}else {
				System.out.println("is not Special");
			}
		//}

	}

}

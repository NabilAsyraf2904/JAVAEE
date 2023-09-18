package Day3;

import java.util.Scanner;

public class characterCode {

	public static void main(String[] args) {
		char ch = 'a';
		System.out.printf("The code of %c is: %d%n", ch, (int) ch);
		ch = 'b';
		System.out.printf("The code of '%c' is: %d%n", ch, (int) ch);
		ch = 'A';
		System.out.printf("The code of '%c' is: %d%n", ch, (int) ch);
		ch = '\u8449';
		System.out.printf("The code of '%c' is: %d%n", ch, (int) ch);
		
		char symbol = 'a';
		//symbol =  "a";
		
		/*Scanner sc = new Scanner(System.in);
		
		char firstChar = sc.nextLine().charAt(0);
		char secondChar = sc.nextLine().charAt(0);
		char thirdChar = sc.nextLine().charAt(0);
		
		System.out.printf("%c %c %c", thirdChar, secondChar, firstChar);
		*/
		
		String firstName = "Nabil";
		String secondName = "Asyraf";
		String fullName = String.format("%s %s", firstName, secondName );
		System.out.printf("Fullname is %s, my age is 21 %n", fullName);
		System.out.println("Fullname is " + fullName + ", my age is 21");
		System.out.println("Fullname is " + firstName + secondName + ", my age is 21");
		System.out.println(230857 % 10);
		System.out.println(658236489 % 10000);
		System.out.println(7342 % 100 / 10);
		System.out.println(123 % 2 ==0);
		
		//-------------------------------------------------------------------------------------//
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		if (n % 2 != 0) {
			System.out.println("The number is odd");
		}else {
			System.out.println("The number is even");
		}
		
		//-----------------------------------------------------------------------------------------//
		Scanner scV = new Scanner(System.in);
		int V = Integer.parseInt(scV.nextLine());
		if (V % 27 == 0) {
			System.out.println("The number is DIVISIBLE BY 27");
		}else {
			System.out.println("The number is NOT DIVISIBLE BY 27");
		}
		
		
	}

}

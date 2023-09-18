package Day4;

import java.util.Scanner;

public class MarketPlace {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String product = sc.nextLine();
		String dayofWeek = sc.nextLine();
		
		if (product.equals("Banana")) {
			if (dayofWeek.equals("Weekday")) {
				System.out.println("2.50");
			}else {
				System.out.println("2.70");
			}
		}else if (product.equals("Apple")) {
			if (dayofWeek.equals("Weekday")) {
				System.out.println("1.30");
			}else {
				System.out.println("1.60");
			}
		}else if (product.equals("kiwi")) {
			if (dayofWeek.equals("Weekday")) {
				System.out.println("2.20");
			} else {
				System.out.println("3.00");
			}
		}
	}

}

package Day4;

import java.util.Scanner;

public class BonusPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int points = sc.nextInt();
		if (points >= 0 && points <= 3) {
			points += 5;
		} else if (points >= 4 && points <= 6) {
			points += 15;
		} else if (points >= 7 && points <= 9) {
			points += 20;
		}System.out.println(points);
		
		
		int num = sc.nextInt();
		boolean isValid = (num >=100 && num <= 200) || num == 0;
		if (!isValid) {
			System.out.println("Invalid");
		} else {
			System.out.println("Valid");
		}
		
		String s = sc.next();
		if (s.equals("curry") || s.equals("noodles") || s.equals("sushi") || s.equals("spaghetti")) {
			System.out.println("food");
		}else if (s.equals("tea") || s.equals("water") || s.equals("coffee")) {
			System.out.println("drink");
		}else
			System.out.println("unknown");

	}

}

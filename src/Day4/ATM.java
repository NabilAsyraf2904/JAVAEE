package Day4;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double balance = Double.parseDouble(sc.nextLine());
		double withdraw = Double.parseDouble(sc.nextLine());
		double limit = Double.parseDouble(sc.nextLine());
		
		if (balance >= withdraw && withdraw <= limit) {
			System.out.println("The withdraw was succesful");
		}else if (withdraw > limit) {
			System.out.println("The limit was exceeded");
		}else 
			System.out.println("Insufficient availability.");

	}

}

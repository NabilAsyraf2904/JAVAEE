package Day4;

import java.util.Scanner;

public class SwitchState {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String animal = sc.nextLine();
		switch (animal) {
		case "dog":
		case "cat":
			System.out.println("mammal");
			break;
		default:
			System.out.println("unknown");
			break;
		}

	}

}

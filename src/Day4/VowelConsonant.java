package Day4;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char letter = sc.nextLine().charAt(0);
		if (letter == 'A' || letter == 'a' || letter == 'E' || letter == 'e' ||
				letter == 'I' || letter == 'i' || letter == 'O' || letter == 'o'
				|| letter == 'U' || letter == 'u') {
			System.out.println("Vowel");
		} else {
			System.out.println("Consonant");
		}
		
		switch (letter) {
		case 'A':
		case 'a':
		case 'E':
		case 'e':
		case 'I':
		case 'i':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
			System.out.println("Vowel");
			break;
		default :
			System.out.println("Consonant");
			
		}
	}

}

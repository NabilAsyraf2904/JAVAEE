package Day4;

//import java.util.Iterator;
import java.util.Scanner;

public class NumberEnd7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		/*int n = scanner.nextInt();
		for (int i = 7; i <= n ; i+= i) {
			System.out.println(i);
		}
		int days = scanner.nextInt();
		for (int i = days;  i >= 1; i-= 1) {
			System.out.printf("%d days before the exam %n", i);
		}
		System.out.println("The exam has come");
		*/
		/*char startLetter = scanner.nextLine().charAt(0);
		char lastLetter =  scanner.nextLine().charAt(0);
		for (char i = startLetter; i <= lastLetter; i++) {
			System.out.println(i +" ");
		}*/
		
		int n = scanner.nextInt();
		int maxNumber = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
			int number = scanner.nextInt();
			if (number > maxNumber)
			maxNumber = number;
			
		}System.out.println("The biggest number is : " + maxNumber);
		
			
		int b = Integer.parseInt(scanner.next());
		int vowelSum = 0;
		for (int i = 0; i < b; i++) {
			char ch = scanner.next().charAt(0);
			switch (ch) {
			case 'a':
				vowelSum += 1;
				break;
			case 'e':
				vowelSum += 2;
				break;
			case 'i':
				vowelSum += 3;
				break;
			case 'o':
				vowelSum += 4;
				break;
			case 'u':
				vowelSum += 5;
				break;
			}
		}System.out.println(vowelSum);
	}

}

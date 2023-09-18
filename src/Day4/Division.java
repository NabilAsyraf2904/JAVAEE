package Day4;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double c2 = 0.0, c3 = 0.0, c4 = 0.0;
		for (int i = 0; i < n; i++) {
			int num = scanner.nextInt();
			if (num % 2 == 0)
				c2++;
			if (num % 3 == 0)
				c3++;
			if (num % 4 == 0)
				c4++;
		}

	}

}

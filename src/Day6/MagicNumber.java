package Day6;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int d1 = 1; d1 <= 9; d1++) {
			for (int d2 = 0; d2 <=9; d2++) {
				for (int d3 = 0; d3 <= 9; d3++) {
					if (d1 * d2 * d3 == n) {
						System.out.print(" " + d1 + d2 + d3);
					}
				}
			}
		}

	}

}

package Day6;

import java.util.Iterator;
import java.util.Scanner;

public class LetterCombination {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char start = sc.nextLine().charAt(0);
		char end = sc.nextLine().charAt(0);
		char x = sc.nextLine().charAt(0);
		
		int counter = 0;
		for (char  l1 = start; l1 <= end; l1++) {
			for (char l2 = start; l2 <= end; l2++) {
				for (char l3 = start; l3 <= end; l3++) {
					if (l1 != x && l2 != x && l3 !=x) {
						System.out.print(l1+ " " + l2 + " " + l3 + "\n");
						counter++;
					}
				} 
			}
		}System.out.println(counter);
	}

}

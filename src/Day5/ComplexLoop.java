package Day5;

import java.util.Iterator;
import java.util.Scanner;

public class ComplexLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i = n; i >= 1; i--) 
		{
			if (i < n)
			{
				System.out.print(", ");
			}System.out.print(i);
		}
		System.out.println();
		
		int m = sc.nextInt();
		int num = 1;
		for (int i = 0; i <= m; i += 2) {
			if (i > 0) {
				System.out.print(", ");
			
			}
			System.out.print(num);
			num = num * 2 * 2;
		}
		System.out.println();
		
		// Nested loop----------------------------------------------------------
		
		int a = 3;
		for (int row = 1; row <= a; row++) {
			for (int col = 1; col <= a; col++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		// Triangle of star--for----------------------------------------------------
		int size = sc.nextInt();
		for (int row = 1; row <=size; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Triangle of star--while----------------------------------------------------
		int row = 1;
		while (row <= size) {
			int col = 0;
			while (col++ < row) {
				System.out.print("*");
			}
			System.out.println();
			row++;
		}
		
		// Building--for----------------------------------------------------
		
		int floors = sc.nextInt();
		int rooms = sc.nextInt();
		for (int f = floors; f >= 1; f--) {
			for (int r = 0; r < rooms; r++) {
				if (f == floors) {
					System.out.print("L" + f + r + " ");
				} else if (f % 2 == 0) {
					System.out.print("O" + f + r + " ");
				} else {
					System.out.print("A" + f + r + " ");
				}
			}
		System.out.println();
		}
		
		
	}

}

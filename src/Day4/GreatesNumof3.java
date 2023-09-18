package Day4;

import java.util.Scanner;

public class GreatesNumof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		
		if (first > second) {
			if (first > third) {
				System.out.println("Greatest is :" + first);
			}else {
				System.out.println("Greatest is :" + third);
			}
		}else {
			if (second > third) {
				System.out.println("Greatest is :" + second);
			}else {
				System.out.println("Greatest is :" + third);
			}
		}

	}

}

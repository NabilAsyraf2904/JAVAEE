package Day4;

import java.util.Scanner;

public class Cinema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String type = sc.nextLine();
		int rows = Integer.parseInt(sc.nextLine());
		int cols = Integer.parseInt(sc.nextLine());
		int seats = rows * cols;
		switch (type) {
		case "Premiere": {
			
			System.out.printf("%.2f\n", seats * 12.00);
			break;
			}
		case "Normal": {
			
			System.out.printf("%.2f\n", seats * 7.50);
			break;
			}
		case "Discount": {
	
			System.out.printf("%.2f\n", seats * 5.00);
			break;
			}
		}	
	}

}

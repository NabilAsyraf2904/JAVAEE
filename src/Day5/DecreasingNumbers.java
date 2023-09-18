package Day5;

import java.util.Scanner;

public class DecreasingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number : ");
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		while (number >= 1) {
			System.out.println(number);
			number--;
		}
		
		String command = sc.nextLine();
		while (!command.equals("End")) {
			switch (command) {
			case "Inc": {
				
				number++;
				break;
			}
			case "Dec":{
				
				number--;
				break;
			}
			}
			command = sc.nextLine();
		
			}System.out.println(number);
			
			
		int n = sc.nextInt();
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
			
		}System.out.println(sum);
		
		int stopNum = sc.nextInt();
		int previousNum = stopNum;
		while (true) {
			int num = sc.nextInt();
			if (num == stopNum) 
				break;
				previousNum = num;
			
			
		}System.out.println(previousNum * 1.2);
	}
	

}

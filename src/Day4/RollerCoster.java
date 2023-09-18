package Day4;

import java.util.Scanner;

public class RollerCoster {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("how many tempat kosong :");
		int places = scanner.nextInt();
		System.out.println("umur min :");
		int minAge = scanner.nextInt();
		System.out.println("berapa org beratur :");
		int queueSize = scanner.nextInt();
		int validPeopleCount = 0;
		
		if (queueSize == 0) {
			System.out.println("Waiting!");
		}else {
			System.out.println("Enter Age");
			for (int i = 0; i < queueSize; i++)
		{
			int personAge = scanner.nextInt();
			if (personAge >= minAge && places > validPeopleCount) {
				validPeopleCount++;
			}
		}
			if (validPeopleCount != queueSize) {
				//System.out.println("Waiting!");
				System.out.println("Other" + (validPeopleCount-(-queueSize)) + " will be waiting");
			}if (validPeopleCount == queueSize) {
				System.out.println("The rollercoaster departure");
			}if (validPeopleCount > queueSize) {
				System.out.println("The rollercoaster departure");
				System.out.println("Other" + (validPeopleCount-queueSize) + "will be waiting");
			}
		
		}

	}

}

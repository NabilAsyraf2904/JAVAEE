package Day6;

import java.util.Scanner;

public class TravelSaving {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String destination;
		while (!(destination = sc.nextLine()).equals("End")) {
			double neededSum = Double.parseDouble(sc.nextLine());
			double collectedSum = 0;
			while (collectedSum < neededSum) {
				collectedSum += Double.parseDouble(sc.nextLine());
				System.out.printf("Collected:%.2f\n", collectedSum);
			}
			System.out.printf("Going to %s!\n", destination);
		}

	}

}

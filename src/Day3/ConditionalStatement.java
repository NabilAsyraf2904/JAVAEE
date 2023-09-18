package Day3;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int humidity = Integer.parseInt(sc.nextLine());
		if(humidity > 90) {
			System.out.println("Rain -> skip watering");
		}else {
			System.out.println("No rain -> water the plants!");
		}
		
		String a = "Example";
		String b = "example";
		System.out.println(a.equals(b));
		System.out.println(a == b);
		
		String C = "Ample";
		String D = "#Ample".substring(1);
		System.out.println(C.equals(D));
		System.out.println(C == D);
		
		double temperature = sc.nextDouble();
		if (temperature <= 0) {
			System.out.println("Freezing weather!");
		}  else if (temperature > 100) {
			System.out.println("World on fire!");
		}else {
			System.out.println("World in peace~~..");
		}

	}

}

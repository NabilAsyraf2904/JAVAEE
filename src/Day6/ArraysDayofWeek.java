package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDayofWeek {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] days = {
				"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
		};
		
		int day = Integer.parseInt(sc.nextLine());
		if (day >= 1 && day <= 7) {
			System.out.println(days[day - 1]);
		}else {
			System.out.println("Invalid day!");
		}
//		
//		String values = sc.nextLine();
//		String[] items = values.split(" ");
//		int[] arr = new int[items.length];
//		
//		for (int i = 0; i < items.length; i++) {
//			arr[i] = Integer.parseInt(items[i]);
//			System.out.println("arr["+ i + "] = " + arr[i]);
//		}
		
		String inputLine = sc.nextLine();
		String[] items = inputLine.split(" ");
		int[] arr = Arrays.stream(items).mapToInt(e-> Integer.parseInt(e)).toArray();
				
				
		
		for (int i = 0; i < items.length; i++) {
			arr[i] = Integer.parseInt(items[i]);
			System.out.println("arr["+ i + "] = " + arr[i]);
		}
		
	}

}

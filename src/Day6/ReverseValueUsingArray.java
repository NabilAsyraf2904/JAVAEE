package Day6;

import java.util.Scanner;

public class ReverseValueUsingArray {

	public static void main(String[] args) 
	{
		
		
		reverseValue();
		stringJoin();
		
		

		
	}
	public static void reverseValue() {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		System.out.println("the elements from last to the first :");
		
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}System.out.println();
		}
	
//String.join-------------------------------------------
	public static void stringJoin() {
			String[] strings = {"one", "two"};
		System.out.println(String.join(" ", strings));
		
		int[] arrr = { 1, 2, 3};
		
		System.out.println(String.join(" ", strings));
		}
}

package Day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamAPI 
{

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//streamActivity();
		//wordFilter();
		largest3Numbers();
		
	}
	
//------------------------------------------------------------------------------------------\\
	
	public static void streamActivity()
	{
		int min = Arrays.stream(new int[] {15, 25, 35}).min().getAsInt();
		int less = Arrays.stream(new int[] {}).min().orElse(0);
		
		System.out.println("min : " + min);
		System.out.println("less : " + less);
		
		int sum = Arrays.stream(new int[] {15, 25, 35}).sum();
		
		System.out.println("sum : " + sum);
		
			//		output: min : 15
			//				less : 0
			//				sum : 75
		
//------------------------------------------------------------------------------------------\\
		ArrayList<Integer> nums = new ArrayList<>()
				
				{{
					add(15);
					add(25);
					add(35);
				}};
				
		int kecik = nums.stream().mapToInt(Integer :: intValue).min().getAsInt();
		System.out.println(kecik);
		//////////////////////////////////////////////////////////////////////////////////////
		int kocik = nums.stream().min(Integer :: compareTo).get();
		System.out.println(kocik);
		//////////////////////////////////////////////////////////////////////////////////////
		int max = nums.stream().mapToInt(Integer :: intValue).max().getAsInt();
		System.out.println(max);
		//////////////////////////////////////////////////////////////////////////////////////
		int jumlah = nums.stream().mapToInt(Integer :: intValue).sum();
		System.out.println(jumlah);
		//////////////////////////////////////////////////////////////////////////////////////
		double avg = nums.stream().mapToInt(Integer :: intValue).average().getAsDouble();
		System.out.println(avg);
		//////////////////////////////////////////////////////////////////////////////////////
		
			//		output: 15
			//				15
			//				35
			//				75
			//				25.0
		
//------------------------------------------------------------------------------------------\\
	
		String[] words = {"abc", "def", "geh", "yyy"};
		
		words = Arrays.stream(words).map(w -> w + "yyy").toArray(String[] :: new);
		
		for (String word: words) 
		{
			System.out.println(word);
		}
		
			//		output: abcyyy
			//				defyyy
			//				gehyyy
			//				yyyyyy
		
//------------------------------------------------------------------------------------------\\		
	}
	
	public static void wordFilter()
	{
		String[] words = Arrays.stream(sc.nextLine().split(" ")).filter(w -> w.length() % 2 == 0)
						.toArray(String[] :: new);
		
		for (String word : words) 
		{
			System.out.println(word);
		}
			//		input:  kiwi orange banana apple
			//		output: kiwi
			//				orange
			//				banana
	}
	
//------------------------------------------------------------------------------------------\\
	
	public static void largest3Numbers()
	{
		List<Integer> nums = Arrays.stream(sc.nextLine().split(" "))
							.map(e -> Integer.parseInt(e))
							.sorted((n1, n2) -> n2.compareTo(n1))
							.limit(4).collect(Collectors.toList());
		
		System.out.print("Largest 3 numbers: ");
		for (int num : nums) {
			System.out.print(num + " ");
		}
		
			//		input: 12 35 26 45 945 210 3548 45 8
			//		output: Largest 3 numbers: 3548 945 210 45 
	}

	
}

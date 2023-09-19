package Day6;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//---------------------------------------Before link with next method ---------------------------------------------//
//++++++++++++++++++++++++++++++++End method without link from other method++++++++++++++++++++++++++++++++++++++++//	

public class Lists {

	public static void main(String[] args)
	{
		
//		arrayList();
//		collectList();
//		listForLoop();
//		sumAdjacent();
//		gaussTrick();
//		mergingList();
		sortingList();

	}
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//	
	
	public static void arrayList()
	{
		List<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));
		
		nums.remove(2);
		nums.remove(Integer.valueOf(40));
		nums.add(100);
		nums.add(0, -100);
		
		for (int i = 0; i < nums.size(); i++) 
		{
			System.out.print(nums.get(i) + " ");
		}
//			-100 10 20 50 60 100 
	}
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//	
	
	public static void collectList()
	{
		Scanner sc = new Scanner(System.in);
		String values = sc.nextLine();
		List<String> items = Arrays.stream(values.split(" ")).collect(Collectors.toList());
		List<Integer> nums = new ArrayList<>();
		
		for (int i = 0; i < items.size(); i++) 
		{
			nums.add(Integer.parseInt(items.get(i)));
			System.out.println("arr["+ i + "] = " + items.get(i));
		}
//			2 35 126 2
//			arr[0] = 2
//			arr[1] = 35
//			arr[2] = 126
//			arr[3] = 2
	}
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//	
	
	public static void listForLoop()
	{
		List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six"));
		
		for (int index = 0; index < list.size(); index++) {
			System.out.printf("arr[%d] = %s%n", index, list.get(index));
		} 
//			arr[0] = one
//			arr[1] = two
//			arr[2] = three
//			arr[3] = four
//			arr[4] = five
//			arr[5] = six
		
		System.out.println(String.join(", ", list)); 
		
//			one, two, three, four, five, six
	}
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
	
	public static void sumAdjacent()
	{
		Scanner sc = new Scanner(System.in);
		
		List<Double> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Double ::parseDouble).collect(Collectors.toList());
		
		for (int i = 0; i < numbers.size() - 1; i++) {
			if (numbers.get(i).equals(numbers.get(i + 1))) {
				numbers.set(i, numbers.get(i) + numbers.get(i + 1)); 
				numbers.remove(i + 1);
				i = -1;
			}
			
		}
		
		String output = joinElementsByDelimiter(numbers, " ");
		System.out.println(output);
		
	}
	
//-----------------------------------------------------------------------------------------------------------------//
	
	static String joinElementsByDelimiter(List<Double> items, String delimiter)
	{
		String output = "";
		
		for (Double item : items) {
			output += (new DecimalFormat("0.#").format(item) + delimiter);
			
		}return output;
		
//			5 2 2 4 6 3 3 45
//			5 8 12 45 
	}
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
	
	public static void gaussTrick()
	{
		Scanner sc = new Scanner(System.in);
		
		List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		
		int size = numbers.size();
		
		for (int i = 0; i < size / 2; i++) {
			numbers.set(i, numbers.get(i) + numbers.get(numbers.size() - 1));
			numbers.remove(numbers.size() - 1);
		}
		System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
	}
	
//			1 2 3 4 5
//			6 6 3
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
	
	public static void mergingList()
	{
		Scanner sc = new Scanner(System.in);
		
		List<Integer> nums1 = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		List<Integer> nums2 = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		List<Integer> resNums = new ArrayList<>();
		for (int i = 0; i < Math.min(nums1.size(), nums2.size()); i++) {
			resNums.add(nums1.get(i));
			resNums.add(nums2.get(i));
		}
		
		if (nums1.size() > nums2.size()) {
			resNums.addAll(getRemainingElements(nums1, nums2));
		} else if (nums2.size() > nums1.size()) {
			resNums.addAll(getRemainingElements(nums2, nums1));
		}

//		System.out.println(resNums.toString());
		System.out.println(resNums.toString().replaceAll("[\\[\\],]", ""));
	}
	

	
//-----------------------------------------------------------------------------------------------------------------//
	
	public static List<Integer> getRemainingElements(List<Integer> longerList, List<Integer> shorterList)
	{
		List<Integer> nums = new ArrayList<>();
		
		for (int i = shorterList.size(); i < longerList.size(); i++) {
			nums.add(longerList.get(i));
		}
		
		return nums;
//			1 2 3 4
//			1 2 3
//			1 1 2 2 3 3 4
	}
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
	
	public static void sortingList()
	{
		List<String> names = new ArrayList<>(Arrays.asList("Peter", "Michael", "George", "Victor", "John"));
		Collections.sort(names);
		System.out.println(String.join(", ", names));
		
		Collections.sort(names);
		Collections.reverse(names);
		System.out.println(String.join(", ", names));
	}
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
}

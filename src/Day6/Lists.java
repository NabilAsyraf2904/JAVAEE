package Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Lists {

	public static void main(String[] args)
	{
		
		//arrayList();
		collectList();

	}
	
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
	}
	
	public static void collectList()
	{
		Scanner sc = new Scanner(System.in);
		String values = sc.nextLine();
		List<String> items = Arrays.stream(values.split(" ")).collect(Collectors.toList());
		List<Integer> nums = new ArrayList<>();
		
		for (int i = 0; i < items.size(); i++) 
		{
			nums.add(Integer.parseInt(items.get(i)));
			System.out.println("arr["+ i + "] =" + items.get(i));
		}
	}

}

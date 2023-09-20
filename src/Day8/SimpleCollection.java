package Day8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SimpleCollection {

	public static void main(String[] args)
	{
		Collection c;
		c = new ArrayList();
		System.out.println(c.getClass().getName());
	
		
		for (int i = 1; i <= 10; i++) 
		{
			c.add(i + " * " + i + " = " + i * i);
		}
			
			
		Iterator iter = c.iterator();
		while (iter.hasNext()) 
		{
			System.out.println(iter.next());
			
		}
		
		Scanner sc = new Scanner(System.in);
		String values = sc.nextLine();
		List<String> list_String = Arrays.stream(values.split(" ")).collect(Collectors.toList());
		
		List<Integer> nums = new ArrayList<>();
		
		for (int i = 0; i < list_String.size(); i++) {
			nums.add(Integer.parseInt(list_String.get(i)));
			
		}
		System.out.println("Before shuffle");
		System.out.println(nums);
		
		Collections.shuffle(nums);
		System.out.println("After shuffle");
		System.out.println(nums);
		
				
	}
	
			//	java.util.ArrayList
			//	1 * 1 = 1
			//	2 * 2 = 4
			//	3 * 3 = 9
			//	4 * 4 = 16
			//	5 * 5 = 25
			//	6 * 6 = 36
			//	7 * 7 = 49
			//	8 * 8 = 64
			//	9 * 9 = 81
			//	10 * 10 = 100
			//	1 2 3 4 5
			//	Before shuffle
			//	[1, 2, 3, 4, 5]
			//	After shuffle
			//	[3, 2, 1, 4, 5]

	

}

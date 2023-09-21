package Day9;

import java.util.Collections;
import java.util.LinkedList;

public class SwapProb {

	public static void main(String[] args)
	{
		
		LinkedList<String> l_list = new LinkedList<String>();
		
			l_list.add("Red");
			l_list.add("Green");
			l_list.add("Black");
			l_list.add("Pink");
			l_list.add("Orange");
			
			System.out.println("The Original linked list: " + l_list);
			Collections.swap(l_list, 0, 2);
			System.out.println("The New linked list after swap: " + l_list);
		
		LinkedList<String> c1 = new LinkedList<String>();
		
				c1.add("Red");
				c1.add("Green");
				c1.add("Black");
				c1.add("Pink");
				c1.add("Orange");
				
			System.out.println("List of first linked list: " + c1);
			
		LinkedList<String> c2 = new LinkedList<String>();
		
				c2.add("Red");
				c2.add("Green");
				c2.add("Black");
				c2.add("Pink");
				c2.add("Orange");
				
			System.out.println("List of second linked list: " + c2);
			
		LinkedList<String> a = new LinkedList<String>();
		
			a.addAll(c1);
			a.addAll(c2);
			
			System.out.println("New linked list: " + a);

	}
			//			The Original linked list: [Red, Green, Black, Pink, Orange]
			//			The New linked list after swap: [Black, Green, Red, Pink, Orange]
			//			List of first linked list: [Red, Green, Black, Pink, Orange]
			//			List of second linked list: [Red, Green, Black, Pink, Orange]
			//			New linked list: [Red, Green, Black, Pink, Orange, Red, Green, Black, Pink, Orange]


}

package Day2;

public class Person {
	
	public static void main(String[] args)
	{
		String outer = " I'm inside the main()";
		
		for (int i = 0; i < 10; i++)
		{
			String inner = "I'm inside the loop";
			System.out.println(inner);
		}
		
		System.out.println(outer);
		//System.out.println(inner); Error since inner declare in for loop locally not global
	}

}

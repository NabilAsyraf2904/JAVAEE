package Day6;

public class ForEachLoop {

	public static void main(String[] args) 
	{
		arrayForEach();

	}
	
//-------------------------------------------------------//	
	public static void arrayForEach() 
	{
		int[] numbers = { 1, 2, 3, 4, 5};
		
		for (int number : numbers)
		{
			System.out.println(number + " ");
		}
	}
	
//-------------------------------------------------------//	

}

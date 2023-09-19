package Day7;

//---------------------------------------Before link with next method ---------------------------------------------\\
//++++++++++++++++++++++++++++++++End method without link from other method++++++++++++++++++++++++++++++++++++++++\\

public class ReferenceType {

	public static void main(String[] args) 
	{
		int num = 5;
		incrementval(num, 15);
		System.out.println(num);
		
		int[] nums = {5};
		incrementref(nums, 15);
		System.out.println(nums[0]);
		
	}

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\
	//Value Types
	public static void incrementval(int num, int value)
	{
		num += value;
		// void == the value cannot return in main, must print inside incrementVal() to get the value of 20.
		//		5
	}
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\
	//Reference Types
	public static void incrementref(int[] nums, int value)
	{
		nums[0] += value;
		
		//		20
	}
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\
}

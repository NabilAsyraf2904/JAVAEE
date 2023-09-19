package Day7;

//---------------------------------------Before link with next method ---------------------------------------------\\
//++++++++++++++++++++++++++++++++End method without link from other method++++++++++++++++++++++++++++++++++++++++\\

import java.util.Scanner;

public class OverloadingMethods {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.println(getMax(3, 7));
		System.out.println(getMax('a', 'b'));
		System.out.println(getMax("AAAA", "AAA"));

	}

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\
	
	public static int getMax(int a,int b)
	{
		if (a > b) 
		{
			return a;
		} else 
		{
			return b;
		}
	}
	
	public static char getMax(char a,char b)
	{
		if (a > b) 
		{
			return a;
		} else 
		{
			return b;
		}
	}
	
	public static String getMax(String a,String b)
	{
		int result = a.compareTo(b);
		
		if (result > 0) 
		{
			return a;
		} else 
		{
			return b;
		}
	}
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\\

}

package Day10;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class InitializeString 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
//		convertStringtoChar();
//		joinString();
//		repeatedString();
//		indexString();
//		replaceString();
//		textFilter();
		concatenationVsStringBuilder();
	}
	
//------------------------------------------------------------------------------------------\\		
	
	public static void convertStringtoChar()
	{
		String str = new String(new char[]{'s', 't', 'r'});
		char[] charArr = str.toCharArray();
		System.out.println(charArr);
		
		// 		output: str
	}
	
//------------------------------------------------------------------------------------------\\		
	
	public static void joinString()
	{
		String s = "abc";
		String[] arr = new String[3];
		
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = s;	
			System.out.print(arr[i]);
		}
		
		System.out.println(" ");
		String repeated = String.join("", arr);

		System.out.println(repeated);
	
		//		output: abcabcabc 
		//				  abcabcabc
	}
	
//------------------------------------------------------------------------------------------\\	
	
	public static void repeatedString()
	{
		String[] words = sc.nextLine().split(" ");
		
		List<String> result = new ArrayList<>();
		
		for (String word : words) 
		{
			result.add(word.repeat(word.length()));
		}
		
		System.out.println(String.join("", result));
		
		//		input  : hi abc add
		//		output: hihiabcabcabcaddaddadd
	}
	
//------------------------------------------------------------------------------------------\\		
	
	public static void indexString()
	{
		// indexOf() for the stated String
		//lastIndexOf() after the stated String
		
		
		String fruits = "banana, apple, kiwi, banana, apple";
		
		System.out.println(fruits.indexOf("banana"));
		//		output: 0
		
		System.out.println(fruits.indexOf("orange"));
		//		output: -1

		System.out.println(fruits.lastIndexOf("banana"));
		//		output: 21
		
		System.out.println(fruits.lastIndexOf("orange"));
		//		output: -1
	}
	
//------------------------------------------------------------------------------------------\\	
	
	public static void replaceString()
	{
		String text = "Hello, muhilan@gmail.com, you have been using muhilan@gmail.com in your registration.";
		
		String replacedText = text.replace("muhilan@gmail.com"," muhilan@gmail.net" );
		System.out.println(replacedText);
		
		//		output: Hello,  muhilan@gmail.net, you have been using  muhilan@gmail.net in your registration.

	}
	
//-----------------------------------Problem: Text Filter-------------------------------\\		
	
	public static void textFilter()
	{
		System.out.print("Band word: ");
		String[] banWords = sc.nextLine().split(", ");
		
		String text = sc.nextLine();
		System.out.println("----------------------------------");
		
		for (String banWord : banWords) 
		{
			if (text.contains(banWord))
			{
				String replacement = repeatStr("*", banWord.length());
				
				text = text.replace(banWord, replacement);
			}
		}
		
		System.out.println(text);
	}
	
	public static String repeatStr(String str, int length)
	{
		String replacement = "";
		
		for (int i = 0; i < length; i++) 
		{
			replacement += str;
		}
		
		return replacement;
		
		//		input  : bandword = mcd
		//				  text = saya suka makan mcd, hari2 saya makan mcd, mcd sangat sedap.
		//		output: saya suka makan ***, hari2 saya makan ***, *** sangat sedap.
	}
	
//------------------------------------------------------------------------------------------\\
	
	public static void concatenationVsStringBuilder()
	{
		//Concatenation
		
		System.out.println(new Date());
		
		String text = "";
		
		for (int i = 0; i < 100000; i++) 
		{
			text += "a";
		}
		
		System.out.println(new Date());
		
		////////////////////////////////////
		//StringBuilder
		
		System.out.println(new Date());
		
		StringBuilder text2 = new StringBuilder();
		
		for (int i = 0; i < 100000; i++) 
		{
			text2.append("a");
		}
		System.out.println(new Date());
		
		//		output:  Fri Sep 22 11:14:31 MYT 2023
		//					Fri Sep 22 11:14:32 MYT 2023
		//					Fri Sep 22 11:14:32 MYT 2023
		//					Fri Sep 22 11:14:32 MYT 2023
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Hello Peter, how are you?");
		System.out.println(sb.charAt(1));
		System.out.println(sb.insert(11, " Ivanov"));
		
		//		output:  e
		//					Hello Peter Ivanov, how are you?
		
	}
	
//------------------------------------------------------------------------------------------\\
}

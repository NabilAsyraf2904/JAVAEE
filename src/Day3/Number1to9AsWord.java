package Day3;

import java.util.Scanner;

public class Number1to9AsWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		if(num == 1) 
		{
			System.out.println("One");
		} else if (num == 2)
		{
			System.out.println("Two");
		}else if (num == 3)
		{
			System.out.println("Three");
		}else if (num == 4)
		{
			System.out.println("Four");
		}else if (num == 5)
		{
			System.out.println("Five");
		}else if (num == 6)
		{
			System.out.println("Six");
		}else if (num == 7)
		{
			System.out.println("Seven");
		}else if (num == 8)
		{
			System.out.println("Eight");
		}else if (num == 9)
		{
			System.out.println("Nine");
		}else {
			System.out.println("Out of range");
		}
		
		Scanner scp = new Scanner(System.in);
		System.out.println("Password :");
		String password = scp.nextLine();
		if (password.equals("s3cr3t"))
		{
			System.out.println("Welcome");
		} else
		{
			System.out.println("Wrong pasword!");
		}
	}

}

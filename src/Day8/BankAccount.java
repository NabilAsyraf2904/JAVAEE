package Day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BankAccount 
{
	private static final double DEFAULT_INTEREST = 0.15;
	
	private static double interestRate = DEFAULT_INTEREST;
	private static int bankAccountsCount = 0;
	private static int countAcc = 0;
	private int id;
	private double balance;

	private double amount;
	static String command = "";
	
	static Scanner scanner = new Scanner(System.in);
	
	public BankAccount()
	{
		countAcc++;
		id = countAcc;
		System.out.printf("Account #%d creates\n", id);
		
	}
	

	public static void setInteresRate(double rate)
	{
		BankAccount.interestRate = rate;
		System.out.printf("Interest rate changed : %.2f\n", rate);
	}

	public static int getBankAccountsCount() {
		return bankAccountsCount;
	}
	
	public void deposit(double x)
	{
		balance += x;
		System.out.printf("Deposited %.2f to account #%d\n", x, id);
	}


	public static void setBankAccountsCount(int bankAccountsCount) {
		BankAccount.bankAccountsCount = bankAccountsCount;
	}
	
	public double calcInterestRate(int month)
	{
		return balance*interestRate*month;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public static double getDefaultInterest() {
		return DEFAULT_INTEREST;
	}

	public String toString()
	{
		return String.format("%s", this.id);
	}
	
	public static void main(String[] args) 
	{
		//BankAccount ID = new BankAccount();
		List<BankAccount> accounts = new ArrayList<BankAccount>();
		END: {
			while (true)
			{
				String[] command = scanner.nextLine().split(" ");
			
				switch (command[0]) 
				{
					case "create": 
					{
						BankAccount acc = new BankAccount();
						accounts.add(acc);
						break;
					}
					
					case "deposit":
					{
						for (BankAccount account : accounts)
						{
							if (account.getId() == Integer.parseInt(command[1])) 
							{
								account.deposit(Double.parseDouble(command[2]));
								break;
							}
							
						}
						break;
					}
			
					case "set-interest": 
					{
						BankAccount.setInteresRate(Double.parseDouble(command[1]));
						break;
					}	
			
					case "calc-interest":
					{
						double rate = 0;
						for (BankAccount account : accounts) {
							if (account.getId() == Integer.parseInt(command[1])) 
							{
								rate = account.calcInterestRate(Integer.parseInt(command[2]));
							}
						}
						System.out.printf("Interest: %.2f", rate);
						break;
					}
			
					case "end": 
					{
						System.out.println("Goodbye");
						break END;
					}
					default:
						System.out.println("Wrong command! Enter valid command:");
					break;
				}
				
				
			}
		}
	}
	

}

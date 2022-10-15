package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.WithdrawException;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("Enter account data");
	
			
			System.out.print("Number: ");
			Integer accNumber = sc.nextInt();
			
			System.out.print("Holder: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(accNumber, name, balance, withdrawLimit);
			
			System.out.println();
			
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			
			account.withdraw(amount);

			System.out.println("Novo saldo: " + String.format("%.2f", account.getBalance()));
			
//			System.out.println(account);
		}
		catch (WithdrawException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		
		
		
		sc.close();
	}
}

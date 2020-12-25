package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter account data");
			System.out.print("Number: "); 
			Integer number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: "); 
			String holder = sc.nextLine();
			System.out.print("Initial balance: "); 
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: "); 
			Double withDrawLimit = sc.nextDouble();
			System.out.print("Enter amount for withdraw: ");
			Double amount = sc.nextDouble(); 
			Account account = new Account(number, holder, balance, withDrawLimit);
			account.withdraw(amount);
			System.out.println(account);
		} catch (InputMismatchException e) {
			System.out.println("Value(s) doe(s) not match");
		} catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		sc.close();
	}
}

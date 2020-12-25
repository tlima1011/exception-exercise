package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter account data");
		System.out.print("Number: "); //8021
		Integer number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");//Bob Brown
		String holder = sc.nextLine(); 
		System.out.print("Initial balance: ");//500.00
		Double balance = sc.nextDouble(); 
		System.out.print("Withdraw limit: ");//300.00
		Double withDrawLimit = sc.nextDouble(); 
		System.out.print("Enter amount for withdraw: ");
		Double amount = sc.nextDouble(); //100.00
		Account account = new Account(number, holder, balance, withDrawLimit);
		account.withdraw(amount);
		if(amount < withDrawLimit) {
			System.out.println(account);
		}
		/*if(amount > withDrawLimit) {
			//System.out.println("Withdraw error: The amount exceeds withdraw limit");
		}else {
			Account account = new Account(number, holder, balance, withDrawLimit);
			account.withdraw(amount);
		}*/
  	 sc.close();
	}
}

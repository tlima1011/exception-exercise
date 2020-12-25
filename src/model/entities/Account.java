package model.entities;

public class Account {

	// Atributos
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	// Construtores
	public Account() {

	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	// Getters and Setters
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	// Methods
	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		if (amount >= this.balance || this.balance == 0) {
			System.out.println("Withdraw error: Not enough balance");
		} else if (amount >= this.withdrawLimit) {
			System.out.println("Withdraw error: The amount exceeds withdraw limit");
		} else {
			this.balance -= amount;
		}
	}

	@Override
	public String toString() {
		return "New balance: $" + String.format("%.2f", balance);
	}
	
}

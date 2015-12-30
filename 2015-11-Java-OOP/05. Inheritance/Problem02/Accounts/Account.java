package Accounts;

import java.math.BigDecimal;

import Customers.Customer;

public class Account {
	private Customer customer;
	private BigDecimal balance;
	private double interestRate;
	
	public Account() {}
	public Account(Customer customer, BigDecimal balance, double interestRate){
		this.customer = customer;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void Deposit(BigDecimal amount)
	{
		this.balance.add(amount);
	}
	
	public BigDecimal calculateRate(int months){
		BigDecimal result = new BigDecimal(months * this.interestRate);
		return result;
	}
	
}

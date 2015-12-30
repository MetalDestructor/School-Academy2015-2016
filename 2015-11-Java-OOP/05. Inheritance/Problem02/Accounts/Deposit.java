package Accounts;

import java.math.BigDecimal;

public class Deposit extends Account {

	public void Withdraw(BigDecimal amount) {
		setBalance(getBalance().add(amount));
	}
}

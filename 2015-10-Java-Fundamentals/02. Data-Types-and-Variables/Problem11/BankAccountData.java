import java.math.BigDecimal;

public class BankAccountData {

	public static void main(String[] args) {
		String fName = "Pesho";
        String mName = "Peshov";
        String lName = "Peshov";
        BigDecimal balance = new BigDecimal("24.45");
        String bankName = "Durty Socks Inc.";
        String IBAN = "GB82 WEST 1234 5678 9123 45";
        long fCreditCard = 123456789123456123L;
        long sCreditCard = 123456789123456456L;
        long tCreditCard = 123456789123456789L;
        
        System.out.printf("Name: %s %s %s%n"
				+ "Balance: %.2f%n"
				+ "Bank Name: %s%n"
				+ "IBAN: %s%n"
				+ "Credit Card No.1: %d%n"
				+ "Credit Card No.2: %d%n"
				+ "Credit Card No.3: %d%n"
		, fName, mName, lName, balance, bankName, IBAN, fCreditCard, sCreditCard, tCreditCard);

	}

}


public class FourDigitNumber {

	public static void main(String[] args) {
		int n = 9876;
		int sum = n / 1000 + ((n / 100) % 10) + ((n % 100) / 10) + n % 10;

		String n1 = String.valueOf(n / 1000);
		String n2 = String.valueOf((n / 100) % 10);
		String n3 = String.valueOf((n % 100) / 10);
		String n4 = String.valueOf(n % 10);

		String sReversed = n4 + n3 + n2 + n1;
		String sLastDigitInfront = n4 + n1 + n2 + n3;
		String sSecondAndThird = n1 + n3 + n2 + n4;

		int reversed = Integer.parseInt(sReversed);
		int lastDigitInfront = Integer.parseInt(sLastDigitInfront);
		int secondAndThird = Integer.parseInt(sSecondAndThird);

		System.out.println(sum);
		System.out.println(reversed);
		System.out.println(lastDigitInfront);
		System.out.println(secondAndThird);
	}

}

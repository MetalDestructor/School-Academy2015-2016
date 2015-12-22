
public class PrimeNumberCheck {

	public static void main(String[] args) {
		boolean result = true;
		int prime = 1;
		if (prime < 2) {
			result = false;
		}
		else {
			for (int i = 2; i < prime; i++) {
				if(prime%i == 0) result = false;
			}
		}
		
		System.out.println(result);
	}

}

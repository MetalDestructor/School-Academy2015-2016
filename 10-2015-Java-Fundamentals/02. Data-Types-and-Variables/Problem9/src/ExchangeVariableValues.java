
public class ExchangeVariableValues {
	public static void main(String[] args) { 
		int a = 5;
		int b = 10;
		
		System.out.printf("Values before exchange: %d, %d%n", a, b);
		
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.printf("Values before exchange: %d, %d%n", a, b);
	}
}

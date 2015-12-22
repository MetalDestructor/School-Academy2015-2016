import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(reader.readLine());
		System.out.println(fibonacci(number));
	}
	
	public static int fibonacci(int number) {
		if (number ==1 || number == 2) {
			return 1;
		}
		int fibo1 = 1;
		int fibo2 = 1;
		int fibonacci = 1;
		for (int i = 3; i <= number; i++) {
			fibonacci = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibonacci;
		}
		
		return fibonacci;
	}

}

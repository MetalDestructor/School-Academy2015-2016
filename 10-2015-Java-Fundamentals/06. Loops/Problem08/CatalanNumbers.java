import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class CatalanNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		
		BigDecimal c = new BigDecimal(fact(2 * n)/(fact(n+1)*fact(n)));
		System.out.println(c.doubleValue());
	}
	
	public static long fact(int num) {
		long fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}

}

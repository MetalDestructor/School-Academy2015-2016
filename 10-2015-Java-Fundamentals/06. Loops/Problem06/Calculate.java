import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculate {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int k = Integer.parseInt(reader.readLine());

		int result = fact(n) / fact(k);
		System.out.println(result);
	}

	public static int fact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}
}

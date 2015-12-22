import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculate {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int x = Integer.parseInt(reader.readLine());

		double sum = 1;
		for (int i = 1; i <= n; i++) {
			sum += fact(i) / Math.pow(x, i);
		}

		System.out.printf("%.5f", sum);
	}

	public static int fact(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}

}

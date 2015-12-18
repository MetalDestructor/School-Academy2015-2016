import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculate {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int x = Integer.parseInt(reader.readLine());

		double sum = 1;
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				fact *= j;
			}
			sum += fact / Math.pow(x, i);
			fact = 1;
		}

		System.out.printf("%.5f", sum);
	}

}

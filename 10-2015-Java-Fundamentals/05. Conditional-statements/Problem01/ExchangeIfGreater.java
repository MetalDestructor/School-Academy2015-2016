import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExchangeIfGreater {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double a = Double.parseDouble(reader.readLine());
		double b = Double.parseDouble(reader.readLine());

		if (a < b) {
			System.out.printf("%.1f %.1f", a, b);
		} else {
			System.out.printf("%.1f %.1f", b, a);

		}
	}

}

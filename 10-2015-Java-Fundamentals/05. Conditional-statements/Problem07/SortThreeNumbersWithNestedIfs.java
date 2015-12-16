import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortThreeNumbersWithNestedIfs {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double a = Double.parseDouble(reader.readLine());
		double b = Double.parseDouble(reader.readLine());
		double c = Double.parseDouble(reader.readLine());

		if (a < b) {
			if (b < c) {
				System.out.printf("%.1f, %.1f, %.1f", c, b, a);
			} else {
				System.out.printf("%.1f, %.1f, %.1f", b, c, a);
			}
		} else if (b < c) {
			if (c < a) {
				System.out.printf("%.1f, %.1f, %.1f", a, c, b);
			} else {
				System.out.printf("%.1f, %.1f, %.1f", c, a, b);
			}
		} else if (c < a) {
			if (a < b) {
				System.out.printf("%.1f, %.1f, %.1f", b, a, c);
			} else {
				System.out.printf("%.1f, %.1f, %.1f", a, b, c);
			}
		} else {
			System.out.printf("%.1f, %.1f, %.1f", a, b, c);
		}
	}

}

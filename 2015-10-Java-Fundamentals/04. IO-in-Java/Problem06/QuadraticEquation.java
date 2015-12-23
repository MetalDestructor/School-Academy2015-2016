import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuadraticEquation {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		double a = Double.parseDouble(reader.readLine());
		double b = Double.parseDouble(reader.readLine());
		double c = Double.parseDouble(reader.readLine());

		double x1;
		double x2;

		double d = Math.pow(b, 2) + 4 * a * c;

		if (d == 0) {
			x1 = (-b) / (2 * a);
			System.out.println(x1);
		} else if (d < 0) {
			System.out.println("No real roots!");
		} else {
			x1 = ((-b) - Math.sqrt(d)) / (2 * a);
			x2 = ((-b) + Math.sqrt(d)) / (2 * a);
			System.out.println(x1 + "\n" + x2);
		}

	}

}

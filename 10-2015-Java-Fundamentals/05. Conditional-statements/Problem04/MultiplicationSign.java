import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicationSign {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double a = Double.parseDouble(reader.readLine());
		double b = Double.parseDouble(reader.readLine());
		double c = Double.parseDouble(reader.readLine());

		double res = a * b * c;

		if (res < 0) {
			System.out.println("-");
		} else if (res > 0) {
			System.out.println("+");
		} else {
			System.out.println("0");
		}
	}

}

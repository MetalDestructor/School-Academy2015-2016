import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheBiggestOfFiveNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double a = Double.parseDouble(reader.readLine());
		double b = Double.parseDouble(reader.readLine());
		double c = Double.parseDouble(reader.readLine());
		double d = Double.parseDouble(reader.readLine());
		double e = Double.parseDouble(reader.readLine());

		double max = a;

		if (max < b) {
			max = b;
			if (max < c) {
				max = c;
				if (max < d) {
					max = d;
					if (max < e) {
						max = e;
					}
				}
			}
		} else if (max < c) {
			max = c;
			if (max < d) {
				max = d;
				if (max < e) {
					max = e;
				}
			}
		} else if (max < d) {
			max = d;
			if (max < e) {
				max = e;
			}
		} else if (max < e) {
			max = e;
		}

		System.out.printf("%.1f", max);
	}

}

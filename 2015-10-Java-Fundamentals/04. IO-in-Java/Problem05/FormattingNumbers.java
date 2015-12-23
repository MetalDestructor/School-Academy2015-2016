import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FormattingNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int a;
		do {
			a = Integer.parseInt(reader.readLine());
		} while (a < 0 || a > 500);

		float b = Float.parseFloat(reader.readLine());
		float c = Float.parseFloat(reader.readLine());

		System.out.printf("%s | %10s | %-1.2f|%1.3f",
				Integer.toHexString(a), Integer.toBinaryString(a), b, c);

	}

}

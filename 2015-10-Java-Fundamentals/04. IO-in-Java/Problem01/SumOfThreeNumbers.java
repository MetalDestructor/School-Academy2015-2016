import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfThreeNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		int a = Integer.parseInt(line);
		int b = Integer.parseInt(line);
		int c = Integer.parseInt(line);

		int sum = a + b + c;
		System.out.println(sum);

	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersNotDivisible {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(reader.readLine());
		for (int i = 1; i <= num; i++) {
			if (i % 3 != 0 && i % 7 != 0) {
				System.out.println(i);
			}
		}
	}

}

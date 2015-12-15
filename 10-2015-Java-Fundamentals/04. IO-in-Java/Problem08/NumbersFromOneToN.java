import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersFromOneToN {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(reader.readLine());
		
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
	}

}

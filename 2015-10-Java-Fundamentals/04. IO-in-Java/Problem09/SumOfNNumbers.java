import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int finalSum = 0;
		int sum = 0;
		int n = Integer.parseInt(reader.readLine());
		for (int i = 0; i < n; i++) {
			sum = Integer.parseInt(reader.readLine());
			finalSum += sum; 
		}
		System.out.println(finalSum);
	}

}

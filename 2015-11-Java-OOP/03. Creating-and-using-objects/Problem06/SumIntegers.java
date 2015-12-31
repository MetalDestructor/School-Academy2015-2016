import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumIntegers {

	public static void main(String[] args) throws IOException {
		sumOfNumbers();
	}
	
	public static void sumOfNumbers() throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String numbers = reader.readLine();
		String[] sNumbers = numbers.split(" ");
		int sum = 0;
		for (int i = 0; i < sNumbers.length; i++) {
			sum += Integer.parseInt(sNumbers[i]);
		}
		System.out.println(sum);
	}

}

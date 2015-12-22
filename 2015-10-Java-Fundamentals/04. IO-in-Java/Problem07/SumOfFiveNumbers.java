import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfFiveNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		String[] lineArr = line.split(" ");

		int a = Integer.parseInt(lineArr[0]);
		int b = Integer.parseInt(lineArr[1]);
		int c = Integer.parseInt(lineArr[2]);
		int d = Integer.parseInt(lineArr[3]);
		int e = Integer.parseInt(lineArr[4]);

		int sum = a + b + c + d + e;
		System.out.println(sum);

	}

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalToBinary {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		long num = Long.parseLong(reader.readLine());

		StringBuilder binaryNum = new StringBuilder();
		while (num != 0) {
			binaryNum.append(num % 2);
			num = num / 2;
		}
		binaryNum.reverse();
		System.out.println(binaryNum);
	}

}

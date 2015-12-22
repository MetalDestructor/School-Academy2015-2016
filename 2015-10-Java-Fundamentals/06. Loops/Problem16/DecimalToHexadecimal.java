import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalToHexadecimal {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		long num = Long.parseLong(reader.readLine());

		StringBuilder hexNum = new StringBuilder();
		while (num != 0) {
			int digit = (int) (num % 16);
			switch (digit) {
			case 10:
				hexNum.append('A');
				break;
			case 11:
				hexNum.append('B');
				break;
			case 12:
				hexNum.append('C');
				break;
			case 13:
				hexNum.append('D');
				break;
			case 14:
				hexNum.append('E');
				break;
			case 15:
				hexNum.append('F');
				break;
			default:
				hexNum.append(num % 16);
			}
			num = num / 16;
		}
		hexNum.reverse();
		System.out.println(hexNum);

	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HexadecimalToDecimal {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String hexNum = reader.readLine();
		long result = 0;
		int power = hexNum.length() - 1;
		int iNum = 0;
		for (char num : hexNum.toCharArray()) {
			switch (num) {
			case 'A':
				iNum = 10;
				result += iNum * Math.pow(16, power);
				--power;
				break;

			case 'B':
				iNum = 11;
				result += iNum * Math.pow(16, power);
				--power;
				break;

			case 'C':
				iNum = 12;
				result += iNum * Math.pow(16, power);
				--power;
				break;

			case 'D':
				iNum = 13;
				result += iNum * Math.pow(16, power);
				--power;
				break;

			case 'E':
				iNum = 14;
				result += iNum * Math.pow(16, power);
				--power;
				break;
			case 'F':
				iNum = 15;
				result += iNum * Math.pow(16, power);
				--power;
				break;

			default:
				iNum = Character.getNumericValue(num);
				result += iNum * Math.pow(16, power);
				--power;
			}

		}
		System.out.println(result);

	}

}

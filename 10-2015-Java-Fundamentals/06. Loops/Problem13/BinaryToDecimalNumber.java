import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryToDecimalNumber {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String binaryNum = reader.readLine();
		long result = 0;
		int power = binaryNum.length()-1;
		for (char num : binaryNum.toCharArray()) {
			int iNum = Character.getNumericValue(num);
			result += iNum*Math.pow(2, power );
			--power;
		}
		System.out.println(result);
	}

}

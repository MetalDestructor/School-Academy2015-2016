import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlayWithIntDoubleString {

	public static void main(String[] args) throws IOException {
		System.out.println("Please choose a type:\n1 --> int\n2 --> double\n3 --> string");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int select = Integer.parseInt(reader.readLine());
		switch (select) {
		case 1:
			int intNum = Integer.parseInt(reader.readLine());
			intNum = intNum + 1;
			System.out.println(intNum);
			break;
		case 2:
			double doubleNum = Double.parseDouble(reader.readLine());
			doubleNum = doubleNum + 1;
			System.out.println(doubleNum);
			break;
		case 3:
			String str = reader.readLine();
			str.concat("*");
			System.out.println(str);
			break;
		default:
			System.out.println("Invalid input");
		}
	}

}

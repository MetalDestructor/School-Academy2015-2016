import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DigitAsWord {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String a = reader.readLine();

		switch (a) {
		case "0":
			System.out.println("zero");
			break;
		case "1":
			System.out.println("one");
			break;
		case "2":
			System.out.println("two");
			break;
		case "3":
			System.out.println("three");
			break;
		case "4":
			System.out.println("four");
			break;
		case "5":
			System.out.println("five");
			break;
		case "6":
			System.out.println("six");
			break;
		case "7":
			System.out.println("seven");
			break;
		case "8":
			System.out.println("eight");
			break;
		case "9":
			System.out.println("nine");
			break;
		default:
			System.out.println("not a digit");
		}
	}

}

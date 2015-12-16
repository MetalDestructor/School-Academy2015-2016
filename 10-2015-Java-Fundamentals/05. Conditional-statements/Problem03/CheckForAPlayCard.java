import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckForAPlayCard {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String a = reader.readLine();

		switch (a) {
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
		case "10":
		case "J":
		case "Q":
		case "K":
		case "A":
			System.out.println("yes");
			break;
		default:
			System.out.println("no");
		}
	}

}

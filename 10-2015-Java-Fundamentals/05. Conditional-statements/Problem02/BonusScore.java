import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BonusScore {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(reader.readLine());
		int result = 0;
		switch (a) {
		case 1:
		case 2:
		case 3:
			result = a * 10;
			break;
		case 4:
		case 5:
		case 6:
			result = a * 100;
			break;
		case 7:
		case 8:
		case 9:
			result = a * 1000;
			break;
		default:
			System.out.println("Invalid score");
		}
		if (a > 0 && a < 10) {
			System.out.println(result);
		}

	}

}

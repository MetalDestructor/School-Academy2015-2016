import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LeapYear {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime dateTime = LocalDateTime.parse(str, formatter);

		int thisYear = dateTime.getYear();
		if (thisYear % 4 == 0) {
			if (thisYear % 100 == 0) {
				if (thisYear % 400 == 0) {
					System.out.println("LEAP YEAR!");
				} else {
					System.out.println("Not a leap year!");
				}
			} else {
				System.out.println("LEAP YEAR!");
			}
		} else {
			System.out.println("Not a leap year!");
		}

	}

}

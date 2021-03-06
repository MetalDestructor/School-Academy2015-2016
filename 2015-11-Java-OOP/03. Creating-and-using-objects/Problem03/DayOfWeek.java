import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DayOfWeek {

	public static void main(String[] args) {
		String str = "1986-04-08 12:30";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
		
		LocalDateTime today = dateTime.now();
		System.out.println(today.getDayOfWeek());
	}

}

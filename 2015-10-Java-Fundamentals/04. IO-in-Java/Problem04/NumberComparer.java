import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberComparer {

	public static void main(String[] args) throws IOException {
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		
		double a = Double.parseDouble(reader.readLine());
		double b = Double.parseDouble(reader.readLine());
		
		double result = (a>b)?a:b;
		System.out.println(result);
	}

}

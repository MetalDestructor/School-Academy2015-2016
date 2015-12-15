import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CirclePerimeterAndArea {

	public static void main(String[] args) throws IOException {
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
		double radius  = Double.parseDouble(reader.readLine());
		
		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * Math.pow(radius, 2);
		
		System.out.printf("Perimeter: %.2f%n", perimeter);
		System.out.printf("Area: %.2f%n", area);
	}

}

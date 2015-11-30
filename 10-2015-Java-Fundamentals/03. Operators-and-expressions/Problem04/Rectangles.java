
public class Rectangles {

	public static void main(String[] args) {
		int width = 3;
		int height = 4;
		
		int perimeter = 2*width + 2*height;
		int area = width*height;
		
		System.out.printf("Width: %d%n"
						+ "Height: %d%n"
						+ "Perimeter: %d%n"
						+ "Area: %d%n",
						width, height, perimeter, area);
	}

}

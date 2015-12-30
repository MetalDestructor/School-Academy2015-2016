
public class ShapeTest {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[]{
				new Triangle(14.3,6.7),
				new Rectangle(9.7,6.48),
				new Square(2.3)
		};
		
		for (int i = 0; i < shapes.length; i++) {
			System.out.printf("%.2f%n",shapes[i].calculateSurface());
		}
	}

}

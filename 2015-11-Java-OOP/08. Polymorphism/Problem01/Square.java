
public class Square extends Shape {
	public Square(double side) {
		this.height = side;
		this.width = side;
	}

	@Override
	public double calculateSurface() {
		double surface = height * width;
		return surface;
	}

}

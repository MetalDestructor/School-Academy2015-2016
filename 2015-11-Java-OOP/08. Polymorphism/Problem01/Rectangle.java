
public class Rectangle extends Shape {
	public Rectangle(double width, double height) {
		this.height = height;
		this.width = width;
	}
	
	@Override
	public double calculateSurface() {
		double surface = height * width;
		return surface;
	}

}

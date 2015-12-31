
public class Triangle extends Shape {
	public Triangle(double width, double height) {
		this.height = height;
		this.width = width;
	}
	
	@Override
	public double calculateSurface() {
		double surface = (height * width) / 2;
		return surface;
	}

}

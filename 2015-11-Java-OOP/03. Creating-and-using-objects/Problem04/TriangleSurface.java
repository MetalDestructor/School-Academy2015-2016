import java.lang.Math;

public class TriangleSurface {

	public static void main(String[] args) {
		System.out.println(sideAndAltitude(23.2, 5));
		System.out.println(threeSides(11, 12, 13));
		System.out.println(twoSidesAndAngle(10, 7, 25)); // some issues right
															// here
	}

	public static double sideAndAltitude(double side, double altitude) {
		double result = (side * altitude) / 2;
		return result;
	}

	public static double threeSides(double a, double b, double c) {
		double p = (a + b + c) / 2;
		double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return result;
	}

	public static double twoSidesAndAngle(double a, double b, double C) {
		double degreeC = Math.toDegrees(C);
		double result = (a * b * Math.sin(degreeC)) / 2;
		return result;
	}

}


public class PointInACircle {

	public static void main(String[] args) {
		double x = -1.5;
		double y = 1;

		boolean result = ((Math.pow(x, 2) + Math.pow(y, 2)) <= Math.pow(2, 2)) ? true : false;

		System.out.println(result);

	}

}

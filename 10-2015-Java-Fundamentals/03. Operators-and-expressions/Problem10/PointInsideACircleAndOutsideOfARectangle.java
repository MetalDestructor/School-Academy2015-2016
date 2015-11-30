
public class PointInsideACircleAndOutsideOfARectangle {

	public static void main(String[] args) {
		double x = 1, y = 2;
		
		String result = (Math.pow((x - 1), 2) + Math.pow((x - 1), 2) <= Math.pow(1.5, 2) 
				&& (x <= 2.5 && x > -0.5) && (y <= 2.5 && y > 1))?"yes":"no";
		
		System.out.println(result);

	}

}

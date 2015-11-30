
public class GravitationOnTheMoon {

	public static void main(String[] args) {
		final double moon = 17;
		double weightOnEarth = 86;

		double weightOnMoon = (moon * weightOnEarth) / 100;
		
		System.out.printf("%.3f",weightOnMoon);
	}

}

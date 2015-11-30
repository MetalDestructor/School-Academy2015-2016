
public class ThirdDigitIsSeven {

	public static void main(String[] args) {
		int number = 999999701;
		number /= 100;
		number %= 10;
		
		boolean result = (number == 7)?true:false;
		
		System.out.println(result);
	}

}

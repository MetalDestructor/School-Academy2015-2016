
public class ComparingFloats {

	public static void main(String[] args) {
		final double eps = 0.000001; 
		
		double a = 4.999999;
		double b = 4.999998;
		boolean areEqual;
		if(Math.abs(a-b) > eps) {
			areEqual = false;
		}else{
			areEqual = true;
		}
		
		System.out.println(areEqual);

	}

}


public class CheckÀBitÀtGivenPosition {

	public static void main(String[] args) {
		int n = 5343, p = 7;
		boolean result = (((n >> p) & 1) == 1)?true:false;
		
		System.out.println(result);

	}

}

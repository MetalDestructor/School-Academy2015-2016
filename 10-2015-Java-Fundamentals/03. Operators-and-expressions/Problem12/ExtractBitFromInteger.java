
public class ExtractBitFromInteger {

	public static void main(String[] args) {
		int n = 5343;
		int p = 7;
		int result = (n >> p) & 1;
		
		System.out.println(result);

	}

}

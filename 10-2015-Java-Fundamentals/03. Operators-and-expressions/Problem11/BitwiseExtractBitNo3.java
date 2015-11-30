
public class BitwiseExtractBitNo3 {

	public static void main(String[] args) {
		int n = 5343;
		int result = (n >> 3) & 1;
		
		System.out.println(result);
	}

}

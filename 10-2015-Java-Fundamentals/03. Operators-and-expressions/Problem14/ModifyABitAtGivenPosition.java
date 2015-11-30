
public class ModifyABitAtGivenPosition {
	public static void main(String[] args) {
		int n = 15, p = 1, v = 1;
		int result = (v == 0) ? n & ~(v << p) : n | (v << p);

		System.out.println(result);
	}
}

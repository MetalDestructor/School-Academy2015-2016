import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddAndEvenProduct {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		String[] sNums = line.split(" ");
		int[] nums = new int[sNums.length];
		int oddProduct = 1;
		int еvenProduct = 1;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(sNums[i]);
		}

		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] & 1) == 1) {
				oddProduct *= nums[i];
			} else {
				еvenProduct *= nums[i];
			}
		}
		if (oddProduct == еvenProduct) {
			System.out.println("yes");
			System.out.println("product = " + oddProduct);
		} else {
			System.out.println("no");
			System.out.println("odd_product = " + oddProduct);
			System.out.println("even_product = " + еvenProduct);
		}

	}

}

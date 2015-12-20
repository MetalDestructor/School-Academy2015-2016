import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int min = Integer.parseInt(reader.readLine());
		int max = Integer.parseInt(reader.readLine());
		Random rand = new Random();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = rand.nextInt((max+1)-min)+min;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(nums[i] + " ");
		}
		
	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperationsOfNNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(reader.readLine());
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(reader.readLine());
		}
		int min = arr[0];
		for (int i = 0; i < num; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		int max = arr[0];
		for (int i = 0; i < num; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum += arr[i];
		}
		double avarage = sum/(double)num;
		System.out.printf("min = %d%n", min);
		System.out.printf("max = %d%n", max);
		System.out.printf("sum = %d%n", sum);
		System.out.printf("avarage = %.2f%n", avarage);
	}

}

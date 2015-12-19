import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixofNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n+i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}

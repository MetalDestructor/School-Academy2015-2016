import java.util.Random;

public class SmartPhone implements IComputer{
	public static final byte BITS = 32;

	@Override
	public String compute() {
		Random rand = new Random();
		int result = BITS * (rand.nextInt(200) - 100 + 1);
		String binary = Integer.toBinaryString(result);
		return binary;
	}
}

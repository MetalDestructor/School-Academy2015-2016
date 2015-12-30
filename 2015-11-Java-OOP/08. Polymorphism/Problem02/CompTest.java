import java.util.ArrayList;

public class CompTest {

	public static void main(String[] args) {
		ArrayList<Laptop> laptops = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			laptops.add(new Laptop());
		}
		
		ArrayList<SmartPhone> phones = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			phones.add(new SmartPhone());
		}
		
		System.out.println("Laptops: ");
		for (int i = 0; i < laptops.size(); i++) {
			System.out.println(laptops.get(i).compute());
		}
		System.out.println("\nSmart phones: ");
		for (int i = 0; i < phones.size(); i++) {
			System.out.println(phones.get(i).compute());
		}
	}

}

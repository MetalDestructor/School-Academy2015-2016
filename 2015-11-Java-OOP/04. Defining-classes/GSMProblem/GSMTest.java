
public class GSMTest {

	public static void main(String[] args) {
		// I'm too lazy to check for phones
		int phonesLength = 3;
		GSM[] phones = new GSM[phonesLength];
		phones[0] = new GSM("A5", "Samsung", 500.85, "ASd Mate", new Battery("Lion", 123, 456),
				new Display("600x400", 23000));
		phones[1] = new GSM("23T", "Toshiba", 325.16, "Lenovo Mate", new Battery("Zed", 23, 796),
				new Display("100x300", 23000));
		phones[2] = new GSM("Z17", "Lenovo", 999.99, "Toshiba Mate", new Battery("MegaBattery", 869, 769),
				new Display("1920x1080", 640000));
		for (int i = 0; i < phonesLength; i++) {
			System.out.println(phones[i].toString());
		}
		
		System.out.println(GSM.iPhone4S.toString());
	}

}

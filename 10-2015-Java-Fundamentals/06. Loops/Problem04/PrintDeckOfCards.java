
public class PrintDeckOfCards {

	public static void main(String[] args) {
		for (int i = 2; i < 15; i++) {
			for (int j = 0; j < 4; j++) {
				switch (i) {
				case 11:
					System.out.print("J ");
					switch (j) {
					case 0:
						System.out.print("of spades, ");
						break;
					case 1:
						System.out.print("of clubs, ");
						break;
					case 2:
						System.out.print("of hearts, ");
						break;
					case 3:
						System.out.print("of diamonds");
						break;
					}
					break;
				case 12:
					System.out.print("Q ");
					switch (j) {
					case 0:
						System.out.print("of spades, ");
						break;
					case 1:
						System.out.print("of clubs, ");
						break;
					case 2:
						System.out.print("of hearts, ");
						break;
					case 3:
						System.out.print("of diamonds");
						break;
					}
					break;
				case 13:
					System.out.print("K ");
					switch (j) {
					case 0:
						System.out.print("of spades, ");
						break;
					case 1:
						System.out.print("of clubs, ");
						break;
					case 2:
						System.out.print("of hearts, ");
						break;
					case 3:
						System.out.print("of diamonds");
						break;
					}
					break;
				case 14:
					System.out.print("A ");
					switch (j) {
					case 0:
						System.out.print("of spades, ");
						break;
					case 1:
						System.out.print("of clubs, ");
						break;
					case 2:
						System.out.print("of hearts, ");
						break;
					case 3:
						System.out.print("of diamonds");
						break;
					}
					break;
				default:
					switch (j) {
					case 0:
						System.out.print(i + " of spades, ");
						break;
					case 1:
						System.out.print(i + " of clubs, ");
						break;
					case 2:
						System.out.print(i + " of hearts, ");
						break;
					case 3:
						System.out.print(i + " of diamonds");
						break;
					}
				}
			}
			System.out.println();
		}
	}

}

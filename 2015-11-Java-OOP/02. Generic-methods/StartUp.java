import java.util.Random;

public class StartUp {

	public static void main(String[] args) {
		Random rand = new Random();
		CustomList<Integer> list = new CustomList<>(12);
		
		list.addElement(2);
		System.out.println(list.length());
		list.addElement(3);
		System.out.println(list.length()); 
		
		list.addElement(4);
		list.addElement(5);
		list.addElement(6);
		list.addElement(1);
		list.addElement(8);
		list.addElement(9);
		list.addElement(10);
		list.addElement(11);
		list.addElement(13);
		list.addElement(12);
		list.toString();
		
		System.out.println(list.findElement(11));
		System.out.println(list.Max()); // Something wrong is going on (investigating)
		System.out.println(list.Min()); //
		System.out.println(list.length());
		list.removeElement(9);
		System.out.println(list.length());
		list.clearList();
		System.out.println(list.length());
		
	}

}

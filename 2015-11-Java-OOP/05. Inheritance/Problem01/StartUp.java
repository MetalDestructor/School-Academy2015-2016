
public class StartUp {

	public static void main(String[] args) {
		Animal[] animals = new Animal[]{
				new Dog(),
				new Frog(),
				new Cat(),
				new Kitten(),
				new Tomcat()
		};
		
		for (int i = 0; i < animals.length; i++) {
			animals[i].sound();
		}
		

	}

}

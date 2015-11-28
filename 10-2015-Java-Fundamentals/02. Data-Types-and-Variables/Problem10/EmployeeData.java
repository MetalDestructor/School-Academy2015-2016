
public class EmployeeData {

	public static void main(String[] args) {
		String fName = "Pesho";
		String lName = "Peshev";
		byte age = 19;
		char gender = 'm';
		long personalIdNumber =  8306112507L;
		int uniqueEmployeeNumber = 27560000;
		
		System.out.printf("Name: %s %s%n"
						+ "Age: %d%nGender: %s%n"
						+ "Personal ID Number: %d%n"
						+ "Unique Employee Number: %d%n"
				, fName, lName, age, gender, personalIdNumber, uniqueEmployeeNumber);
	}

}

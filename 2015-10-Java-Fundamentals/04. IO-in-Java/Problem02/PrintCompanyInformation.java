import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintCompanyInformation {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Company name: ");
		String name = reader.readLine();
		System.out.print("Company address: ");
		String address = reader.readLine();
		System.out.print("Phone number: ");
		String phoneNumber = reader.readLine();
		System.out.print("Fax number: ");
		String faxNumber = reader.readLine();
		System.out.print("Web site: ");
		String webSite = reader.readLine();
		System.out.print("Manager first name: ");
		String mFirstName = reader.readLine();
		System.out.print("Manager last name: ");
		String mLastName = reader.readLine();
		System.out.print("Manager age: ");
		byte mAge = Byte.parseByte(reader.readLine());
		System.out.print("Manager phone: ");
		String mPhone = reader.readLine();
		
		System.out.println(name);
		System.out.println("Address: " + address);
		System.out.println("Tel." + phoneNumber);
		System.out.println("Fax: "+ faxNumber);
		System.out.println("Web site: " + webSite);
		System.out.printf("Manager: %s %s(age: %d, tel. %s)", mFirstName, mLastName, mAge, mPhone);
		
		
		
		
	}

}

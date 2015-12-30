
public class Human {
	private String fName;
	private String lName;
	
	public Human(String fName, String lName){
		if ((fName.length() < 3 || fName.length() > 20) && (lName.length() < 3 || lName.length() > 20)) {
			throw new IllegalArgumentException();
		}
		this.fName = fName;
		this.lName = lName;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}
}

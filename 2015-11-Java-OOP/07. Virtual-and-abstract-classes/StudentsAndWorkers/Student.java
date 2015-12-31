
public class Student extends Human{
	
	public Student(String fName, String lName) {
		super(fName, lName);
		// TODO Auto-generated constructor stub
	}
	private enum type{
		PRIMARY,
		SECONDARY,
		COLLEGE
	};
	private double avarageGrade;
	public double getAvarageGrade() {
		return avarageGrade;
	}
	public void setAvarageGrade(double avarageGrade) {
		if (avarageGrade < 2 || avarageGrade > 6) {
			throw new IllegalArgumentException();
		}
		this.avarageGrade = avarageGrade;
	}
	
	
}

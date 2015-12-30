
public class Display {
	private String size;
	private int numberOfColors;

	public Display() {
		this.size = null;
		this.numberOfColors = 0;
	}

	public Display(String size, int numberOfColors) {
		this.size = size;
		this.numberOfColors = numberOfColors;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getNumberOfColors() {
		return numberOfColors;
	}

	public void setNumberOfColors(int numberOfColors) {
		this.numberOfColors = numberOfColors;
	}
	
	
}

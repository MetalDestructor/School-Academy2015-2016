
public class Battery {
	private String model;
	private int hoursIdle;
	private  int hoursTalk;

	public Battery() {
		this.model = null;
		this.hoursIdle = 0;
		this.hoursTalk = 0;
	}

	public Battery(String model, int hoursI, int hoursT) {
		this.model = model;
		this.hoursIdle = hoursI;
		this.hoursTalk = hoursT;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getHoursIdle() {
		return hoursIdle;
	}

	public void setHoursIdle(int hoursIdle) {
		this.hoursIdle = hoursIdle;
	}

	public int getHoursTalk() {
		return hoursTalk;
	}

	public void setHoursTalk(int hoursTalk) {
		this.hoursTalk = hoursTalk;
	}
	
	
}

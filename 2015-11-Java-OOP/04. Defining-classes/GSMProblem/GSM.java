import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class GSM {
	private String model;
	private String manufacturer;
	private double price;
	private String owner;
	private Battery battery;
	private Display display;
	private ArrayList<Call> history;

	static GSM iPhone4S = new GSM("iPhone4S", "Apple", 1233.34, "Asd Asd", new Battery(), new Display());

	public GSM() {
		this.model = null;
		this.manufacturer = null;
		this.price = 0.0;
		this.owner = null;
		this.battery = new Battery();
		this.display = new Display();
	};

	public GSM(String model, String manufacturer) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.price = 0.0;
		this.owner = null;
		this.battery = new Battery();
		this.display = new Display();
	};

	public GSM(String model, String manufacturer, double price, String owner, Battery battery, Display display) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.price = price;
		this.owner = owner;
		this.battery = battery;
		this.display = display;
	};

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public ArrayList<Call> getHistory() {
		return history;
	}

	public void addCall(Call call) {
		history.add(call);
	}

	public void deleteCall(Call call) {
		history.remove(call);
	}

	public void clearHistory() {
		history.clear();
	}

	public double calculateTotalPrice() {
		double totalPrice = 0;
		for (int i = 0; i < history.size(); i++) {
			int minutes = (history.get(i).getDuration()) % 60;
			totalPrice += minutes * history.get(i).getPrice();
		}
		return totalPrice;
	}

	@Override
	public String toString() {
		String result = "Model: " + model + "\nManufacturer: " + manufacturer + "\nPrice: " + price + "\nOwner: "
				+ owner + "\nBattery: " + battery.getModel() + ", " + battery.getHoursIdle() + ", "
				+ battery.getHoursTalk() + "\nDisplay: " + display.getSize() + ", " + display.getNumberOfColors();
		return result;
	}

}

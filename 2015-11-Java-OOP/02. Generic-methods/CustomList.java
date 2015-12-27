import java.util.ArrayList;
import java.util.List;

public class CustomList<T> {
	private int size;
	List<T> customLi;

	public CustomList(int n) {
		customLi = new ArrayList<T>(n);
		size = n;
	}

	public void addElement(T element) {
		if (customLi.size() - ((customLi.size() * (1 / 4)) + 1) == customLi.indexOf(element)) {
			size = size * 2;
			T[] tempLi = (T[]) customLi.toArray();
			customLi = new ArrayList<T>(size);
			customLi.add((T) tempLi);
		}
		customLi.add(element);
	}

	public T accessElement(int index) {
		if (index > customLi.size()) {
			System.out.println("Invalid index");
			return null;
		}
		return customLi.get(index);
	}

	public void removeElement(int index) {
		if (index > customLi.size()) {
			System.out.println("Invalid index");
			return;
		}
		customLi.remove(index);
	}

	public void insertElement(int index, T element) {
		if (index > customLi.size()) {
			System.out.println("Invalid index");
			return;
		}
		customLi.add(index, element);
	}

	public void clearList() {
		customLi.clear();
	}

	public int findElement(T value) {
		return customLi.indexOf(value);
	}
	
	public int length() {
		return customLi.size();
	}

	@Override
	public String toString() {
		for (T t : customLi) {
			System.out.print(customLi.indexOf(t) + ":");
			System.out.println(t);
		}
		return "";
	}

	public <T extends Number> T Min() {
		Double min = ((Number) customLi.get(1)).doubleValue();
		for (int i = 1; i <= customLi.size(); i++) {
			Double current = ((Number) customLi.get(i)).doubleValue();
			if (current < min) {
				min = current;
			}
		}
		T rMin = (T) min;
		return rMin;

	}

	public <T extends Number> T Max() {
		Double max = ((Number) customLi.get(1)).doubleValue();
		for (int i = 1; i <= customLi.size(); i++) {
			Double current = ((Number) customLi.get(i)).doubleValue();
			if (current > max) {
				max = current;
			}
		}
		T rMax = (T) max;
		return rMax;
	}

}

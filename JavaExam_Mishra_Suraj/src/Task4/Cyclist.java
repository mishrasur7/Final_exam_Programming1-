package Task4;

public class Cyclist {
	private String name;
	private int weight;
	private int power;

	public Cyclist(String name, int weight, int power) {
		this.name = name;
		this.weight = weight;
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public int getPower() {
		return power;
	}

	public double getWattsPerKilo() {
		double wattsPerKilo = power / weight;
		return wattsPerKilo;
	}

}

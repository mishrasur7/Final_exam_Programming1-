package Task4;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class CyclistProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter name: ");
		String inputName = input.nextLine();

		ArrayList<Cyclist> cyclistList = new ArrayList<Cyclist>();
		int weight = 0;
		int power = 0;

		while (!inputName.isEmpty()) {
			System.out.print("Enter weight(kg): ");
			weight = Integer.parseInt(input.nextLine());
			System.out.print("Enter climbing power(w): ");
			power = Integer.parseInt(input.nextLine());
			cyclistList.add(new Cyclist(inputName, weight, power));
			System.out.print("Enter name: ");
			inputName = input.nextLine();

		}

		String heading = "=== Cyclist ===";
		System.out.println(heading);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		for (int i = 0; i < cyclistList.size(); i++) {
			System.out.println(cyclistList.get(i).getName() + ":" + cyclistList.get(i).getWeight() + " kg, "
					+ cyclistList.get(i).getPower() + " W " + "("
					+ twoDecimals.format(cyclistList.get(i).getWattsPerKilo()) + " w/kg)");
		}

		double sum = 0;
		for (int i = 0; i < cyclistList.size(); i++) {
			sum += cyclistList.get(i).getWattsPerKilo();
		}

		double average = sum / cyclistList.size();
		System.out.println("The average w/kg is " + average);

		System.out.println("===Fittest climber===");

		double maxFit = cyclistList.get(0).getWattsPerKilo();
		int maxFitIndex = 0;

		for (int i = 0; i < cyclistList.size(); i++) {
			if (cyclistList.get(i).getWattsPerKilo() > maxFit) {
				maxFit = cyclistList.get(i).getWattsPerKilo();
				maxFitIndex = i;
			}
		}

		System.out.println(cyclistList.get(maxFitIndex).getName() + " ( " + maxFit + " w/kg)");
		input.close();
	}

}

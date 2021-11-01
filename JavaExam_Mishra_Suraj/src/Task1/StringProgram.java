package Task1;

import java.util.Scanner;

public class StringProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String inputStr = input.nextLine();

		if (inputStr.isEmpty()) {
			System.out.println("No input!");
		} else {
			for (int i = 0; i < 1; i++) {
				for (int j = 0; j < inputStr.length(); j++) {
					System.out.print(inputStr.substring(i, inputStr.length() - j) + "\n");
				}

			}
		}
		input.close();

	}

}

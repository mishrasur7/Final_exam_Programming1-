package Task3;

import java.util.Scanner;

public class ISBNProgram {

	public static void main(String[] args) {
		ISBNTester tester = new ISBNTester();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ISBN: ");
		String isbnInput = input.nextLine();

		while (!isbnInput.equals("quit")) {

			if (ISBNTester.test(isbnInput) == true) {
				System.out.println("OK");
			} else {
				System.out.println("Not ok");
			}
			System.out.print("Enter ISBN: ");
			isbnInput = input.nextLine();

		}
		input.close();

	}

}

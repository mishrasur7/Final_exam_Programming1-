package Task3;

public class ISBNTester {

	public static boolean test(String isbn) {

		String regex = "(978)|(979)\\-[0-9]{1,5}\\-[?:0-9]{1,7}\\-[?:0-9]{1,6}\\-[0-9]{1}";

		if (isbn.length() == 13) {
			if (isbn.matches(regex) && isbn.length() == 13) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

}

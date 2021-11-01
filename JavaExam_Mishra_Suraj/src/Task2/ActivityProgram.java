package Task2;

public class ActivityProgram {
	public static void main(String[] args) {
		int[] firstActivities = { 3, 5, 1, 4, 4, 5, 5, 10, 3, 2, 1, 4 };
		int[] secondActivities = { 5, 5, 3, 4, 4, 5, 5, 8, 3, 2, 6, 4 };
		int[] thirdActivities = { 2, 5, 3, 4, 4, 9, 5, 6, 2, 2, 2, 1 };
		Year firstYear = new Year(1990, firstActivities);
		Year secondYear = new Year(2015, secondActivities);
		Year thirdYear = new Year(2020, thirdActivities);

		System.out.println(firstYear);
		System.out.println(secondYear);
		System.out.println(thirdYear);
	}
}

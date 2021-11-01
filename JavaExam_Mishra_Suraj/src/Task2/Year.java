package Task2;

public class Year {
	private int year;
	private int[] activities;

	public Year(int year, int[] activities) {
		this.year = year;
		this.activities = activities;
	}

	public int getYear() {
		return year;
	}

	public int[] getActivities() {
		return activities;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setActivities(int[] activities) {
		this.activities = activities;
	}

	public String toString() {
		String outPut = "";
		int totalActivities = 0;

		// let us consider these things to find out the max and min values
		int maxActivity = activities[0];
		int minActivity = activities[0];

		for (int i = 0; i < activities.length; i++) {
			totalActivities += activities[i];
			if (activities[i] > maxActivity) {
				maxActivity = activities[i];
			}

			if (activities[i] < minActivity) {
				minActivity = activities[i];
			}

		}

		outPut += year + ":" + totalActivities + " activities. " + minActivity + "-" + maxActivity
				+ " activities per month";
		return outPut;

	}

}

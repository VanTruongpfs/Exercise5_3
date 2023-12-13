package Exercise63;

public class Entry {
	private Date date;
	private double distance;
	private int duration;
	private String comment;
/**
 * this is a constructor of class Entry. There are 4 field
 * @param date
 * @param distance
 * @param duration
 * @param comment
 * example: 
 * 	new Entry(new Date(29, 11, 2023), 5.3, 27, "good");
*	new Entry(new Date(30, 11, 2023), 2.8, 24, "tired");
*	new Entry(new Date(31, 11, 2023), 26.2, 159, "exhausted");
 */
	public Entry(Date date, double distance, int duration, String comment) {
		this.date = date;
		this.distance = distance;
		this.duration = duration;
		this.comment = comment;
	}
/**
 * this is method toString
 */
	public String toString() {
		return "\nDate: " + date + "\ndistance: " + distance + "\nduration: " + duration + "\ncomment: " + comment + "\n\n";
}
/**
 * this is a method getDistance()
 * @return
 */
	public double getDistance() {
		return this.distance;
	}
/**
 * this is method sameMonthInYear()
 * @param month
 * @param year
 * @return
 * input: int month, int year
 * output: boolean
 *  
 */
	public boolean sameMonthInYear(int month, int year) {
		return this.date.sameMonthInYear(month, year);
	}
/**
 * this is a method totalDistance()
 * @return
 * input: int month, int year
 * output: double
 */
	public double totalDistance(int month, int year) {
		return this.distance;
	}
}

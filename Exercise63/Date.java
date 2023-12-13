package Exercise63;

public class Date {
	private int day;
	private int month;
	private int year;
/**
 * this is a constructor of class Date. There are 3 field
 * @param day
 * @param month
 * @param year
 *  example:
 *   new Date(29, 11, 2023);
 *   new Date(30, 11, 2023);
 *   new Date(31, 11, 2023);
 */
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
/**
 * this is method toString()
 */
	public String toString() {
		return  day + "/" + month + "/" + year;
}
/**
 * this is a method sameMonthInYear
 * @param that
 * @return
 * input: int month, int year
 * output: boolean
 */
	public boolean sameMonthInYear(int month, int year) {
		return this.month == month &&
				this.year == year;
	}
}

package Exercise63;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsLog implements ILog {
	private Entry first;
	private ILog rest;
/**
 * this is a constructor of class ConsLog. There are 2 field
 * @param first
 * @param rest
 */
	public ConsLog(Entry first, ILog rest) {
		this.first = first;
		this.rest = rest;
	}
/**
 * this is method isEmty()
 */
	public boolean isEmty() {
		return true;
	}
/**
 * this is a method toString()
 */
	public String toString() {
		return this.first.toString() + this.rest.toString();
	}
/**
 * this is a method miles()
 * example:
 * 	Entry e1 = new Entry(new Date(29, 11, 2023), 5.3, 27, "good");
	Entry e2 = new Entry(new Date(30, 11, 2023), 2.8, 24, "tired");
	Entry e3 = new Entry(new Date(31, 11, 2023), 26.2, 159, "exhausted");
	EmtyLog mt = new EmtyLog();
	ConsLog l3 = new ConsLog(e3, mt);
	ConsLog l2 = new ConsLog(e2, l3);
	ConsLog l1 = new ConsLog(e1, l2);
		assertEquals(l3.miles(), 26.2);
		assertEquals(l2.miles(), 29);
		assertEquals(l1.miles(), 34.3);
 */
	public double miles() {
		return this.first.getDistance() + this.rest.miles();
		}
/**
 * this ia method getLog()
 *	Entry e1 = new Entry(new Date(29, 10, 2023), 5.3, 27, "good");
	Entry e2 = new Entry(new Date(30, 11, 2023), 2.8, 24, "tired");
	Entry e3 = new Entry(new Date(31, 11, 2023), 26.2, 159, "exhausted");
	EmtyLog mt = new EmtyLog();
	ConsLog l3 = new ConsLog(e3, mt);
	ConsLog l2 = new ConsLog(e2, l3);
	ConsLog l1 = new ConsLog(e1, l2);
		assertEquals(l1.getLog(10, 2023), new ConsLog(e1, mt));
	input: int month, int year
	output: ILog
 */
	public ILog getLog(int month, int year) {
		if(this.first.sameMonthInYear(month, year)){
			return new ConsLog(this.first, this.rest.getLog(month, year));
		}else {
			return  this.rest.getLog(month, year);
		}
	}
/**
 * this is method totalDistance()
 * example:
 * 	Entry e1 = new Entry(new Date(29, 10, 2023), 5.3, 27, "good");
	Entry e2 = new Entry(new Date(30, 11, 2023), 2.8, 24, "tired");
	Entry e3 = new Entry(new Date(31, 11, 2023), 26.2, 159, "exhausted");
	EmtyLog mt = new EmtyLog();
	ConsLog l3 = new ConsLog(e3, mt);
	ConsLog l2 = new ConsLog(e2, l3);
	ConsLog l1 = new ConsLog(e1, l2);
		assertEquals(l3.totalDistance(11, 2023), 26.2);
		assertEquals(l2.totalDistance(11, 2023), 29);
		assertEquals(l1.totalDistance(11, 2023), 29);
	input: int month, int year
	output: double
 */
	public double totalDistance(int month, int year) {
		if(this.first.sameMonthInYear(month, year)) {
			return this.first.totalDistance(month, year)+this.rest.totalDistance(month, year);
		}else {
			return this.rest.totalDistance(month, year);
		}
	}
/**
 * this is a method equals
 */
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ConsLog)) {
			return false;
		}else {
			ConsLog that = (ConsLog) obj;
			return this.first.equals(that.first)
			&& this.rest.equals(that.rest);
		}
	}
}

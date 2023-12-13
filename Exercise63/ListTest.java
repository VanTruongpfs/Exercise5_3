package Exercise63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ListTest {
/**
 * this is testing for list log
 */
	@Test
	public void test() {
		Entry e1 = new Entry(new Date(29, 11, 2023), 5.3, 27, "good");
		Entry e2 = new Entry(new Date(30, 11, 2023), 2.8, 24, "tired");
		Entry e3 = new Entry(new Date(31, 11, 2023), 26.2, 159, "exhausted");
		
		EmtyLog mt = new EmtyLog();
		ConsLog l3 = new ConsLog(e3, mt);
		ConsLog l2 = new ConsLog(e2, l3);
		ConsLog l1 = new ConsLog(e1, l2);
		
		System.out.println("Log Entry List: \n"+l1);
	}
/**
 * this is testing for method miles()
 */
	@Test
	public void testMiles() {
		Entry e1 = new Entry(new Date(29, 11, 2023), 5.3, 27, "good");
		Entry e2 = new Entry(new Date(30, 11, 2023), 2.8, 24, "tired");
		Entry e3 = new Entry(new Date(31, 11, 2023), 26.2, 159, "exhausted");
		
		EmtyLog mt = new EmtyLog();
		ConsLog l3 = new ConsLog(e3, mt);
		ConsLog l2 = new ConsLog(e2, l3);
		ConsLog l1 = new ConsLog(e1, l2);
			assertEquals(l3.miles(), 26.2);
			assertEquals(l2.miles(), 29);
			assertEquals(l1.miles(), 34.3);
		
	}
/**
 * this is testing for method getLog()
 */
	@Test
	public void testGetLog() {
		Entry e1 = new Entry(new Date(29, 10, 2023), 5.3, 27, "good");
		Entry e2 = new Entry(new Date(30, 11, 2023), 2.8, 24, "tired");
		Entry e3 = new Entry(new Date(31, 11, 2023), 26.2, 159, "exhausted");
		EmtyLog mt = new EmtyLog();
		ConsLog l3 = new ConsLog(e3, mt);
		ConsLog l2 = new ConsLog(e2, l3);
		ConsLog l1 = new ConsLog(e1, l2);
			assertEquals(l1.getLog(10, 2023), new ConsLog(e1, mt));
			System.out.println(l1.getLog(10, 2023));
		
}
/**
 * this is testing for method totalDistance()
 */
	@Test
	public void testTotalDistance() {
		Entry e1 = new Entry(new Date(29, 10, 2023), 5.3, 27, "good");
		Entry e2 = new Entry(new Date(30, 11, 2023), 2.8, 24, "tired");
		Entry e3 = new Entry(new Date(31, 11, 2023), 26.2, 159, "exhausted");
		EmtyLog mt = new EmtyLog();
		ConsLog l3 = new ConsLog(e3, mt);
		ConsLog l2 = new ConsLog(e2, l3);
		ConsLog l1 = new ConsLog(e1, l2);
			assertEquals(l3.totalDistance(11, 2023), 26.2);
			assertEquals(l2.totalDistance(11, 2023), 29);
			assertEquals(l1.totalDistance(11, 2023), 29);
		
	}
}

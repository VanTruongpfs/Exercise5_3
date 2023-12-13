package Exercise61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ListTest {
/**
 * this is testing for list toy
 */
	@Test
	public void testList() {
		Toy t1 = new Toy("doll", 17.95, 5);
		Toy t2 = new Toy("robot", 22.05, 3);
		Toy t3 = new Toy("gun", 15, 4);
		
		EmtyList mt = new EmtyList();
		ConsList l3 = new ConsList(t3, mt);
		ConsList l2 = new ConsList(t2, l3);
		ConsList l1 = new ConsList(t1, l2);
		
		System.out.println("List Toy: \n"+l1);
	}
/**
 * this is testing for method contains()
 */
	@Test
	public void testContains() {
		new Toy("doll", 17.95, 5);
		new Toy("robot", 22.05, 3);
		new Toy("gun", 15, 4);
		Toy t1 = new Toy("doll", 17.95, 5);
		Toy t2 = new Toy("robot", 22.05, 3);
		Toy t3 = new Toy("gun", 15, 4);
		  EmtyList mt = new EmtyList();
		 ConsList l3 = new ConsList(t3, mt);
		 ConsList l2 = new ConsList(t2, l3);
		 ConsList l1 = new ConsList(t1, l2);
		 	assertFalse(mt.contains("doll"));
		 	assertTrue(l1.contains("doll"));
		   	assertFalse(l2.contains("doll"));
		   	assertTrue(l3.contains("gun"));
	}
/**
 * this is testing for method isBelow()
 */
	@Test
	public void testIsBelow() {
		new Toy("doll", 17.95, 5);
		new Toy("robot", 22.05, 3);
		new Toy("gun", 15, 4);
		 Toy t1 = new Toy("doll", 17.95, 5);
		 Toy t2 = new Toy("robot", 22.05, 3);
		 Toy t3 = new Toy("gun", 15, 4);
		  EmtyList mt = new EmtyList();
		  ConsList l3 = new ConsList(t3, mt);
		  ConsList l2 = new ConsList(t2, l3);
		  ConsList l1 = new ConsList(t1, l2);
		 	assertTrue(l1.isBelow(30));
		 	assertFalse(l1.isBelow(12));
	}
/**
 * this is testing for method howMany()
 */
	@Test
	public void testHowMany() {
		new Toy("doll", 17.95, 5);
		new Toy("robot", 22.05, 3);
		new Toy("gun", 15, 4);
		 Toy t1 = new Toy("doll", 17.95, 5);
		 Toy t2 = new Toy("robot", 22.05, 3);
		 Toy t3 = new Toy("gun", 15, 4);
		  EmtyList mt = new EmtyList();
		  ConsList l3 = new ConsList(t3, mt);
		  ConsList l2 = new ConsList(t2, l3);
		  ConsList l1 = new ConsList(t1, l2);
		  	assertEquals(mt.howMany(), 0);
		  	assertEquals(l1.howMany(), 12);
		  	assertEquals(l2.howMany(), 7);
		  	assertEquals(l3.howMany(), 4);
	}
/**
 * this is testing for method raisePrice()
 */
	@Test
	public void testRaisePrice() {
	new Toy("doll", 17.95, 5);
	new Toy("robot", 22.05, 3);
	new Toy("gun", 15, 4);
	 Toy t1 = new Toy("doll", 17.95, 5);
	 Toy t2 = new Toy("robot", 22.05, 3);
	 Toy t3 = new Toy("gun", 15, 4);
	 		assertEquals(t1.raisePrice(0.05),new Toy("doll", 18.8475, 5));
	  		assertEquals(t2.raisePrice(0.05),new Toy("robot", 23.152500000000003, 3));
			assertEquals(t3.raisePrice(0.05),new Toy("gun", 15.75, 4));
	  EmtyList mt = new EmtyList();
	  ConsList l3 = new ConsList(t3, mt);
	  ConsList l2 = new ConsList(t2, l3);
	  ConsList l1 = new ConsList(t1, l2);
	  
	  assertEquals(mt.raisePrice(0.05), new EmtyList());
	  System.out.println("\nList toys raise price: " + l1.raisePrice(0.05));
	}
/**
 * this is testing for method totalPrice
 */
	@Test
	public void testTotalPrice() {
		new Toy("doll", 17.95, 5);
		new Toy("robot", 22.05, 3);
		new Toy("gun", 15, 4);
	    Toy t1 = new Toy("doll", 17.95, 5);
	 	Toy t2 = new Toy("robot", 22.05, 3);
		Toy t3 = new Toy("gun", 15, 4);
		 EmtyList mt = new EmtyList();
	 	 ConsList l3 = new ConsList(t3, mt);
		 ConsList l2 = new ConsList(t2, l3);
		 ConsList l1 = new ConsList(t1, l2);
			assertEquals(l1.totalPrice(),55);
		 
	}
/**
 * this is testing for method averagePrice()
 */
	@Test
	public void testAveragePrice() {
		new Toy("doll", 17.95, 5);
		new Toy("robot", 22.05, 3);
		new Toy("gun", 15, 4);
	    Toy t1 = new Toy("doll", 17.95, 5);
	 	Toy t2 = new Toy("robot", 22.05, 3);
		Toy t3 = new Toy("gun", 15, 4);
		 EmtyList mt = new EmtyList();
	 	 ConsList l3 = new ConsList(t3, mt);
		 ConsList l2 = new ConsList(t2, l3);
		 ConsList l1 = new ConsList(t1, l2);
		  	assertEquals(l1.averagePrice(3), 18.33, 0.01);
	}
/**
 * this is testing for method replaceName
 */
	@Test
	public void testReplaceName() {
		new Toy("doll", 17.95, 5);
		new Toy("robot", 22.05, 3);
		new Toy("gun", 15, 4);
		Toy t1 = new Toy("doll", 17.95, 5);
		Toy t2 = new Toy("robot", 22.05, 3);
		Toy t3 = new Toy("gun", 15, 4);
		EmtyList mt = new EmtyList();
		ConsList l3 = new ConsList(t3, mt);
		ConsList l2 = new ConsList(t2, l3);
		ConsList l1 = new ConsList(t1, l2);
		assertEquals(l1.replaceName(), new ConsList(new Toy("r2d2", 17.95, 5), l2));
		System.out.println("List replace" +l1.replaceName());
	}
/**
 * this is testing for method eliminate()
 */
	@Test
	public void testEliminate() {
		new Toy("doll", 17.95, 5);
		new Toy("robot", 22.05, 3);
		new Toy("gun", 15, 4);
		Toy t1 = new Toy("doll", 17.95, 5);
		Toy t2 = new Toy("robot", 22.05, 3);
		Toy t3 = new Toy("gun", 15, 4);
		EmtyList mt = new EmtyList();
		ConsList l3 = new ConsList(t3, mt);
		ConsList l2 = new ConsList(t2, l3);
		ConsList l1 = new ConsList(t1, l2);
		assertEquals(l1.eliminate("gun"), new ConsList(t1,new ConsList(t2,mt)));
		assertEquals(l1.eliminate("robot"), new ConsList(t1,new ConsList(t3,mt)));
		assertEquals(l1.eliminate("doll"), new ConsList(t2,new ConsList(t3,mt)));
		System.out.println(l1.eliminate("doll"));
	}
	
	
}
	

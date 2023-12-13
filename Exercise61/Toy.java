package Exercise61;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Toy {
	private String name;
	private double price;
	private int available;
/**
 * this is a constructor of class Toy. There are 3 field
 * @param name
 * @param price
 * @param available
 * example:
 * 	new Toy("doll", 17.95, 5);
 * 	new Toy("robot", 22.05, 3);
 * 	new Toy("gun", 15, 4);
 */
	public Toy(String name, double price, int available) {
		this.name = name;
		this.price = price;
		this.available = available;
	}
/**
 * this is method toString()
 */
@Override
	public String toString() {
		return "\nname: " + name + ", price: " + price + ", available: " + available + "\n";
}
/**
 * this is a method contains() of class Toy
 * @param toyName
 * @return
 * example:
 * 	new Toy("doll", 17.95, 5);
 * 	new Toy("robot", 22.05, 3);
 * 	new Toy("gun", 15, 4);
 *  Toy t1 = new Toy("doll", 17.95, 5);
 * 	Toy t2 = new Toy("robot", 22.05, 3);
 * 	Toy t3 = new Toy("gun", 15, 4);
 * 		assertTrue(t1.contains("doll"));
 * 		assertTrue(t2.contains("robot"));
 * 		assertTrue(t3.contains("gun"));
 */
	public boolean contains(String toyName) {
		if(this.name.equals(toyName)) {
			return true;
		}else {
			return false;
		}
	}
/**
 * this is method isBelow of class Toy
 * @param amount
 * @return
 * example:
 * 	new Toy("doll", 17.95, 5);
 * 	new Toy("robot", 22.05, 3);
 * 	new Toy("gun", 15, 4);
 *  Toy t1 = new Toy("doll", 17.95, 5);
 * 	Toy t2 = new Toy("robot", 22.05, 3);
 * 	Toy t3 = new Toy("gun", 15, 4);
 * 		assertTrue(t1.isBelow(30));
 * 		assertTrue(t2.isBelow(30));
 * 		assertTrue(t3.isBelow(30));
 */
	public boolean isBelow(int amount) {
		return this.price < amount;
	}
/**
 * this is a method howMany() of class toy
 * @return
 * example:
 *	 new Toy("doll", 17.95, 5);
 *	 new Toy("robot", 22.05, 3);
 * 	 new Toy("gun", 15, 4);
 *   Toy t1 = new Toy("doll", 17.95, 5);
 *   Toy t2 = new Toy("robot", 22.05, 3);
 * 	 Toy t3 = new Toy("gun", 15, 4);
 * 		assertEquals(mt.howMany(), 0);
*	  	assertEquals(l1.howMany(), 12);
*	  	assertEquals(l2.howMany(), 7);
*  		assertEquals(l3.howMany(), 4);
 */
	public int howMany() {
		return this.available;
	}
/**
 * this is a method raisePrice()
 * @param rate
 * @return
 * example:
 * 	 new Toy("doll", 17.95, 5);
 *	 new Toy("robot", 22.05, 3);
 * 	 new Toy("gun", 15, 4);
 *    Toy t1 = new Toy("doll", 17.95, 5);
 *    Toy t2 = new Toy("robot", 22.05, 3);
 * 	  Toy t3 = new Toy("gun", 15, 4);
 * 		assertEquals(t1.raisePrice(0.05),new Toy("doll", 18.8475, 5));
 * 		assertEquals(t2.raisePrice(0.05),new Toy("robot", 23.1525, 3));
 * 		assertEquals(t3.raisePrice(0.05),new Toy("gun", 15,75, 4));
 * 	
 */
	public Toy raisePrice(double rate) {
		return new Toy(this.name, this.price *(1+rate), this.available);
	}
/**
 * this is method unitPrice
 */
	public double unitPrice() {
		return this.price;
	}
/**
 * this is emthod replaceName
 * @return
 * 	new Toy("doll", 17.95, 5);
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
 */
	public Toy replaceName() {
		return new Toy("r2d2", this.price, this.available);
	}
/**
 * this is method getName
 * @return
 */
	public String getName() {
		return this.name;
	}
/**
 * this is method equals()
 */
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Toy)) {
			return false;
		}else {
			Toy that = (Toy) obj;
			return this.name.equals(that.name) &&
					this.price == that.price &&
					this.available == that.available;
		}
	}
	
}

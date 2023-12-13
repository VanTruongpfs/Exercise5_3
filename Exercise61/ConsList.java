package Exercise61;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsList implements Inventory {
	private Toy first;
	private Inventory rest;
/**
 * this is a constructor of class ConsList. There are 2 field
 * @param first
 * @param rest
 */
	public ConsList(Toy first, Inventory rest) {
		this.first = first;
		this.rest = rest;
	}
/**
 * this is method isEmty()
 */
	public boolean isEmty() {
		return false;
	}
/**
 * this is method toString()
 */
	public String toString() {
		return this.first.toString() + this.rest.toString();
	}
/**
 * this is method contains() of class Conslist
 * @param toyName
 * @return
 *  example:
 *  new Toy("doll", 17.95, 5);
 * 	new Toy("robot", 22.05, 3);
 * 	new Toy("gun", 15, 4);
 *  Toy t1 = new Toy("doll", 17.95, 5);
 * 	Toy t2 = new Toy("robot", 22.05, 3);
 * 	Toy t3 = new Toy("gun", 15, 4);
 * 	 EmtyList mt = new EmtyList();
 * 	 ConsList l3 = new ConsList(t3, mt);
 * 	 ConsList l2 = new ConsList(t2, l3);
 * 	 ConsList l1 = new ConsList(t1, l2);
 *   	assertTrue(l1.contains("doll"));
 *   	assertFalse(l2.contains("doll"));
 *   	assertTrue(l3.contains("gun"));
 * 
 */
	public boolean contains(String toyName) {
		return this.first.contains(toyName) || this.rest.contains(toyName);
	}
/**
 * this is a method isBelow()
 * example:
 *  new Toy("doll", 17.95, 5);
 * 	new Toy("robot", 22.05, 3);
 * 	new Toy("gun", 15, 4);
 *  Toy t1 = new Toy("doll", 17.95, 5);
 * 	Toy t2 = new Toy("robot", 22.05, 3);
 * 	Toy t3 = new Toy("gun", 15, 4);
 * 	 EmtyList mt = new EmtyList();
 * 	 ConsList l3 = new ConsList(t3, mt);
 * 	 ConsList l2 = new ConsList(t2, l3);
 * 	 ConsList l1 = new ConsList(t1, l2);
 * 		assertTrue(l1.isBelow(30));
 * 		assertFalse(l1.isBelow(12));
 * 
 */
	public boolean isBelow(int amount) {
		return this.first.isBelow(amount) && this.rest.isBelow(amount);
		
	}
/**
 * this is method howMany()
 * example:
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
		  assertEquals(mt.howMany(), 0);
		  assertEquals(l1.howMany(), 12);
		assertEquals(l2.howMany(), 7);
		  assertEquals(l3.howMany(), 4);
 */
	public int howMany() {
		if (this.rest == null) {
			return 0;
		}else {
			return this.first.howMany()+this.rest.howMany();
			}
	}
/**
 * this is a method raisePrice()
 * example
	new Toy("doll", 17.95, 5);
 * 	new Toy("robot", 22.05, 3);
 * 	new Toy("gun", 15, 4);
 *  Toy t1 = new Toy("doll", 17.95, 5);
 * 	Toy t2 = new Toy("robot", 22.05, 3);
 * 	Toy t3 = new Toy("gun", 15, 4);
 * 	 EmtyList mt = new EmtyList();
 * 	 ConsList l3 = new ConsList(t3, mt);
 * 	 ConsList l2 = new ConsList(t2, l3);
 * 	 ConsList l1 = new ConsList(t1, l2);
 * 
 * 		
 */
	public ConsList raisePrice(double rate) {
		return new ConsList(this.first.raisePrice(rate), this.rest.raisePrice(rate));
	}
/**
 * this is method totalPrice()
 * example:
 * new Toy("doll", 17.95, 5);
 * 	new Toy("robot", 22.05, 3);
 * 	new Toy("gun", 15, 4);
 *  Toy t1 = new Toy("doll", 17.95, 5);
 * 	Toy t2 = new Toy("robot", 22.05, 3);
 * 	Toy t3 = new Toy("gun", 15, 4);
 * 	 EmtyList mt = new EmtyList();
 * 	 ConsList l3 = new ConsList(t3, mt);
 * 	 ConsList l2 = new ConsList(t2, l3);
 * 	 ConsList l1 = new ConsList(t1, l2);
 * 		assertEquals(l1.totalPrice(),54.4);
 *  
 */
	public double totalPrice() {
		return this.first.unitPrice() + this.rest.totalPrice();
	}
/**
 * this is a method averagePrice()
 * example:
 * new Toy("doll", 17.95, 5);
*	new Toy("robot", 22.05, 3);
*	new Toy("gun", 15, 4);
*   Toy t1 = new Toy("doll", 17.95, 5);
*	Toy t2 = new Toy("robot", 22.05, 3);
* 	Toy t3 = new Toy("gun", 15, 4);
*	 	EmtyList mt = new EmtyList();
*		ConsList l3 = new ConsList(t3, mt);
* 		ConsList l2 = new ConsList(t2, l3);
*   	ConsList l1 = new ConsList(t1, l2);
*		assertEquals(l1.averagePrice(3), 18.33, 0.01);
 */
	public double averagePrice(int quantity) {
		return this.totalPrice()/quantity;
	}
/**
 * this is method replaceName()
 * example:
 *  new Toy("doll", 17.95, 5);
*	new Toy("robot", 22.05, 3);
*	new Toy("gun", 15, 4);
*   Toy t1 = new Toy("doll", 17.95, 5);
*	Toy t2 = new Toy("robot", 22.05, 3);
* 	Toy t3 = new Toy("gun", 15, 4);
*	 	EmtyList mt = new EmtyList();
*		ConsList l3 = new ConsList(t3, mt);
* 		ConsList l2 = new ConsList(t2, l3);
*   	ConsList l1 = new ConsList(t1, l2);
 */
	public ConsList replaceName() {
		if(this.first.getName() == "doll") {
			return new ConsList(this.first.replaceName(), this.rest);
		}else {
			return new ConsList(this.first, this.rest.replaceName());
		}
	}
/**
 * this is method eliminate() of class ConList
 * example:
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
		assertEquals(l1.eliminate("gun"), new ConsList(t1,new ConsList(t2,mt)));
		assertEquals(l1.eliminate("robot"), new ConsList(t1,new ConsList(t3,mt)));
		assertEquals(l1.eliminate("doll"), new ConsList(t2,new ConsList(t3,mt)));
		 System.out.println(l1.eliminate("doll"));
 */
	public Inventory eliminate(String toyOfName) {
		if(this.first.getName().equals(toyOfName)) {
			return this.rest.eliminate(toyOfName);
		}else{
			return new ConsList(this.first, this.rest.eliminate(toyOfName));
		}
	}
/**
 * this is a method equals of class ConsList
 */
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof ConsList)) {
			return false;
		}else {
			ConsList that = (ConsList) obj;
			return this.first.equals(that.first)&&
					this.rest.equals(that.rest);
		}
	}
 
}
	
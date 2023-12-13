package Exercise62;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsPhone implements IPhone{
	private Phone first;
	private IPhone rest;
/**
 * this is a constructor of class ConsPhone. There are 2 field
 * @param first
 * @param rest
 */
	public ConsPhone(Phone first, IPhone rest) {
		this.first = first;
		this.rest = rest;
	}
/**
 * this is method toString
 */
	public String toString() {
		return this.first.toString()+this.rest.toString();
	}
/**
 * this is method whoseNumebr()
 * 	new Phone(987654321, "Truong");
	new Phone(987654322, "Huy");
	new Phone(987654323, "Anh");
	Phone p1 = new Phone(987654321, "Truong");
	Phone p2 = new Phone(987654322, "Huy");
	Phone p3 = new Phone(987654323, "Anh");
	MTPhone mt = new MTPhone();
	ConsPhone l3 = new ConsPhone(p3, mt);
	ConsPhone l2 = new ConsPhone(p2, l3);
	ConsPhone l1 = new ConsPhone(p1, l2);
		assertEquals(l3.whoseNumber("Anh"), new ConsPhone(p3, mt));
		assertEquals(l2.whoseNumber("Huy"), new ConsPhone(p2, mt));
		assertEquals(l1.whoseNumber("Truong"), new ConsPhone(p1, mt));
	input: String name
	output: Iphone
 */
	public IPhone whoseNumber(String name) {
		if(this.first.sameName().equals(name)) {
			return new ConsPhone(this.first, new MTPhone());
		}else {
			return this.rest.whoseNumber(name);
		}
	}
/**
 * this is method phoneNumber
 * example:
 * 	new Phone(987654321, "Truong");
	new Phone(987654322, "Huy");
	new Phone(987654323, "Anh");
	Phone p1 = new Phone(987654321, "Truong");
	Phone p2 = new Phone(987654322, "Huy");
	Phone p3 = new Phone(987654323, "Anh");
	MTPhone mt = new MTPhone();
	ConsPhone l3 = new ConsPhone(p3, mt);
	ConsPhone l2 = new ConsPhone(p2, l3);
	ConsPhone l1 = new ConsPhone(p1, l2);
		assertEquals(l3.phoneNumber(987654323), new ConsPhone(p3, mt));
		assertEquals(l2.phoneNumber(987654322), new ConsPhone(p2, mt));
		assertEquals(l1.phoneNumber(987654321), new ConsPhone(p1, mt));
	input: int number
	output: Iphone
 */
	public IPhone phoneNumber(int number) {
		if(this.first.sameNumber() == number) {
			return new ConsPhone(this.first, new MTPhone()); 
		}else {
			return this.rest.phoneNumber(number);
			}
		}
/**
 * this is method equals()
 */
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof ConsPhone)) {
			return false;
		}else {
			ConsPhone that = (ConsPhone) obj;
			return this.first.equals(that.first)&&
					this.rest.equals(that.rest);
		}
	}
}

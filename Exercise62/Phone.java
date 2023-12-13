package Exercise62;

public class Phone {
	private int number;
	private String name;
/**
 * this is a constructor of class Phone. There are 2 field
 * @param number
 * @param name
 * example:
 * 	new Phone(0987654321, "Truong");
 * 	new Phone(0987654322, "Huy");
 * 	new Phone(0987654323, "Anh");
 */
	public Phone(int number, String name) {
		this.number = number;
		this.name = name;
	}
/**
 * this is method sameName() use to get name from first
 */
	public String sameName() {
		return this.name;
	}
/**
 * this is method sameNumber() use to get number from first
 * @return
 */
	public int sameNumber() {
		return this.number;
	}
/**
 * this is method toString
 */
	@Override
	public String toString() {
		return "Phone [number=" + number + ", name=" + name + "]";
	}
/**
 * this is method equals()
 */
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Phone)) {
			return false;
		}else {
			Phone that = (Phone) obj;
			return this.number == (that.number) &&
					this.name.equals(that.name);
		}
	}
}

package Exercise61;

public class EmtyList implements Inventory {
/**
 * this is method isEmty()
 */
	public boolean isEmty() {
		return true;
	}
/**
 * this is method toString()
 */
	public String toString() {
		return "\nEmty List[]";
	}
/**
 * this is a method contains() of class EmtyList
 */
	public boolean contains(String toyName) {
		return false;
	}
/**
 * this is method isBelow()
 * @return
 */
	public boolean isBelow(int amount) {
		return true;
	}
/**
 * this is method howMany()
 */
	public int howMany() {
		return 0;
	}
/**
 * this is method raisePrice()
 * @return
 */
	public EmtyList raisePrice(double rate) {
		return new EmtyList();
	}
/**
 * this is method totalPrice()
 */
	public double totalPrice() {
		return 0;
	}
/**
 * this is method averagePrice()
 * input : int quantity
 * output: double
 */
	public double averagePrice(int quantity) {
		return 0;
	}
/**
 * this is method replaceName
 */
	public EmtyList replaceName() {
		return new EmtyList();
	}
/**
 * this is method EmtyList()
 * @param toyOfName
 * @return
 */
	public EmtyList eliminate(String toyOfName) {
		return new EmtyList();
	}
/**
 * this is method equals()
 */
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof EmtyList)) {
			return false;
		}else {
			return true;
		}
			
	}
}
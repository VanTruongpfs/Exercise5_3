package Exercise62;

public class MTPhone implements IPhone{
/**
 * this is method toString()
 */
	public String toString() {
		return "MTPhone []";
	}
/**
 * this is method whoseNumber of Class MTPhone
 * input: String name
 * output: MTPhone
 */
	public MTPhone whoseNumber(String name) {
		return new MTPhone();
	}
/**
 * this is a method phoneNumber of class MTPhone
 * input: int number
 * output: MTPhone
 */
	public MTPhone phoneNumber(int number) {
		return new MTPhone();
	}
/**
 * this is method equals
 */
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof MTPhone)) {
			return false;
		}else {
			MTPhone that = (MTPhone) obj;
			return true;
		}
	}
}

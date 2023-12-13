package Exercise63;

public class EmtyLog implements ILog {
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
 * this is method miles()
 */
	public double miles() {
		return 0;
	}
/**
 * this is method getLog
 */
	public EmtyLog getLog(int month, int year) {
		return new EmtyLog();
	}
/**
 * this is method totalDistance
 */
	public double totalDistance(int month, int year) {
		return 0;
	}
/**
 * this is method equals
 */
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof EmtyLog)){
			return false;
		}else{
			return true;
		}
	}
}

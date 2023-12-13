package Exercise64;

public class CartPt {
	private int x;
	private int y;
/**
 * this is a constructor of class CartPt. There are 4 field
 * @param x
 * @param y
 * example:
 * 	new CartPt(3,4);
 * 	new CartPt(6,8);
 * 	new CartPt(2,3);
 */
	public CartPt(int x, int y) {
		this.x = x;
		this.y = y;
	}
/**
 * this is method toString()
 */
	public String toString() {
		return  x + "," +y;
}
/**
 * this is method getX()
 * @return
 */
	public int getX() {
		return this.x;
	}
/**
 * this is method getY()
 * @return
 */
    public int getY() {
	  return this.y;
	  
 }
//translate this point to deltaX, deltaY distance
	 	public CartPt translate(int dX, int dY) {
	 		return new CartPt(this.x + dX, this.y + dY);
		
	}
	 	public boolean equals(Object obj) {
	 		if(obj == null || !(obj instanceof CartPt )){
	 			return false;
	 		}else {
	 			CartPt that = (CartPt) obj;
	 			return this.x==that.x &&
	 					this.y==that.y;
	 		}
	 	}
}

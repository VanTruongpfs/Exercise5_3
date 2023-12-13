package Exercise64;

public class Square extends ASingleShape{
	private int size;
/**
 * this is a constructor of class Square. There are 2 field
 * @param location
 * @param size
 * example:
 * 	new Square(new CartPt(3,4),2);
 * 	new Square(new CartPt(6,8),3);
 * 	new Square(new CartPt(2,3),4);
 */
		public Square(CartPt location, int size) {
			super(location);
			this.size = size;
		}
/**
 * this is method toString()
 */
	public String toString() {
		return "Square size: " + size + " Location("+ this.location + ")\n";
}
/**
 * this is method within()
 */
	public boolean within(CartPt Point) {
		if(Point.getX() >= this.location.getX() &&
			Point.getX() <= this.location.getX()+this.size &&
			Point.getY() >= this.location.getY() &&
			Point.getY() <= this.location.getY()+this.size) {
		return true;
		}else {
			return false;
		}
	}
/**
 * this is a method boundingBox() of class Square
 * @return
 * example:
* 	new Square(new CartPt(3,4),2);
 * 	new Square(new CartPt(6,8),3);
 * 	new Square(new CartPt(2,3),4);
 * 	Square s1 = new Square(new CartPt(3,4),2);
 * 	Square s2 = new Square(new CartPt(6,8),3);
* 	Square s3 = new Square(new CartPt(2,3),4);
 * 		assertEquals(s1.boundingBox(),new Square(new CartPt(3,4),2));
*		assertEquals(s2.boundingBox(),new Square(new CartPt(6,8),3));
*		assertEquals(s3.boundingBox(),new Square(new CartPt(2,3),4));
*/
	public Square boundingBox(){
		return new Square(this.location,this.size);
	}
@Override
public boolean equals(Object obj) {
	if(obj == null || !(obj instanceof Square)) {
		return false;
	}else {
		Square that = (Square) obj;
		return this.location.equals(that.location)&&
				this.size == that.size;
	}
	}
	
}

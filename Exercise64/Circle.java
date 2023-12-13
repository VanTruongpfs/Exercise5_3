package Exercise64;

public class Circle extends ASingleShape{
	private int radius;
/**
 * this is a constructor of class Circle. There are 2 field
 * @param location
 * @param radius
  * example:
 * 	 new Circle(new CartPt(3,4),1);
 * 	 new Circle(new CartPt(6,8),2);
 * 	 new Circle(new CartPt(2,3),3);
 */
	public Circle(CartPt location, int radius) {
		super(location);
		this.radius = radius;
	}
/**
 * this is method toString()
 */
	public String toString() {
		return "Circle radius: " + radius + " Location("+this.location +")\n";
}
/**
 * this is method within()
 */
	public boolean within(CartPt Point) {
		if(Point.getX() >= this.location.getX() &&
			Point.getX() <= this.location.getX()+this.radius &&
			Point.getY() >= this.location.getY() &&
			Point.getY() <= this.location.getY()+this.radius) {
		return true;
		}else {
			return false;
		}
	}
	/**
	 * this is a method boundingBox() of class Circle
* @return
* example:
 * 	 new Circle(new CartPt(3,4),1);
 * 	 new Circle(new CartPt(6,8),2);
 * 	 new Circle(new CartPt(2,3),3);
* 	  Circle c1 = new Circle(new CartPt(3,4),1);
  	  Circle c2 = new Circle(new CartPt(6,8),2);	
 * 	  Circle c3 = new Circle(new CartPt(2,3),3);
 * 		assertEquals(c1.boundingBox(),new Square(new CartPt(2,3),2));
*		assertEquals(c2.boundingBox(),new Square(new CartPt(4,6),4));
*		assertEquals(c3.boundingBox(),new Square(new CartPt(-1,0),6));
*/
	public Square boundingBox() {
		return new Square(this.location.translate(-this.radius, -this.radius),this.radius*2);
	}
}

package Exercise64;

public class Dot extends ASingleShape{
/**
 * this is a constructor of class Dot. There are 1 field
 * @param location
 * example:
 *  new Dot(new CartPt(3,4));
 * new Dot(new CartPt(6,8));
 *  new Dot(new CartPt(2,3));
 */
		public Dot(CartPt location) {
			super(location);
		}
/**
 * this is method within()
 */
		public boolean within(CartPt Point) {
			if( this.location.getX() == Point.getX() && this.location.getY() == Point.getY()) {
				return true;
			}else {
				return false;
			}
			
		}
/**
 * this is method boudingBox of class Dot
 * @return
 * example:
 * new Dot(new CartPt(3,4));
*  new Dot(new CartPt(6,8));
*  new Dot(new CartPt(2,3));
*   Dot d1 =  new Dot(new CartPt(3,4));
*   Dot d2 =  new Dot(new CartPt(6,8));
*   Dot d3 =  new Dot(new CartPt(2,3));
*    assertEquals(d1.boundingBox(),new Square(new CartPt(3,4),0));
*	 assertEquals(d2.boundingBox(),new Square(new CartPt(6,8),0));
*	 assertEquals(d3.boundingBox(),new Square(new CartPt(2,3),0));
 */
		public Square boundingBox() {
			return new Square(this.location, 0);
		}
		
}

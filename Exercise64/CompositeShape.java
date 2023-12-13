package Exercise64;

public class CompositeShape implements IShape {
	private IShape top;
	private IShape bottom;
/**
 * this is a constructor of class CompositeShape. There are 2 field
 * @param top
 * @param bottom
 */
	public CompositeShape(IShape top, IShape bottom) {
		this.top = top;
		this.bottom = bottom;
	}
/**
 * this is method toString()
 */
	public String toString() {
		return this.top.toString() + this.bottom.toString();
	}
/**
 * this is method within()
 */
	public boolean within(CartPt Point) {
		if(this.top.within(Point)) {
			return true;
		}else if(this.bottom.within(Point)) {
			return true;
		}else {
			return false;
		}
	}
  public IShape boudingBox() {
	  return this.top.boundingBox();
  }
	
}

package Exercise64;

public abstract class ASingleShape implements IShape{
	protected CartPt location;
/**
 * this is a constructor of class ASingleShape. There is a field
 * @param location
 */
	public ASingleShape(CartPt location) {
		this.location = location;
	}
/**
 * this is method toString()
 */
	public String toString() {
		return "ASingleShape location=" + location ;
}
	public abstract Square boundingBox();
}

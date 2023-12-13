package Exercise64;

public interface IShape {
	public String toString();
	public boolean within(CartPt Point);
	public Square boundingBox(); 

}

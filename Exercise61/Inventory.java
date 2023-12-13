package Exercise61;

public interface Inventory {
	public boolean isEmty();
	public String toString();
	public boolean contains(String toyName);
	public boolean isBelow(int amount) ;
	public int howMany();
	public Inventory raisePrice(double rate);
	public double totalPrice();
	public double averagePrice(int quantity);
	public Inventory replaceName();
	public Inventory eliminate(String EmtyList);
}

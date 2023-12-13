package Exercise63;

public interface ILog {
	public boolean isEmty();
	public String toString();
	public double miles(); 
	public ILog getLog(int month, int year);
	public double totalDistance(int month, int year);
}

package Assignment_2;

public class Flight  {
	
	private char plane_class;
	private String destination;
	private String Origin;
	private short Date;
	//Aggregation
	public Passenger passenger;
	//Setter
	public void setPlane_class(char pc) {
		plane_class=pc;
	}
	public void setDestination(String dest) {
		this.destination=dest;
	}
	public void setOrigin(String origin) {
		this.Origin=origin;
	}
	public void setDate(short date) {
		this.Date=date;
	}
}

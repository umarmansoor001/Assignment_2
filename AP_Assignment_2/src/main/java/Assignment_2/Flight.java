package Assignment_2;

public class Flight  {
	
	private char plane_class;
	private String destination;
	private String Origin;
	private String dep_time;
	private String day;
	private String plane_code;
	private int date;
	private int duration;
	private String Flight_code;
	//Aggregation
	public Passenger passenger;
	//Setter
	public void setPlane_class(char pc) {
		plane_class=pc;
	}
	public void setday(String day) {
		this.day=day;
	}
	public void setDestination(String dest) {
		this.destination=dest;
	}
	public void setOrigin(String origin) {
		this.Origin=origin;
	}
	public void setDate(int date) {
		this.date=date;
	}
	public void setFlight_code(String fc) {
		this.Flight_code=fc;
	}
	public void setDeptime(String deptime) {
		dep_time=deptime;
	}
	public void setPlane_code(String pc) {
		plane_code=pc;
	}
	public void setDuration(int duration) {
		this.duration=duration;
	}
	public void display()
	{
		System.out.println(destination+Origin+duration+date);
	}
}

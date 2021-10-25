package Assignment_2;

public class Passenger {

	private String Name;
	private char Gender;
	private int Age;
	private String Address;
	private int passport_no;//9 digit number
	
	//Aggregation
	private Flight passenger_flight;
	
	//parameterized
	Passenger()
	{
		passenger_flight=new Flight();
	}
	void set_flight(String flight)
	{
		String[] parts=flight.split(",");
		passenger_flight.setFlight_code(parts[0]);
		passenger_flight.setOrigin(parts[1]);
		passenger_flight.setDestination(parts[2]);
		passenger_flight.setDeptime(parts[3]);
		passenger_flight.setday(parts[4]);
		passenger_flight.setDuration(Integer.parseInt(parts[5]));
		passenger_flight.setDate(Integer.parseInt(parts[6]));
		passenger_flight.setPlane_code(parts[8]);
	}
	//Setter
	public void setName(String name) {
		Name=name;
	}
	//Setter
	public void setAddress(String address) {
		Address=address;
	}
	//Setter
	public void setGender(char gender) {
		Gender=gender;
	}	
	//Setter
	public void setAge(int age) {
		Age=age;
	}
	//Setter
	public void setPassport_no(int passportno) {
		passport_no=passportno;
	}
	public Flight get_Pflight()
	{
		return passenger_flight;
	}
	public String getName() {
		return this.Name;
	}
	//Setter
	public String getAddress() {
		return Address;
	}
	//Setter
	public char getGender() {
		return Gender;
	}	
	//Setter
	public int getAge() {
		return Age;
	}
	//Setter
	public int getPassport_no() {
		return passport_no;
	}
	
}

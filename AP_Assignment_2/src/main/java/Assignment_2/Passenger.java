package Assignment_2;

public class Passenger {

	private static int choice;//Passenger's chosen number from menu will store in it.
	private String Name;
	private int Gender;
	private int age;
	private String Address;
	private int[] passport_no;
	private int plane_type;
	
	
	//parameterized
	Passenger(int choice)
	{
		this.choice=choice;
	}
	//Getter
	public static int getChoice() {
		return choice;
	}
	//Setter
	public static void setChoice(int choice) {
		Passenger.choice = choice;
	}
	
}

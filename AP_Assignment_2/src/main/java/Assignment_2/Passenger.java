package Assignment_2;

public class Passenger {

	private static int choice;//Passenger's chosen number from menu will store in it.
	private String Name;
	private char Gender;
	private int Age;
	private String Address;
	private int passport_no;//9 digit number
	
	
	
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
	public void display()
	{
		System.out.print("Name "+this.Name);
		System.out.println("choice "+this.choice);
		System.out.println("Gender "+this.Gender);
		System.out.println("Age "+this.Age);
		System.out.println("Address "+this.Address);
		System.out.println("Passport "+this.passport_no);
	}
	
}

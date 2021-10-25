package Assignment_2;

import java.io.*;
import java.util.*;

public class Reservation {
	private int no_of_passengers;
	//Composition between Reservation
	//Aggregation passenger
	private Passenger passenger;
	private final list<String> passengers_details=new list<String>();//use this list to store data in and write this data from file
	private final Airline AL;
	
	//Parameterized constructor
	Reservation()	
	{
		this.passenger =new Passenger();
		this.AL=new Airline();
	}
	Airline get_AL()
	{
		return this.AL;
	}
	void set_Passenger(Passenger P)
	{
		this.passenger=P;
	}
	public Passenger get_passenger()
	{
		return this.passenger;
	}
	boolean book_seat()
	{
		this.AL.get_plane().set_plane(this.passenger.get_Pflight().getPlane_code());
		//if(AL.get_plane().reserve_seat()));
		return true;
	}
	void update_database()
	{
		FileWriter FW=null;
		
		try {
			FW = new FileWriter("C:\\Users\\umarm\\git\\repository3\\AP_Assignment_2\\src\\main\\resources\\Reservation.txt");
			BufferedWriter BW=new BufferedWriter(FW);
			String passenger_data=null;
			
			
		}
		catch(Exception e) {
			
		}
	}
	
}

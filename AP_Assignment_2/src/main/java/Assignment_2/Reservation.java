package Assignment_2;

import java.io.*;
import java.util.*;

public class Reservation {
	//Composition between Reservation
	//Aggregation passenger
	private Passenger passenger;
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
		//Giving plane code from Flight class to Airplane class
		this.AL.get_plane().set_plane(this.passenger.get_Pflight().getPlane_code());
		//if(AL.get_plane().reserve_seat()));
		if(AL.get_plane().reserve_seat(this.passenger.get_Pflight().getPlane_class()))
			return true;
		else 
			return false;
	}
	void update_database()
	{
		FileWriter FW=null;
		
		try {
			FW = new FileWriter("C:\\Users\\umarm\\git\\repository3\\AP_Assignment_2\\src\\main\\resources\\Reservation.txt");

			list<String> passenger_data=new list<String>();
			passenger_data.add(this.passenger.getName());
			passenger_data.add(Integer.toString(this.passenger.getPassport_no()));
			passenger_data.add(this.passenger.getAddress());
			passenger_data.add(Integer.toString(this.passenger.getAge()));
			passenger_data.add(Character.toString(this.passenger.getGender()));
			passenger_data.add(this.passenger.get_Pflight().getPlane_code());
			passenger_data.add(this.passenger.get_Pflight().getPlane_class());
			passenger_data.add(this.passenger.get_Pflight().get_des());
			passenger_data.add(this.passenger.get_Pflight().get_org());
			passenger_data.add(this.passenger.get_Pflight().get_deptime());
			passenger_data.add(Integer.toString(this.passenger.get_Pflight().get_date()));
			String aline=null;
			//Now writing in file
			for(int i=0; i<passenger_data.length(); ++i)
			{	
				aline=passenger_data.get(i);
				FW.write(aline);
				FW.write(",");
				
				
			}
			FW.write("\n");
			FW.close();
		}
		catch(Exception e) {
			//System.out.println("An Error occured.");
		}
	}
	
}

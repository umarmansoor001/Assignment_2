package Assignment_2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

//Driver class
public class Main {

	
	static void booking_operation(Airline AL)
	{
		//After that take destination and Origin
		String origin="",destination="";
		origin=Display.take_Origin();//input from user
		destination=Display.take_Destination();//input from user
		//Verifying if Flight available
		if(AL.get_FS().check_flight(origin,destination))//If true then this piece will execute
		{
			list<String> desired_Flights=new list<String>();
			AL.get_FS().fetch_flight(origin,destination,desired_Flights);//We get desired flights of user choice from flight schedule
			//Now customer have to choose their desired flight
			System.out.print(Display.take_desiredflight(desired_Flights));
			
			//for(int i=0; i<desired_Flights.length(); ++i)
				//System.out.println(desired_Flights.get(i));
		}
		else//If flight not found then again take destination and origin 
		{
			//Recursively call this function again 
			booking_operation(AL);
		}
	}
	public static void take_passenger_data(Passenger P)
	{
		//Calling function of Display class
		Display.Input_Name_prompt(P);
		Display.Input_Address_prompt(P);
		Display.Input_Age_prompt(P);
		Display.Input_Gender_prompt(P);
		Display.Input_passportno_prompt(P);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d=new Display();
		d.Greetings();
		d.Flight_Menu();
		
		//take_passenger_data(P1);
		//P1.display();
		//Reservation R=new Reservation();
		//Display.Input_Flight(R.flight);
		
		Airline AL=new Airline();
		AL.get_FS().create_schedule();
		Passenger P1=new Passenger(Display.take_choice());
		booking_operation(AL);
	}
	
}

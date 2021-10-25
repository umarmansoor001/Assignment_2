package Assignment_2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

//Driver class
public class Main {

	
	public static String booking_operation(Airline AL,Reservation R)
	{
		//After that take destination and Origin
		String origin="",destination="";
		String Choosen_flight=null;
		origin=Display.take_Origin();//input from user through function
		destination=Display.take_Destination();//input from user
		//Verifying if Flight available
		if(AL.get_FS().check_flight(origin,destination))//If true then this piece will execute
		{
			list<String> desired_Flights=new list<String>();
			AL.get_FS().fetch_flight(origin,destination,desired_Flights);//We get desired flights of user choice from flight schedule
			//Now customer have to choose their desired flight
			int choice=(Display.take_desiredflight(desired_Flights));
			Choosen_flight=desired_Flights.get(choice-1);
			//Setting plane class for passenger
			int plane_type=Display.take_planetype(Choosen_flight);
			R.get_passenger().get_Pflight().setPlane_class(plane_type);
			String[] parts=Choosen_flight.split(",");
			
			if(plane_type==1)
				R.get_passenger().get_Pflight().set_fare(Integer.parseInt(parts[7]));
			else if(plane_type==2)
				R.get_passenger().get_Pflight().set_fare(Integer.parseInt(parts[7])+5000);
			else if(plane_type==3)
				R.get_passenger().get_Pflight().set_fare(Integer.parseInt(parts[7])+8000);
		}
		else//If flight not found then again take destination and origin 
		{
			//Recursively call this function again 
			booking_operation(AL,R);
		}
		return (Choosen_flight);
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
		//
		//Display.Input_Flight(R.flight);
		Reservation R=new Reservation();
		//Airline AL=new Airline();
		R.get_AL().get_FS().create_schedule();
		Display.take_choice();
		Passenger P=new Passenger();
		P.set_flight(booking_operation(R.get_AL(),R));
		take_passenger_data(P);
		R.set_Passenger(P);
		R.update_database();
		d.display_ticket(P);
	}
	
}

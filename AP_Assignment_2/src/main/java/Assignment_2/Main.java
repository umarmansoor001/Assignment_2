package Assignment_2;

import java.util.*;

//Driver class
public class Main {

	
	
	public static void take_passenger_data(Passenger P)
	{
		//Calling function of Display class
		Display.Display_operation(P.getChoice());
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
		Passenger P1=new Passenger(Display.take_choice());
		//take_passenger_data(P1);
		//P1.display();
		//Reservation R=new Reservation();
		//Display.Input_Flight(R.flight);
		Airline AL=new Airline();
		AL.create_schedule();
		AL.view_FlightSchedule();
		
	}
	
}

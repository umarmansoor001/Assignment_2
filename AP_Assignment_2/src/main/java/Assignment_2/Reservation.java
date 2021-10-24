package Assignment_2;

import java.io.*;
import java.util.*;

public class Reservation {
	private int no_of_passengers;
	//Composition between Reservation and passenger
	private final List<Passenger> passenger;//List built-in data structure of Passenger class objects
	private final Airline AL;
	
	//Parameterized constructor
	Reservation()	
	{
		this.passenger = null;
		this.AL=new Airline();
	}
	Airline get_AL()
	{
		return this.AL;
	}
	
	
}

package Assignment_2;

import java.io.*;
import java.util.*;

public class Airline {
	String Name;
	static List<Flight_Schedule> flight_sch;
	
	Airline()
	{
		flight_sch=new LinkedList<Flight_Schedule>();
	}
	
	void create_schedule() {
	try {
		Flight_Schedule.create_sch(flight_sch);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}

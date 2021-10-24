package Assignment_2;

import java.io.*;
import java.util.*;

public class Airline {
	String Name;
	//Composition
	//Flight Schedule is a part of Airline
	private static final Flight_Schedule FS = new Flight_Schedule();
	
	Airline()
	{
		//Setting Airline name 
		Name="NUCS";	
	}
	Flight_Schedule get_FS()
	{
		return this.FS;
	}
	void create_schedule()
	{
		//Create flight schedule after reading file
		FS.create_schedule();
	}
	boolean check_flight(String des,String ori)
	{
		return (FS.check_flight(des, ori));
	}
}

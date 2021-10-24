package Assignment_2;

import java.io.*;
import java.util.*;

public class Airline {
	String Name;
	//Composition
	//Flight Schedule is a part of Airline
	private static final Flight_Schedule FS = new Flight_Schedule();
	//AirPlane is part of Airline
	private static final Airplane plane = new Airplane();
	Airline()
	{
		//Setting Airline name 
		Name="NUCS";	
	}
	Flight_Schedule get_FS()
	{
		return this.FS;
	}
}

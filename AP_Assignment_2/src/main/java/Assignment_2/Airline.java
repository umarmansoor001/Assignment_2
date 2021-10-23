package Assignment_2;

import java.io.*;
import java.util.*;

public class Airline {
	String Name;
	static list<String> flight_sch;//LinkedList to store Flight details
	
	Airline()
	{
		//Setting Airline name 
		Name="NUCS";
		//creating flight schedule linked list
		flight_sch=new list<String>();
	}
	
	void create_schedule() {
		//storing data in linked list after reading file
			FileReader FS_in=null;//File Reader
			try {
				//giving file path
				FS_in=new FileReader("C:\\Users\\umarm\\git\\repository3\\AP_Assignment_2\\src\\main\\resources\\Flights.txt");
				//Reading through buffer
				BufferedReader br=new BufferedReader(FS_in);
				String aLine=null;
				aLine=br.readLine();//Ignoring the first line as it contains columns names
				while((aLine=br.readLine())!=null )
				{
					flight_sch.add(aLine);//Adding in linked list
				}
				
				//closing file at end
				FS_in.close();
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	boolean check_flight(String des,String ori)
	{
		//Splitting the string by delimiter ','
		String[] words=null;
		String a_flight="";
		for(int i=0; i<this.flight_sch.length(); ++i)
		{
			try {
				a_flight=this.flight_sch.get(i);
				//Splitting the string by delimiter ',' 
				words=a_flight.split(",");//And storing in words array
				if(words[1]==des && words[2]==ori)
					return true;
				else
					return false;
			}
			catch(Exception e)
			{
				System.out.println("Flight not set");
			}
		}
		return false;
	}
	void view_FlightSchedule()
	{
		//It will print All Flights data
		for(int i=0;i<flight_sch.length();i++)
		{
			System.out.println(flight_sch.get(i));
		}
		}
}

package Assignment_2;

import java.io.*;
import java.util.*;

//Service layer

public class Flight_Schedule {
	//Creating linkedlist of flights schedule
	list<String>flight_sch; 
	
	Flight_Schedule()
	{
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
	
	//Check user entered destination and origin in flight schedule
	boolean check_flight(String ori,String des)
	{
		//Splitting the string by delimiter ','
		String[] words=null;//Parts of flights store in this string array
		String a_flight="";
		for(int i=0; i<this.flight_sch.length(); ++i)//Iterate linked list to end to check all flights
		{
			try {
				a_flight=this.flight_sch.get(i);//Getting string from Linked List
				//Splitting the string by delimiter ',' 
				words=a_flight.split(",");//And storing in words array
				if(ori.equals(words[1]) && des.equals(words[2]))//1 and 2 index have origin and destination
					return true;
				else if(i+1==flight_sch.length())//if last values in linked list also not get matched then throw exception
					throw new Exception();
			}
			catch(Exception e)
			{
				System.out.println(" -------------------------------");
				System.out.println("|	Flight not Found	|");
				System.out.println(" -------------------------------\n");
			}
		}
		return false;
	}
	void fetch_flight(String ori,String des,list<String> Respective_flights)
	{
		//Respective_flights => All matched flights will store in this linked list
		//Splitting the string by delimiter ','
		String[] words=null;//Parts of flights store in this string array
		//list<String> 
		String a_flight="";
		for(int i=0; i<this.flight_sch.length(); ++i)//Iterate linked list to end to check all flights
		{
			a_flight=this.flight_sch.get(i);//Getting string from Linked List
			//Splitting the string by delimiter ',' 
			words=a_flight.split(",");//And storing in words array
			if(ori.equals(words[1]) && des.equals(words[2]))//1 and 2 index have origin and destination
				Respective_flights.add(a_flight);
		}
	}

}

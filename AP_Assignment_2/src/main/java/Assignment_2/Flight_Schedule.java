package Assignment_2;

import java.io.*;
import java.util.*;

//Service layer

public class Flight_Schedule {
	public static String flight_code;
	static String destination;
	static String origin;
	static float duration;
	static int date;
	static String day;
	static int fare;
	static String dep_time;
	static String plane_code;
	
	Flight_Schedule()
	{
		flight_code="\0";
		destination="\0";
		origin="\0";
		duration=0;
		date=0;
		day="";
		fare=0;
		dep_time="\0";
		plane_code="\0";
	}
	static void create_sch(list<Flight_Schedule> fs) throws Exception
	{
		FileReader FS_in=null;
		try {
			FS_in=new FileReader("C:\\Users\\umarm\\git\\repository3\\AP_Assignment_2\\src\\main\\resources\\Flights.txt");
			BufferedReader br=new BufferedReader(FS_in);
			String aLine=null;
			aLine=br.readLine();//Ignoring the first line as it contains columns names
			int i=0;
			while((aLine=br.readLine())!=null )
			{
				//System.out.println(aLine);
				Flight_Schedule FS=new Flight_Schedule();
				FS.make_sch(aLine);
				FS.display();
				fs.add(FS);//Adding in linked list
				FS=null;
				i++;
			}
			
			//closing file at end
			FS_in.close();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	 void make_sch(String flight_details)
	{
		//Splitting the string by delimiter ','
		String[] words=flight_details.split(",");
		//Assigning values to variables
		this.flight_code=words[0];
		this.destination=words[1];
		this.origin=words[2];
		this.dep_time=words[3];
		this.day=words[4];
		this.duration=Integer.parseInt(words[5]);//Converting string to float
		this.date=Integer.parseInt(words[6]);
		this.fare=Integer.parseInt(words[7]);
		this.plane_code=words[8];
	}
	void display()
	{
		System.out.print(this.flight_code+" ");
		System.out.print(this.destination+" ");
		System.out.print(this.origin+" ");
		System.out.print(this.dep_time+" ");
		System.out.print(duration+" ");
		System.out.print(fare+" ");
		System.out.print(plane_code+" ");
		System.out.print(date+" ");
		System.out.println();
	}
}

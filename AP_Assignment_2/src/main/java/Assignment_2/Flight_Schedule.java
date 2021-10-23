package Assignment_2;

import java.io.*;
import java.util.*;

//Service layer

public class Flight_Schedule {
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
		destination="\0";
		origin="\0";
		duration=0;
		date=0;
		day="";
		fare=0;
		dep_time="\0";
		plane_code="\0";
	}
	static void create_sch(List<Flight_Schedule> fs) throws Exception
	{
		FileReader FS_in=null;
		try {
			FS_in=new FileReader("C:\\Users\\umarm\\git\\repository3\\AP_Assignment_2\\src\\main\\resources\\Flights.txt");
			BufferedReader br=new BufferedReader(FS_in);
			String aLine=null;
			aLine=br.readLine();//Ignoring the first line as it contains columns names
			int i=0;
			while((aLine=br.readLine())!=null)
			{
				//System.out.println(aLine);
				Flight_Schedule FS=new Flight_Schedule();
				FS.make_sch(aLine);
				//FS.display();
				fs.add(i,FS);//Adding in linked list
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
		this.destination=words[0];
		this.origin=words[1];
		this.dep_time=words[2];
		this.day=words[3];
		this.duration=Integer.parseInt(words[4]);//Converting string to float
		this.date=Integer.parseInt(words[5]);
		this.fare=Integer.parseInt(words[6]);
		this.plane_code=words[7];
	}
	void display()
	{
		System.out.println(this.destination);
		System.out.println(this.origin);
		System.out.println(this.dep_time);
		System.out.println(duration);
		System.out.println(fare);
		System.out.println(plane_code);
		System.out.println(date);
	}
}

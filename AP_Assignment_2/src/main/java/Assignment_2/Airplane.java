package Assignment_2;

import java.io.BufferedReader;
import java.io.FileReader;

// Service layer
public class Airplane {

	private list<String> Air_Plane;
	private String Plane_code;
	private int total_seats;
	private int bussinessclass_seats;
	private int economyclass_seats;
	private int firstclass_seats;
	private int available_seats;
	
	Airplane()
	{
		Air_Plane=new list<String>();
		Plane_code="";
		total_seats=0;
		bussinessclass_seats=0;
		economyclass_seats=0;
		firstclass_seats=0;
		available_seats=0;
	}
	void set_Airplane()
	{
		//storing data in linked list after reading file
		FileReader FS_in=null;//File Reader
		try {
			//giving file path
			FS_in=new FileReader("C:\\Users\\umarm\\git\\repository3\\AP_Assignment_2\\src\\main\\resources\\Airplane.txt");
			//Reading through buffer
			BufferedReader br=new BufferedReader(FS_in);
			String aLine=null;
			aLine=br.readLine();//Ignoring the first line as it contains columns names
			while((aLine=br.readLine())!=null )
			{
				Air_Plane.add(aLine);//Adding in linked list
			}
			
			//closing file at end
			FS_in.close();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

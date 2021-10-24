package Assignment_2;

import java.util.*;

//Presentation layer / User Interface

public class Display  {

	static void Greetings()
	{
		System.out.println("\t******************************************************");
		System.out.println("\t***      Welcome to Flight Reservation System      ***");
		System.out.println("\t******************************************************\n");
		
	}
	static void Flight_Menu()
	{
		System.out.println("Choose an option and enter the respective number:-\n");
		System.out.println("Press 1\tTO Book a Flight");
		System.out.println("Press 2\tTO Search for Flight Schedule");
		System.out.println("Press 3\tTO Check My Bookings");
		System.out.println("Press 4\tTO View Flight Schedules");
		System.out.println("Press 5\tTO Exit");
	}
	static void Invalid_prompt()
	{
		System.out.println("******** Invalid Input *******");
		System.out.print("Again Enter:- ");
	}
	public static int take_choice() 
	{
		int choice=0;
		Scanner input=new Scanner(System.in);
		do {
			try {
				choice=input.nextInt(); 
				if(choice<1 || choice>5)
					throw new Exception();
			}
			catch(Exception e)
			{
				Display.Invalid_prompt();
				input=new Scanner(System.in);
			}
		}while(choice<1 || choice>5);
		Display_operation(choice);
		return choice;
	}
	static void Display_operation(int choice)
	{
		if(choice==1)
		{
			System.out.println("\t*************************************************");
			System.out.println("\t***           B O O K   F L I G H T           ***");
			System.out.println("\t*************************************************\n");
		}
			
	}
	//Take user destination
	static String take_Destination()
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Destination Airport:- ");
		return (input.nextLine());
	}
	//Take user Departure 
	static String take_Origin()
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Departure Airport:- ");
		return input.nextLine();
	}
	static int take_desiredflight(list<String> desired_flight)
	{
		System.out.println();
		System.out.println("\t*************************************************");
		System.out.println("\t***        Choose Your Desired Flight         ***");
		System.out.println("\t*************************************************\n");
		System.out.println("		Departure Destination Departure-Time Day Duration Date Fare(Economy)");
		String[] words=null;
		for(int i=0; i<desired_flight.length(); ++i)
		{
			words=desired_flight.get(i).split(",");
			System.out.print("Enter "+(i+1)+" For	");
			System.out.println(words[1]+"	 "+words[2]+"	"+words[3]+"	"+words[4]+"    "+words[5]+"	"+words[6]+"	"+words[7]);
		}
		System.out.print("Enter Your Choice:- ");
		int choice=0;
		Scanner input=new Scanner(System.in);
		do {
			try {
				choice=input.nextInt(); 
				if(choice<1 || choice>desired_flight.length())
					throw new Exception();
			}
			catch(Exception e)
			{
				Display.Invalid_prompt();
				input=new Scanner(System.in);
			}
		}while(choice<1 || choice>desired_flight.length());
		
		return choice;
	}
	static void take_planetype(String flight)
	{
		//Implement it later
		final int Bussiness_class=5000;
		String[] parts=flight.split(",");
		System.out.print("For Bussiness Class : Fare = "+Integer.parseInt(parts[7])+Bussiness_class);//in 7th index fare is stored
		System.out.print("Enter Your Choice:- ");
	}
	static void Input_Name_prompt(Passenger P)
	{
		System.out.print("Enter Your Name:- ");
		Scanner input=new Scanner(System.in);
		P.setName(input.nextLine());
	}
	static void Input_Age_prompt(Passenger P)
	{
		System.out.print("Enter Your Age:- ");
		Scanner input=new Scanner(System.in);
		int age=0;
		//Validation conditions
		do {
			try {
				age=input.nextInt(); 
				if(age<18 || age>90)	//Age limits
					throw new Exception();
			}
			catch(Exception e)
			{
				Display.Invalid_prompt();
				input=new Scanner(System.in);
			}
		}while(age<18 || age>90);
		P.setAge(age);
	}
	static void Input_Address_prompt(Passenger P)
	{
		System.out.print("Enter Your Current Address:- ");
		Scanner input=new Scanner(System.in);
		P.setAddress(input.nextLine());
	}
	static void Input_Gender_prompt(Passenger P)
	{
		System.out.println("Choose An option:- \n"+"1. MALE \t"+"2. FEMALE"+"\t3. Other");
		System.out.print("Enter your choice:- ");
		Scanner input=new Scanner(System.in);
		//P.set(input.nextInt());
		int choice=0;
		do {
			try {
				choice=input.nextInt(); 
				if(choice<1 || choice>3)
					throw new Exception();
			}
			catch(Exception e)
			{
				Display.Invalid_prompt();
				input=new Scanner(System.in);
			}
		}while(choice<1 || choice>3);
		if(choice==1)
			P.setGender('M');//Male
		else if(choice==2)
			P.setGender('F');//Female
		else
			P.setGender('O');//Other
	}
	static void Input_passportno_prompt(Passenger P)
	{
		System.out.print("Enter Your 9 digits Passport Number:- ");
		Scanner input=new Scanner(System.in);
		int p_no=0;
		//Validation conditions
		do {
			try {
				p_no=input.nextInt(); 
				if(p_no<100000000 || p_no>999999999)	//Passport num limits
					throw new Exception();
			}
			catch(Exception e)
			{
				Display.Invalid_prompt();
				input=new Scanner(System.in);
			}
		}while(p_no<100000000 || p_no>999999999);
		P.setPassport_no(p_no);
	}

}

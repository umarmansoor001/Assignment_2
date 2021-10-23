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
	public static int take_choice(Airline AL) 
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
		Display_operation(choice,AL);
		return choice;
	}
	static void Display_operation(int choice,Airline AL)
	{
		if(choice==1)
		{
			System.out.println("\t*************************************************");
			System.out.println("\t***           B O O K   F L I G H T           ***");
			System.out.println("\t*************************************************\n");
			
			//After that take destination and Origin
			String origin="",destination="";
			//Taking Destination and origin
			Scanner input=new Scanner(System.in);
			System.out.print("Enter Destination Airport:- ");
			destination=input.nextLine();
			System.out.print("Enter Departure Airport:- ");
			origin=input.nextLine();
			//Verifying if Flight available
			System.out.print(AL.check_flight(destination, origin));
		}
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
	//Flight info input
	static void Input_Flight(Flight F)
	{
		//Destination
		System.out.print("Enter Destination:- ");
		Scanner input=new Scanner(System.in);
		F.setDestination(input.nextLine());
		//Origin
		System.out.print("Enter Origin:- ");
		F.setOrigin(input.nextLine());
		//Date of Flight
		System.out.print("Enter Date:- ");
		F.setDate(input.nextShort());
	}
}

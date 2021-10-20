package Assignment_2;

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
	}
	static void Invalid_prompt()
	{
		System.out.println("******** Invalid Input *******");
		System.out.print("Again Enter:- ");
	}
	static void Display_operation(int choice)
	{
		if(choice==1)
		{
			System.out.println("\t*************************************************");
			System.out.println("\t***			B O O K   F L I G H T			***");
			System.out.println("\t*************************************************\n");

		}
	}
	static void Input_Name_prompt()
	{
		System.out.print("Enter Your Name:- ");
	}
	static void Input_Age_prompt()
	{
		System.out.print("Enter Your Age:- ");
	}
	static void Input_Address_prompt()
	{
		System.out.print("Enter Your Current Address:- ");
	}
	static void Input_Gender_prompt()
	{
		System.out.println("Choose an option:- \n"+"1. MALE\t"+"2.FEMALE\t"+"3.Other");
		System.out.print("Enter your choice:- ");
	}
	static void Input_passportno_prompt()
	{
		System.out.print("Enter Your Passport Number:- ");
	}
}

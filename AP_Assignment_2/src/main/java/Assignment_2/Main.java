package Assignment_2;

import java.util.*;

//Driver class
public class Main {

	public static int take_choice()
	{
		int choice=0;
		Scanner input=new Scanner(System.in);
		do {
			try {
				choice=input.nextInt(); 
				if(choice<1 || choice>4)
					throw new Exception();
			}
			catch(Exception e)
			{
				Display.Invalid_prompt();
				input=new Scanner(System.in);
			}
		}while(choice<1 || choice>4);
		return choice;
	}
	
	public static void take_passenger_data()
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d=new Display();
		d.Greetings();
		d.Flight_Menu();
		Passenger P1=new Passenger(Main.take_choice());
	}

}

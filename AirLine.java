package exercise;
import java.util.Scanner;
public class AirLine {
	public static void main(String[] args) {
		 //public static void main(String[] args){

	         boolean [] seating = new boolean [11]; // Creates a one deminsional array
	         Scanner input = new Scanner(System.in);

	         System.out.println("Please type 1 for First Class or 2 for Economy: "); // Asks the user to give input

	         int section = input.nextInt(); // Store user's input

	         if (section == 1) // If the user inputs 1 for First class, then First Class object is called
	         {
	             firstClassSeat();
	         }

	         else // If the user inputs 2 for Economy, then Economy object is called
	         {
	             economySeat();
	         }

	     }

	     public static void firstClassSeat(){

	         boolean [] seating = new boolean [11]; // Creates a new array
	         Scanner input = new Scanner(System.in);

	         for (int count = 1; count <= 5; count++){ // Starts the loop for First Class object

	         if (seating[count] == false)
	         {

	             seating[count] = true; // Assigns passenger a seat in first class
	             System.out.printf("First Class. Seat number: %d\n", count);
	             break;
	         }

	         else if (seating[5] == true)
	         {

	         if (seating[10] == true) // If the psasenger does not decide to down grade to Economy, then the program prompts the passenger when the next flight is 
	         {
	             System.out.println("Sorry, the flight is fully booked. Next flight leaves in 3 hours.");
	         }

	         else // if the passenger chooses to be down graded to Economy, then the program assigns the passenger a seat in Economy
	         {
	             System.out.println("First class is fully booked. Would you like a seat in Economy? Type 1 for yes or 2 for No: ");
	             int choice = input.nextInt();
	             if (choice == 1)
	             {
	                 economySeat();
	             }

	             else // If flight is full, then the program tells the passenger when the next flight is
	             {
	                 System.out.println("Next flight is in 3 hours.");
	             }

	         }

	         }

	     }

	     }

	     public static void economySeat(){

	         boolean [] seating = new boolean [11]; // Creates a new array
	         Scanner input = new Scanner(System.in);

	         for (int count = 6; count <= 10; count++) // Starts the loop for Economy object

	             if (seating[count] == false)
	             {
	                 seating[count] = true; // Assigns passenger a seat in Economy
	                 System.out.printf("Economy. Seat number: %d\n", count);
	                 break;
	             }

	             else if (seating[10]  == true)
	             {
	                 if (seating[5] == true) // If the paasenger does not decide to up grade to First Class, then the program prompts the passenger when the next flight is
	                 {
	                     System.out.println("Sorry, flight is fully booked. Next flight is in 3 hours.");
	                 }

	                 else // if the passenger chooses to be up graded to First Class, then the program assigns the passenger a seat in First Class
	                 {
	                     System.out.println("Economy is fully booked. Would you like a seat in First Class? Type 1 for Yes or 2 for No: ");
	                     int choice = input.nextInt();

	                     if (choice == 1)
	                     {
	                         firstClassSeat();
	                     }

	                     else
	                     {
	                         System.out.println("Next flight is in 3 hours."); // If flight is full, then the program tells the passenger when the next flight is
	                     }

	                }

	             }


	     }

	
	}


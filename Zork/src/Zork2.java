import java.util.Scanner;

public class Zork2 
{
	
	public static void main(String[] args)
	{
		int input; //Create the variable that will hold the user's input
		String room;
		room = "foyer";
		input = 1;
		
		Scanner keyboard = new Scanner(System.in); //Create the scanner 'keyboard' that will prompt for user input
		
		System.out.println("ZORK");
		System.out.println("");
		
		System.out.println("Note: You may press 0 at any point to exit the game.");
		System.out.println("");
		System.out.println("");
		
		do
		{
			if (room.equals("foyer"))
			{
				System.out.println("You are standing in the foyer of an old house.");
				System.out.println("You see a dead scorption.");
				System.out.println("{You can (1) exit to the north}");
			
				input = keyboard.nextInt();
				
				if (input == 1) room = "front room";
				
			}
			
			if (room.equals("front room"))
			{
				System.out.println("You are standing in the front room of an old house.");
				System.out.println("You see a piano.");
				System.out.println("{You can (1) exit to the south, (2) exit to the west, (3) exit to the east}");
			
				input = keyboard.nextInt();
				
				if (input == 1) room = "foyer";
				
				else if (input == 2) room = "library";
				
				else if (input == 3) room = "kitchen";
					
			}
			
			if (room.equals("library"))
			{
				System.out.println("You are standing in a library.");
				System.out.println("You see spiders.");
				System.out.println("{You can (1) exit to the east, (2) exit to the north}");
			
				input = keyboard.nextInt();
				
				if (input == 1) room = "front room";
				
				else if (input == 2) room = "dinning room";
			}
			
			if (room.equals("kitchen"))
			{
				System.out.println("You are standing in a kitchen.");
				System.out.println("You see bats.");
				System.out.println("{You can (1) exit to the west, (2) exit to the north}");
			
				input = keyboard.nextInt();
				
				if (input == 1) room = "front room";
				
				else if (input == 2) room = "parlor";
			}
			
			if (room.equals("dining room"))
			{
				System.out.println("You are standing in a dining room.");
				System.out.println("You see dust and an empty box.");
				System.out.println("{You can (1) exit to the south}");
			
				input = keyboard.nextInt();
				
				if (input == 1) room = "library";
			}
			
			if (room.equals("vault"))
			{
				System.out.println("You are standing in a vault.");
				System.out.println("You see 3 walking skeletons.");
				System.out.println("{You can (1) exit to the east}");
			
				input = keyboard.nextInt();
				
				if (input == 1) room = "parlor";
				
			}
			if (room.equals("parlor"))
			{
				System.out.println("You are standing in a parlor.");
				System.out.println("You see a treasure chest.");
				System.out.println("{You can (1) exit to the west, (2) exit to the south}");
			
				input = keyboard.nextInt();
				
				if (input == 1) room = "vault";
				
				else if (input == 2) room = "kitchen";
			}
			
			
		} while (input != 0);
		
		System.out.println("You have exited.");
		keyboard.close();
	}
	
	
}
